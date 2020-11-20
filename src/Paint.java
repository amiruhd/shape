import java.util.ArrayList;

/**
 * it keeps our 2 shapes
 * @author AmirHossein
 */
public class Paint {

    private ArrayList<Circle> circles;
    private ArrayList<Rectangle> rectangles;


    /**
     * makes a new paint
     */
    public Paint (){
        circles = new ArrayList<>();
        rectangles = new ArrayList<>();
    }


    /**
     * adds a new circle to circles list
     * @param circle we want to add
     */
    public void addCircle (Circle circle){
        circles.add(circle);
    }

    /**
     * adds a new rectangle to rectangles list
     * @param rectangle we want to add
     */
    public void addRectangle (Rectangle rectangle){
        rectangles.add(rectangle);
    }



    /**
     * calls shapes toString method
     */
    public void printAll (){
        for (Circle circle : circles){
            System.out.println( circle.toString() );
        }
        for (Rectangle rectangle : rectangles){
            System.out.println( rectangle.toString() );
        }


    }

}