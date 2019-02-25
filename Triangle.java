package OopFigure;
import java.util.Random;

public class Triangle extends Figure { //equilateral triangle (a = b = c)
    private int sideLength ;
    
    public Triangle (){
        super("Triangle" , "yellow"); // type & colour
        Random random = new Random();
        sideLength = (int)(Math.random() *10+ 1);
    }
    
    public int getSideLength(){
        return sideLength ;
    }

    public double areaOfFig(){
        return (sideLength*sideLength*Math.sqrt(3))/4 ;
    }  
    
}
