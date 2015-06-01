/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.itstake.ramdomizer;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author itstake
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static Font font;
    public static void main(String[] args) {
        Randomizer gui = new Randomizer();
        gui.main();
        Main main = new Main();
        try {
            main.setLookandFeel();
        } catch (FontFormatException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setLookandFeel() throws FontFormatException, IOException {
        Main.font = Font.createFont(Font.TRUETYPE_FONT, this.getClass().getResourceAsStream("/fonts/NanumBarunGothic.ttf")).deriveFont(Font.PLAIN, 0);
        UIManager.put("OptionPane.messageFont", font.deriveFont(Font.PLAIN, 14));
        UIManager.put("OptionPane.buttonFont", font.deriveFont(Font.PLAIN, 14));
        UIManager.put("FileChooser.listFont", font.deriveFont(Font.PLAIN, 14));
        UIManager.put("Button.select", new javax.swing.plaf.ColorUIResource(Color.LIGHT_GRAY));
        UIManager.put("ToggleButton.select", new javax.swing.plaf.ColorUIResource(Color.LIGHT_GRAY));
        UIManager.put("Button.background", new java.awt.Color(238, 238, 238));
        UIManager.put("ToggleButton.background", new java.awt.Color(238, 238, 238));
        UIManager.put("Button.font", font.deriveFont(Font.PLAIN, 14));
        UIManager.put("Label.font", font.deriveFont(Font.PLAIN, 14));
        UIManager.put("ScrollPane.font", font.deriveFont(Font.PLAIN, 14));
        UIManager.put("ComboBox.font", font.deriveFont(Font.PLAIN, 14));
        UIManager.put("Button.focus", new javax.swing.plaf.ColorUIResource(Color.LIGHT_GRAY));
        UIManager.put("Slider.focus", new java.awt.Color(238, 238, 238));
        UIManager.put("Slider.altTrackColor", new javax.swing.plaf.ColorUIResource(Color.GRAY));
        UIManager.put("Slider.paintThumbArrowShape", true);
        UIManager.put("Slider.highlight", new java.awt.Color(238, 238, 238));
        UIManager.put("Button.border", new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 4, true));
        UIManager.put("ToggleButton.border", new javax.swing.border.LineBorder(new java.awt.Color(238, 238, 238), 4, true));
        UIManager.put("OptionPane.background", new javax.swing.plaf.ColorUIResource(Color.WHITE));
        UIManager.put("Label.background", new javax.swing.plaf.ColorUIResource(Color.WHITE));
        UIManager.put("Panel.background", new javax.swing.plaf.ColorUIResource(Color.WHITE));
        UIManager.put("CheckBox.background", new javax.swing.plaf.ColorUIResource(Color.WHITE));
        UIManager.put("CheckBox.border", new EmptyBorder(1, 1, 1, 1));
        UIManager.put("CheckBox.select", new javax.swing.plaf.ColorUIResource(Color.WHITE));
    }
    
}
