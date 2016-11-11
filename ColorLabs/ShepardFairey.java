//Matt Domzalski
//10/31/16
import java.awt.*;
import java.util.*;
import java.util.List;
public class ShepardFairey
{
    public static void main(String[]args)
    {
        Picture selfie = new Picture("selfie2.jpg");
        Picture selfie2 = new Picture("selfie.jpg");
        Picture selfie3 = new Picture("selfie.jpg");
        Pixel [] pixels; 
        pixels = selfie.getPixels();
        
        Color dblue = new Color (27, 61, 138);
        Color blue1 = new Color (88, 124, 206);
        Color red1 = new Color (193, 29, 29);
        Color white = new Color (200, 198, 180);
        
        Color dred  = new Color (39, 0, 5);
        Color redd = new Color (94, 9, 21);
        Color gry = new Color (255, 50, 0);
        Color wht = new Color (255, 251, 236);
        //method1
        int green, red, blue, grey;
        for (Pixel pixelobj : pixels)
        {
            green = pixelobj.getGreen();
            blue = pixelobj.getBlue();
            red = pixelobj.getRed(); 
            
            grey =(red + green + blue)/3;
            
            if (grey < 63)
                pixelobj.setColor(dblue);
            else if (grey > 63 && grey < 126)
                pixelobj.setColor(blue1);
            else if (grey > 126 && grey < 189)
                pixelobj.setColor(red1);
            else 
                pixelobj.setColor(white);
            }
        selfie.explore();
        selfie.write("images\\newselfie.jpg");
        //method2
        pixels = selfie2.getPixels();
        int green1, blue2, red2, grey1;
        int max = 255; 
        int min = 0;
        int intensity = 0;
        for (Pixel pixelobj : pixels)
        {
            if(intensity > max)
                max = intensity;
            if (intensity < min)
                min = intensity;
        }
        for (Pixel pixelobj : pixels)
        {
            int pix = (max - min)/4;
            int color = pix + min;
            int color1 = pix * 2 + min;
            int color2 = pix * 3 + min;
            green1 = pixelobj.getGreen();
            blue2 = pixelobj.getBlue();
            red2 = pixelobj.getRed(); 
            
            intensity =(red2 + green1 + blue2)/3;
            if (intensity < color)
                pixelobj.setColor(dblue);
            else if (intensity >= color && intensity < color1)
                pixelobj.setColor(blue1);
            else if (intensity >= color1 && intensity < color2)
                pixelobj.setColor(red1);
            else 
                pixelobj.setColor(white);
            }
        selfie2.explore();
        selfie2.write("images\\newselfie2.jpg");
        
        //custom pallet
        pixels = selfie3.getPixels();
        int green3, red3, blue3, grey3;
        for (Pixel pixelobj : pixels)
        {
            green3 = pixelobj.getGreen();
            blue3 = pixelobj.getBlue();
            red3 = pixelobj.getRed(); 
            
            grey3 =(red3 + green3 + blue3)/3;
            
            if (grey3 < 63)
                pixelobj.setColor(dred);
            else if (grey3 > 63 && grey3 < 126)
                pixelobj.setColor(redd);
            else if (grey3 > 126 && grey3 < 189)
                pixelobj.setColor(gry);
            else 
                pixelobj.setColor(wht);
         
        }
        selfie3.explore();
        selfie3.write("images\\newselfie3.jpg");
    }
}