/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Andy
 */
public class ConsoleOutput implements OutputBehavior{
    
    @Override
    public void displayOutput(String message){
        System.out.println("Message: " + message);
    }
}
