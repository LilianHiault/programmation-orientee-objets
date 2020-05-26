import java.util.* ;

public class Name {
    private final String first ;
    private final String last ;
    public Name(String first, String last) {
        this.first = first ;
        this.last = last ;
    }
    @Override
    public boolean equals(Object o) {
        if ( !(o instanceof Name)) { return false ; }
        Name n = (Name) o ;
        return n.first.equals(first) && n.last.equals(last) ;
    }
    public static void main(String[] args) {
        Set<Name> s = new HashSet<>() ;
        s.add(new Name("Arthur", "Dent")) ;
        System.out.println(s.contains(new Name("Arthur", "Dent"))) ;
        List<Name> l = new ArrayList<>() ;
        l.add(new Name("Arthur", "Dent")) ;
        System.out.println(l.contains(new Name("Arthur", "Dent"))) ;
    }
}
