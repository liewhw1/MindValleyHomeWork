
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heng Wai
 */
public class DrawingHelper {
    private static CarShowRoomPanel showroom;
    private static ArrayList<String> compositeCar;//index 0= Body, 1= window 2= Tyre
    public DrawingHelper(CarShowRoomPanel showroom)
    {
        this.showroom=showroom;
        initComponents();
        
    }
    
    
    
    public void initComponents()
    {
        compositeCar= new ArrayList(Arrays.asList("Ancient", "Classic", "Dark"));
        showroom.validate();
        
    }
    
    
    
    public static void updateCarDesign(String output)
    {
        compositeCar.remove(Utility.getIndex());
        compositeCar.add(Utility.getIndex(), output);

        showroom.repaint();
        
    }
    
    public static String getTyreSelected()
    {
        return (String)compositeCar.get(2);
    }
    
    public static String getBodySelected()
    {
        return (String)compositeCar.get(0);
    }
    
    public static String getWindowSelected()
    {
        return (String)compositeCar.get(1);
    }
    
    
}
