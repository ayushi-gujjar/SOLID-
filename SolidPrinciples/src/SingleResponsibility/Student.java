package SingleResponsibility;

public class Student {
    private String name;
    private String standard;
    private String percentage;

    public void addStudent() {
        System.out.println("Add student");
    }

    public void calculatePercentage() {
        System.out.println("calculate student percentage");
    }
}
