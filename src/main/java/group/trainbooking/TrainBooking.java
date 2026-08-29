/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package group.trainbooking;

/**
 *
 * @author Legion
 */

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;//
import javax.swing.UIManager;//
public class TrainBooking {

    public static void main(String[] args) {
        
        FlatLightLaf.setup();
        
        Color myCustomBackground = new Color(25,50,90);
        UIManager.put("background", myCustomBackground);
        UIManager.put("Panel.background", myCustomBackground);
        UIManager.put("Button.background", Color.WHITE); 
        
        Selectrole role=new Selectrole();
        role.setVisible(true);
    }
}
