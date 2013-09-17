/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Andy
 */
public class MessageService {
    private InputBehavior input;
    private OutputBehavior output;
    
    public MessageService(InputBehavior input, OutputBehavior output){
        this.input = input;
        this.output = output;
    }
    
    public void newMessage(){
        output.displayOutput(input.getInput());
    }
}
