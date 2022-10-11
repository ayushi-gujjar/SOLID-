package DependencyInversion;

public class ViolationDI {
    private VBackEnd backEndDeveloper = new VBackEnd();
    private VFrontEnd frontEndDeveloper = new VFrontEnd();

    public void implement() {

        backEndDeveloper.writeJava();
        frontEndDeveloper.writeJavaScript();
    }
}
