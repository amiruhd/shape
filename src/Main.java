/**
 * @author AmirHossein
 */
public class Main {
    public static void main(String[] args) {
        
        Shape shape1 = new Shape("Yellow", true);
        Shape shape2 = new Shape("Pink", false);
        Circle circle1 = new Circle(10, "Blue", false);
        Circle circle2 = new Circle(4, "Red", true);
        Rectangle rect1 = new Rectangle(3, 4, "Green", true);
        Rectangle rect2 = new Rectangle(2, 5, "Cyan", false);
        

        System.out.println("Using paint class : ");
        Paint paint = new Paint();
        paint.addCircle(circle1);
        paint.addCircle(circle2);
        paint.addRectangle(rect1);
        paint.addRectangle(rect2);
        paint.printAll();
    }
}
