/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Andy
 */
public class Startup {
    public static void main(String[] args) {
        
        InputBehavior input = new GuiInput();
        OutputBehavior output = new GuiOutput();
        
        MessageService messager = new MessageService(input, output);
        messager.newMessage();
    }
}
