import java.io.*;
import javax.swing.*;

class SquareX
{
        int s; 
        void sqArea(int s){
        System.out.println("The area of Square = "+(s*s));
        }
       
}
class ShapeX{

 public static void main(String[] args)
        {
        SquareX sq = new SquareX();
        String s;
        s = JOptionPane.showInputDialog("Enter the side of Square");
        int side = Integer.parseInt(s);
        sq.sqArea(side);
        }
}