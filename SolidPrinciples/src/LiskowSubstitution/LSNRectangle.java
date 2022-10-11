package LiskowSubstitution;

public class LSNRectangle {

    private double width;
    private double height;

    public LSNRectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double area(){
        return width*height;
    }
}
