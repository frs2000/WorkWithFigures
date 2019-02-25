package OopFigure;
import java.util.ArrayList;
import java.util.Random;

public class TaskImplementation {
    private int numbOfTrap, numbOfTriangle, numbOfSquare, numbOfCircle ;
    private ArrayList<Object> figures ;
    
    public TaskImplementation(){
        figures = new ArrayList<>();
        createFifuresAndAddToArrey();
        printArrayList();
    }
    
    private void createFifuresAndAddToArrey(){
        Random random = new Random();
        int numbOfCircle = (int)(Math.random() *5+ 1);
        for(int i = 0 ; i<numbOfCircle ; i++){
           figures.add(new Circle());
        }
        int numbOfSquare = (int)(Math.random() *5+ 1);
        for(int i = 0 ; i<numbOfSquare ; i++){
           figures.add(new Square());
        }
        int numbOfTriangle = (int)(Math.random() *5+ 1);
        for(int i = 0 ; i<numbOfTriangle ; i++){
           figures.add(new Triangle());
        }
        int numbOfTrap = (int)(Math.random() *5+ 1);
        for(int i = 0 ; i<numbOfTrap ; i++){
           figures.add(new Trapezium());
        }
        System.out.println("Was created " +numbOfCircle + " circle.");
        System.out.println("Was created " +numbOfSquare + " square.");
        System.out.println("Was created " +numbOfTriangle + " triangle.");
        System.out.println("Was created " +numbOfTrap + " trapezium.");
        System.out.println("Number of created figures =  " + figures.size());
        System.out.println("-----------------------");
    }
    
    private void printArrayList(){
        int numb = 0;
        for (int i = 0 ; i<figures.size(); i++){
            numb = numb + 1;
            if (figures.get(i) instanceof Circle) {
                Circle temp = (Circle)figures.get(i) ;
                System.out.println(" Object №" + numb +  
                        " | Figure = " + temp.getType() +
                        " | Colour = " + temp.getColour() +  
                        //S = figure area (everywhere)
                        " | S = " +  Math.floor(temp.areaOfFig()*100) / 100 +
                        " (radius = "+ temp.getRadius()+" )" );               
            }
            if (figures.get(i) instanceof Square) {
                Square temp = (Square)figures.get(i) ;
                System.out.println(" Object №" + numb +  
                        " | Figure = " + temp.getType()+ 
                        " | Colour = " + temp.getColour() + 
                        " | S = " + temp.areaOfFig()+
                        " (length of side = "+ temp.getSideLength()+" )" );        
            }
            if (figures.get(i) instanceof Trapezium) {
                Trapezium temp = (Trapezium)figures.get(i) ;
                System.out.println(" Object №" + numb +  
                        " | Figure = " + temp.getType()+ 
                        " | Colour = " + temp.getColour() + 
                        " | S = " + temp.areaOfFig() +
                        " (a = "+temp.getA()+", b = "+temp.getB()+", h = "+temp.getH()+" )" );    
            }
            if (figures.get(i) instanceof Triangle) {
                Triangle temp = (Triangle)figures.get(i) ;
                System.out.println(" Object №" + numb +  
                        " | Figure = " + temp.getType()+ 
                        " | Colour = " + temp.getColour() +  
                        " | S = " + Math.floor(temp.areaOfFig()*100) / 100 +
                        " (length of side = "+ temp.getSideLength()+" )" );    
            }            
        }
        System.out.println("We printed "+ numb + " figures");
    }
}
