package OpenClose;

public class AreaCalculation {
    public double calculateRectangleArea(Rectangle rectangle){
        return rectangle.length * rectangle.width;
    }
    public double calculateCircleArea(Circle circle){
        return (22/7)*circle.radius*circle.radius;
    }
}
