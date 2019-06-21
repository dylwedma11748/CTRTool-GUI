package main;

import gui.GUI;
import gui.Log;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Main 
{
    public static void main(String[] args) throws InterruptedException
    {
        try 
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            GUI gui = new GUI();
            Log log = new Log();
            log.setVisible(true);
            Thread.sleep(500);
            gui.setVisible(true);
        } 
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) 
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}