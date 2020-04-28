package traduction;

import noeud.*;
import constante.*;
import symbole.*;
import variable.*;
import expression.*;


import java.util.*;

public class Traduire {
    public static int separeDouble(String str){
        /* reduire la string .substring(0,endDouble) */
        int endDouble=0;
        boolean endLoop = true;
        char currC;

        int taille = str.length();
        for(endDouble = 0; endDouble<taille; endDouble++) {
            currC = str.charAt(endDouble);
            endLoop = Character.isDigit(currC) || currC =='.';
            if(!endLoop) {
                break;
            }
        }
        /* utiliser Double.parseDouble(String) */
        return endDouble;
    }

    public static ArrayList<Integer> trouveChamps(String str){
        int taille = str.length();
        // System.out.println("trouveChamps " + str);
        int nbPara = 0;

        ArrayList<Integer> marques = new ArrayList<Integer>();
        char currC;
        for(int i =0; i< taille; i++) {
            currC =str.charAt(i);
            if(currC == '(') {
                nbPara +=1;
                if(nbPara == 1) {
                    marques.add(i+1);
                }

            }
            else if(currC == ')') {
                nbPara -=1;
                if(nbPara == 0) {
                    marques.add(i);
                    if(marques.size()==4) {
                        // System.out.println("exit " + marques.toString());
                        return marques;

                    }
                }
            }

            else if(currC == ',' && nbPara == 1) {
                marques.add(i-1);
                marques.add(i+1);

            }



            // System.out.println(nbPara);
            // System.out.println("currC = " + currC + " " + marques.toString());
        }

        ArrayList<Integer> x = new ArrayList<Integer>();
        // System.out.println("x = " + x + marques.size());
        return x;
    }

    public static String reecriture(String str){
        /* D'une expression en notation préfixée */
        String traduction ="";
        str = str.replace(" ","");

        // System.out.println("str =" + str);


        int taille = str.length();
        double currNum = 0;
        for(int i =0; i< taille; i++) {
            char currC =str.charAt(i);
            switch(currC) {
                case '(':
                traduction =  traduction + reecriture(str.substring(i+1));
                //System.out.println(traduitExpressions("str substring" +str.substring(i+1)));
                while(currC != ')') {
                    // se mettre au bon caractère après etre sorti d'un autre appel
                    i+=1;
                    currC =str.charAt(i);
                }
                // i+= -1;
                break;
                case ')':
                return traduction +')';

                case '+':

                traduction = "+(" + traduction + ',';
                break;
                case '-':
                traduction = "-(" + traduction + ',';

                break;
                case '*':
                traduction = "*(" + traduction + ',';

                break;
                case '/':
                traduction = "/(" + traduction + ',';

                break;
                case '<':
                i+=1;
                break;

                default:
                if (Character.isDigit(currC) ) {
                    int suite = separeDouble(str);
                    Double constante = Double.parseDouble(str.substring(i,i+suite));
                    //System.out.println(constante + " "+ suite +" "+ str + "   " + str.substring(i,i+suite));
                    i += suite-1;
                    traduction += constante;
                    // System.out.println("Post constante " +traduction);
                }

                else if(Character.isAlphabetic(currC)){
                  String nom = "";
                  int j;
                  j =i;
                  do{
                    nom += currC;
                    j+=1;
                    currC =str.charAt(j);
                  }
                  while( j < taille && Character.isAlphabetic(currC));
                  if (currC == '('){
                    int nbPara = 0;
                    i = j;
                    j += 3;
                    do{
                      j+=1;
                      currC = str.charAt(j);
                      if(currC == '('){
                        nbPara +=1;
                      }
                      else if(currC == ')'){
                        nbPara -=1;
                      }      
                    } 
                  while(currC != ')' || nbPara != 0);

                    
                    traduction+=nom + "(";
                    i=j;
                  
                  }
                  else{
                    traduction +=nom;
                  }
                    //System.out.println("Nom " + nom);
                                    
                }
                break;
            }
        }
        return "erreur";
    }

    public static Noeud traduction(String str){
        /* De notation préfixée à un noeud */

        int taille = str.length();
        //System.out.println("traduction " + str + " " + taille) ;
        
        char currC =str.charAt(0);
        double currNum = 0;
        switch (currC) {
            case '+':
            ArrayList<Integer> xSum = trouveChamps(str);
            Somme sum = new Somme(traduction(str.substring(xSum.get(0),(xSum.get(1)+1))),traduction(str.substring(xSum.get(2),(xSum.get(3)))));
            return sum;

            case '-':
            ArrayList<Integer> xDiff = trouveChamps(str);
            Difference diff  = new Difference(traduction(str.substring(xDiff.get(0),(xDiff.get(1)+1))),traduction(str.substring(xDiff.get(2),(xDiff.get(3)))));
            return diff;

            case '*':
            ArrayList<Integer> xDiv = trouveChamps(str);
            Multiplication mult = new Multiplication(traduction(str.substring(xDiv.get(0),(xDiv.get(1)+1))),traduction(str.substring(xDiv.get(2),(xDiv.get(3)))));
            return mult;

            case '/':
            ArrayList<Integer> xMult = trouveChamps(str);
            Division div = new Division(traduction(str.substring(xMult.get(0),(xMult.get(1)+1))),traduction(str.substring(xMult.get(2),(xMult.get(3)))));
            return div;

            default:
            if (Character.isDigit(currC) ) {
                int suite = separeDouble(str);
                Double constante = Double.parseDouble(str.substring(0,suite));

                Constante cons = new Constante(constante);
                return cons;
            }
            else if(Character.isAlphabetic(currC)){
                  String nom = "";
                  int i = 0;
                  int j = 0;
                  do{
                    currC =str.charAt(j);
                    nom += currC;
                    j+=1;
                  }
                  while( j < taille && Character.isAlphabetic(currC));


                  if (currC == '('){
                    int nbPara = 0;
                    j += 1;
                    i = j;
                    do{
                      j+=1;
                      currC = str.charAt(j);
                      if(currC == '('){
                        nbPara +=1;
                      }
                      else if(currC == ')'){
                        nbPara -=1;
                      }      
                    } 
                  while(currC != ')' || nbPara != 0);
                   // System.out.println("Fonction "  +str.substring(0,i-2) + str.substring(i,j+1));
                    String strF = str.substring(i,j+1);
                    Fonction f = new Fonction(str.substring(0,i-2),Traduire.traduction(strF));
                    return f;
                  
                  }
                  else{
                   // System.out.println("variable " + nom);
                    Variable x = new Variable(nom);
                    return x;
                  }                                    
                }
            break;

        
        }
        Constante a = new Constante(0);
        return a;
    }
}
