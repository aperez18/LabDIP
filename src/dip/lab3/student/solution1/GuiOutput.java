/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author Andy
 */
public class GuiOutput implements OutputBehavior{
    
    @Override
    public void displayOutput(String message){
        JOptionPane.showMessageDialog(null,"Message: " + message);
    }
}
