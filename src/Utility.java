
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Heng Wai
 */
public class Utility {
    private static int parts_index=0;
    private static ArrayList partsList;
    private static ArrayList bodyList;
    private static ArrayList windowList;
    private static ArrayList tyreList;
    private static JLabel optionLabel1;
    private static JLabel optionLabel2;
    public static void initialized(JLabel label,JLabel optionLabel1Var, JLabel optionLabel2Var)
    {
        optionLabel1= optionLabel1Var;
        optionLabel2=optionLabel2Var;
        addPartsToList("BODY","WINDOW","TYRE");
        addBodyModelToList("Ancient","Contemporary");
        addWindowModelToList("Classic","Modern");
        addTyreModelToList("Dark","Grey");
        label.setText((String)partsList.get(parts_index));
        setOptionLabel(parts_index);
    }
    
    public static int getIndex()
    {
        return parts_index;
    }
    public static void setOptionLabel(int index)
    {
        ArrayList<String> list;
        if(index==0)
        list= bodyList;
        else if (index==1)
        list= windowList;
        else
        list= tyreList;
            
        optionLabel1.setText(list.get(0));
        optionLabel2.setText(list.get(1));
        
    }
    
    public static void addBodyModelToList(String ... models)
    {
        if(bodyList==null)
        bodyList= new ArrayList();
          
        for(String individualModel : models)
        {
            bodyList.add(individualModel);
        }
    }
    
    public static void addWindowModelToList(String ... models)
    {
        if(windowList==null)
        windowList= new ArrayList();
          
        for(String individualModel : models)
        {
            windowList.add(individualModel);
        }
    }
    
    public static void addTyreModelToList(String ... models)
    {
        if(tyreList==null)
        tyreList= new ArrayList();
          
        for(String individualModel : models)
        {
            tyreList.add(individualModel);
        }
    }
    
    
    
    public static void addPartsToList(String ... parts)
    {
        if(partsList==null)
        partsList= new ArrayList();
          
        for(String individualPart : parts)
        {
            partsList.add(individualPart);
        }
    }
    
    public static String navigationAction(String action)
    { 
        int newParts_index=(action.equals("Previous"))?parts_index - 1 : parts_index + 1;
        
        if((newParts_index > -1 && newParts_index < partsList.size()))
        {
            parts_index= newParts_index;
        }
        setOptionLabel(parts_index);
        return (String)partsList.get(parts_index);
       
        
    }
    
    public static void setActionCommandToRadioButton(JRadioButton ... radioBtnList)
    {
            ArrayList<String> latestPartList= getLatestPartList();
            for(int i=0; i < radioBtnList.length; i++)
            {
                ((JRadioButton)radioBtnList[i]).setActionCommand((String)latestPartList.get(i));
               
            }
        
    }
    
    public static void setSelectedRadioButtonOption(JRadioButton ... radioBtnList)
    {
        ArrayList<String> list;
        
        if(parts_index==0) //Body
        {
            radioBtnList[bodyList.indexOf(DrawingHelper.getBodySelected())].setSelected(true);           
        }   
        else if(parts_index==1) //Window
        {
            radioBtnList[windowList.indexOf(DrawingHelper.getWindowSelected())].setSelected(true);
        }
        else //Tyre
        {
            radioBtnList[tyreList.indexOf(DrawingHelper.getTyreSelected())].setSelected(true);
        }
            
        
            
    }
    
    public static ArrayList<String> getLatestPartList()
    {
        ArrayList<String> output;
        String partOption = (String)partsList.get(parts_index);
        if(partOption.equalsIgnoreCase("BODY"))
        output=bodyList;
        
        else if(partOption.equalsIgnoreCase("WINDOW"))
        output=windowList;
        
        else
        output=tyreList;
        
        return output;
    }
    
    
}
