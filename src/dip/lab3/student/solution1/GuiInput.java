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
public class GuiInput implements InputBehavior{
    
    public String getInput(){
        return JOptionPane.showInputDialog(null, "Enter message below.");
    }
}
