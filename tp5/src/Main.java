import expression.*;
import noeud.*;
import constante.*;
import variable.*;
import opeFormelles.*;
import operateur.*;
import symbole.*;
import affectation.*;

import java.util.*;

class Main {

  public static int separeDouble(String str){
    /* reduire la string .substring(0,endDouble) */
    int endDouble=0;
    boolean endLoop = true;
    char currC;

      int taille = str.length();
    for(endDouble = 0; endDouble<taille; endDouble++){
      currC = str.charAt(endDouble);
      endLoop = Character.isDigit(currC) || currC =='.';
      if(!endLoop){
        break;
      }
      }
    /* utiliser Double.parseDouble(String) */
    return endDouble;
  }

    public static ArrayList<Integer> trouveChamps(String str){
      int taille = str.length();
      System.out.println("trouveChamps " + str);
      int nbPara = 0;

      ArrayList<Integer> marques = new ArrayList<Integer>(); 
      char currC;
      for(int i =0; i< taille; i++){
          currC =str.charAt(i);
          if(currC == '('){
            nbPara +=1;
            if(nbPara == 1){
              marques.add(i+1);
            }

          }
        else if(currC == ')'){
          nbPara -=1;
          if(nbPara == 0){
            marques.add(i);
            if(marques.size()==4){
            System.out.println("exit " + marques.toString());
              return marques;

              }
            }
          }

          else if(currC == ',' && nbPara == 1){
            marques.add(i-1);
            marques.add(i+1);

          }



          System.out.println(nbPara);
          System.out.println("currC = " + currC + " " + marques.toString());
      }
      
      ArrayList<Integer> x = new ArrayList<Integer>(); 
      System.out.println("x = " + x + marques.size());
      return x;
    }

    public static String reecriture(String str){
        String traduction ="";
        str = str.replace(" ","");
        
        System.out.println("str =" +str);
        

      int taille = str.length();
      double currNum = 0;
      for(int i =0; i< taille; i++){
          char currC =str.charAt(i); 
          switch(currC){
              case '(':
              traduction =  traduction + reecriture(str.substring(i+1));
              //System.out.println(traduitExpressions("str substring" +str.substring(i+1)));
              while(currC != ')'){ // se mettre au bon caractère après etre sorti d'un autre appel
                  i+=1;
                  currC =str.charAt(i);}
                 // i+= -1;
              break;
              case')':
              return traduction +')';

              case'+':
              
              traduction = "+(" + traduction + ',';
              break;
              case'-':
              traduction = "-(" + traduction + ',';
              
              break;
              case'*':
              traduction = "*(" + traduction + ',';
              
              break;
              case'/':
              traduction = "/(" + traduction + ',';
              
              break;
              
              default:
              if (Character.isDigit(currC) ){
                int suite = separeDouble(str);
                Double constante = Double.parseDouble(str.substring(i,i+suite));
                //System.out.println(constante + " "+ suite +" "+ str + "   " + str.substring(i,i+suite));
                i += suite-1;
                traduction += constante;
                System.out.println("Post constante " +traduction);
              }
              break;
          }
      }
      return "erreur";
    }

    public static Noeud traduction(String str){

      char currC =str.charAt(0);
      int taille = str.length();
      double currNum = 0;
      switch (currC){
        case '+' :
        ArrayList<Integer> xSum = trouveChamps(str);
        Somme sum = new Somme(traduction(str.substring(xSum.get(0),(xSum.get(1)))),traduction(str.substring(xSum.get(2),(xSum.get(3)))));
        return sum;

        case '-':
        ArrayList<Integer> xDiff = trouveChamps(str);
        Difference diff  = new Difference(traduction(str.substring(xDiff.get(0),(xDiff.get(1)))),traduction(str.substring(xDiff.get(2),(xDiff.get(3)))));
        return diff;

        case '*':
        ArrayList<Integer> xDiv = trouveChamps(str);
        Multiplication mult = new Multiplication(traduction(str.substring(xDiv.get(0),(xDiv.get(1)))),traduction(str.substring(xDiv.get(2),(xDiv.get(3)))));
        return mult;
        
        case '/':
        ArrayList<Integer> xMult = trouveChamps(str);
        Division div = new Division(traduction(str.substring(xMult.get(0),(xMult.get(1)))),traduction(str.substring(xMult.get(2),(xMult.get(3)))));
        return div;
        
        default:
        if (Character.isDigit(currC) ){
          int suite = separeDouble(str);
          Double constante = Double.parseDouble(str.substring(0,suite));
        
          Constante cons = new Constante(constante);
          return cons;
              }
        break;

      }
      Constante a = new Constante(0);
      return a;
    }



  public static void main(String[] args) {

    Constante n1 = new Constante(1); // 1
    Constante n2 = new Constante(2); // 2
    Somme plus = new Somme(n1, n2); // 3
    Somme plus2 = new Somme(n2, plus); // 3
    Somme plus3 = new Somme(n2, plus2); // 3
    Difference moins = new Difference(n1, plus); // -2
    Multiplication mult = new Multiplication(n2, plus); // 6
    Division div = new Division(mult, moins); // -3

    Fonction f = new Fonction("f", div);
    Expression exp = new Expression(div);
    Expression exp6 = new Expression(div);

    System.out.println(exp.toString());
    System.out.println(exp.resoudre());
    System.out.println(f.toString());

    System.out.println("\nTraducteur\n");


  /*
    String str1 = new String(exp6.toString());

    System.out.println("str 1 = " +str1);
    str1 = str1.substring(1);
    String strtrad = new String(reecriture(str1));
    System.out.println(" strtrad = " + strtrad + "\n");


    Expression exp2 = new Expression(traduction(strtrad));
    System.out.println("exp2 = "+ exp2.toString());
    System.out.println("exp2 = "+ exp2.resoudre());
    
    */
    //System.out.println("trouveChamps " + trouveChamps("(12,+(465,-(65)))").toString());

    Affectation aff = new Affectation();
    aff.addCouple("x", 1.2);
    aff.addCouple("y", 3.0);
    System.out.println(aff.toString());
  }
}
