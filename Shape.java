import java.io.*;
import javax.swing.*;

class SquareX
{
        int s; 
        Square(int side)
        {
        System.out.println("Square of side 5 is created");
        s = side;
        }

        void sqArea(){
        System.out.println("The area of Square = "+(s*s));
        }

       
}
class ShapeX{

 public static void main(String[] args)
        {
        Square sq = new Square(5); //constructor
        sq.sqArea();
        }
}