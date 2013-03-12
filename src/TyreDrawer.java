
import java.awt.Color;
import java.awt.Graphics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heng Wai
 */
public class TyreDrawer extends HardwareDrawer{
    
    public TyreDrawer()
    {
        
    }
   
    
    
    public void draw(Graphics g, int positionX, int panelWidth)
    {
        
        
        
        if(DrawingHelper.getTyreSelected().equals("Dark"))
            g.setColor(Color.BLACK);
        else    
            g.setColor(Color.LIGHT_GRAY);
        
         g.drawOval((positionX+78) % panelWidth,175,50,45); //Left Tyre
         g.drawOval((positionX+188)  % panelWidth,175,50,45);//Right Tyre
         g.fillOval((positionX+78)  % panelWidth,175,50,45);
         g.fillOval((positionX+188)  % panelWidth,175,50,45);
        
        
        
           
        
         
    }
}
