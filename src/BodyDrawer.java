
import java.awt.Graphics;
import javax.swing.JComponent;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heng Wai
 */
public class BodyDrawer extends HardwareDrawer {
    public BodyDrawer()
    {
       
    }
    public void draw(Graphics g, int positionX, int panelWidth)
    {
        
        
        if(DrawingHelper.getBodySelected().equals("Ancient"))
        {
            //Body Type a 
        g.drawLine((positionX+100) % panelWidth,100,(positionX+80) % panelWidth,150);
        g.drawLine((positionX+100) % panelWidth,100,(positionX+280) % panelWidth,100);
        g.drawLine((positionX+280) % panelWidth, 100, (positionX+300) % panelWidth, 150);
        g.drawLine((positionX+300) % panelWidth,150,(positionX+300) % panelWidth,190);
        g.drawLine((positionX+80) % panelWidth, 150, (positionX+10) % panelWidth, 150);
        g.drawLine((positionX+10) % panelWidth,150,(positionX+10) % panelWidth,190);
        g.drawLine((positionX+10) % panelWidth,190,(positionX+80) % panelWidth,190);
        g.drawArc((positionX+80) % panelWidth,175,45,50,0,180);
        g.drawLine((positionX+130) % panelWidth,190,(positionX+190) % panelWidth,190);
        g.drawArc((positionX+190) % panelWidth,175,45,50,0,180);
        g.drawLine((positionX+240) % panelWidth,190,(positionX+300) % panelWidth,190);
        }
        else
        {
         g.drawLine((positionX+40)% panelWidth,100,(positionX+280)% panelWidth,100); //Straight Horizontal Line
         g.drawLine((positionX+40)% panelWidth,100,(positionX+20)% panelWidth,150);
         g.drawLine((positionX+280)% panelWidth, 100, (positionX+300)% panelWidth, 150);
         //g.drawLine((positionX+320)% panelWidth, 100, (positionX+340)% panelWidth, 150);
         g.drawLine((positionX+20)% panelWidth,150,(positionX+20)% panelWidth,190); //Straight Vertical Line
         g.drawLine((positionX+300)% panelWidth,150,(positionX+300)% panelWidth,190); //Straight Vertical Line
         //g.drawLine((positionX+340)% panelWidth,150,(positionX+340)% panelWidth,190); //Straight Vertical Line
         g.drawLine((positionX+20)% panelWidth,190,(positionX+80)% panelWidth,190); //Straight Horizontal Line
         g.drawArc((positionX+80)% panelWidth,175,45,50,0,180); //Left Tyre
         g.drawLine((positionX+130)% panelWidth,190,(positionX+190)% panelWidth,190);   //Straight Horizontal Line
         g.drawArc((positionX+190)% panelWidth,175,45,50,0,180);//Right Tyre
         g.drawLine((positionX+240)% panelWidth,190,(positionX+300)% panelWidth,190);   //Straight Horizontal Line
        }
    }
}
