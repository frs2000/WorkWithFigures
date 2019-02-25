package OopFigure;

import java.util.Random;

public class Trapezium extends Figure {     
    private int a,b,h ;
    
    public Trapezium (){
        super("Trapezium" , "blue"); // type & colour
        Random random = new Random();
        a = (int)(Math.random() *5+ 1);
        b = (int)(Math.random() *10+ 6);
        h = (int)(Math.random() *10+ 1);
    }
    
    public int getA(){
        return a ;
    }
    public int getB(){
        return b ;
    }
    public int getH(){
        return h ;
    }
        
    public double areaOfFig(){ // 1/2(a+b)*h
        return (a+b)*h/2 ;
    }  
    
}
