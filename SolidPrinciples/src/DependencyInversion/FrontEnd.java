package DependencyInversion;

public class FrontEnd implements Developer{
    public void develop(){
        writeJavascript();
    }

    public void writeJavascript () {
        System.out.println("Writing Javascript");
    }
}
