package DependencyInversion;

public class Backend implements Developer{
    public void develop(){
        writeJava();
    }

    public void writeJava(){
        System.out.println("Writing Java script");
    }
}
