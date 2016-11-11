
/**
 * Kevin Hayes
 * Test Picture Classes
 * 
 * @author (Kevin Hayes) 
 * @version (10-19-2016)
 */
import java.awt.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List
public class TestPicture
{

    /**
     * main method, to test the picture
     *  
     */
  public static void main(String[] args)
  {
      //opens picture using a dialog box
      /**/
     String fileName = FileChooser.pickAFile();
     Picture pictObj = new Picture(fileName);
     pictObj.explore();
     
     //opens a pictue using a path
     //Picture apic = new Picture("C:\\Users\\khayes\\Favorites\\Documents\APCS- Java\chap03\Curriclum 2013\Picture Color labs\images\\beach.jpg");
     //relative path
     Picture apic = new Picture("images\\beach.jpg");
     Picture baby = new Picture("images/beach.jpg");
     Picture baby1 = new Picture("images/tbeach.jpg");
     Picture baby2 = new Picture("images/tbeach.jpg");
     Picture baby3 = new Picture("images/beach.jpg");
     Picture baby4 = new Picture("images/beach.jpg");
     Picture baby5 = new Picture("images/beach.jpg");
     Picture baby6 = new Picture("images/beach.jpg");
     //apic.explore();
     baby.explore();
     Pixel[] pixels;
     pixels = baby.getPixels();
     
     /*
        //array of pixels [] used to index
    int[] numbers = new  int[10];
    System.out.println(numbers[5] +"-1"  );
    // [] this is an array
    Pixel [] pixels;
    //gets all of the pixels in picture and
    //assigns to pixels array
    pixels = baby.getPixels();
    System.out.println(pixels.length  );
     
    
    
    
    
    
    /*
        //access each index
    System.out.println(pixels[17]);
    System.out.println(pixels[17].getColor());
/*
    pixels[17].setColor(Color.blue);
    pixels[20].setColor(new Color(150,150,150));
    pixels[500034].setColor(Color.blue);

    baby.explore();
/* 
   // two loops to access indexes of array or collection

    //for each loop spot  is a ?
    for (Pixel spot : pixels)
    System.out.println( spot );


    //loop indexes the array to access
    //for (int i = 0; i< pixels.length;i++)
    //    System.out.println(pixels[i].getRed()  );
    
 /**/
 
 /**
  * Method to clear red from picture
  * @param none
  * @return none
  */
 /*
    for (Pixel pixelObj : pixels)
        {
            //set the red value of the current pixel to the new value
            pixelObj.setBlue(0);

        }
    baby.explore();
/**/    
 /**
  * Method to reduce red from picture by a factor of n
  * @param none
  * @return none
  */
 
/*
int value;
final double  FACTOR = .5;
    for (Pixel pixelObj : pixels)
    {

        //get the redvalue
        value = pixelObj.getRed();
        //System.out.println(value);

        //decrease the red value by 50%
        value = (int) (value *FACTOR);

        //set the red value of the current pixel to the new value
        pixelObj.setRed(value);

    }
    baby.explore();
    
 
    /**/
  }//main
}//class
