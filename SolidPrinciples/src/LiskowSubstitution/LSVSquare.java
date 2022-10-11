package LiskowSubstitution;

public class LSVSquare extends LSVRectangle{
    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(double width) {
        super.setHeight(width);
        super.setWidth(width);
    }
}
