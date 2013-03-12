
import java.awt.Graphics;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heng Wai
 */
public class WindowDrawer extends HardwareDrawer{
    
    public void draw(Graphics g, int positionX, int panelWidth)
    {
         
         g.drawRect((positionX+120)  % panelWidth, 110, 45, 40);
         g.drawRect((positionX+215)  % panelWidth, 110, 45, 40);
        if (DrawingHelper.getWindowSelected().equals("Modern"))
        {
            g.drawLine((positionX+120)  % panelWidth,110,(positionX+165)  % panelWidth,150);
            g.drawLine((positionX+215)  % panelWidth,110,(positionX+260)  % panelWidth,150);
        }
    }
}
