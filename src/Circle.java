/**
 * @author AmirHossein
 */
public class Circle extends Shape {
    
    private double radius;
    
    public Circle() {
        super();
        this.radius = 0;
    }
    /**
     * makes radius new circle
     * @param r circle's radius
     */
    public Circle(double r) {
        super();
        this.radius = r;
    }
    /**
     * makes radius new circle
     * @param r circle's radius
     */
    public Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.radius = r;
    }
    /**
     * @return radius
     */
    public double getRadius() {
        return this.radius;
    }
    /**
     * @set radius
     */
    public void setRadius(double r) {
        this.radius = r;
    }
    
    public double getArea() {
        return Math.PI*this.radius*this.radius;
    }
    
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }
    
    @Override
    public String toString() {
        return "Circle Shape [Radius = " + this.getRadius() + ", Area = " + this.getArea() + ", Color = " + this.getColor() + ", Filled = " + this.getFilled() + "]";
    }    
}
