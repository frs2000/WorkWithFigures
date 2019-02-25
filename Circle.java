package OopFigure;
import java.util.Random;

public class Circle extends Figure {
    private int radius ;
    
    public Circle (){
        super( "Circle" , "red"); // type & colour
        Random random = new Random();
        radius = (int)(Math.random() *10+ 1);
    }
    
    public int getRadius(){
        return radius ;
    }

    public double areaOfFig(){
        return Math.PI*radius*radius ;
    }   
}
