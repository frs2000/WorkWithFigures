package OopFigure;
import java.util.Random;

public class Square extends Figure { //equilateral square! (a=a)
    private int sideLength ;
    
    public Square (){
        super("Square" , "green"); // type & colour
        Random random = new Random();
        sideLength = (int)(Math.random() *10+ 1);
    }
    
    public int getSideLength(){
        return sideLength ;
    }

    public double areaOfFig(){
        return sideLength*sideLength ;
    }  
}
