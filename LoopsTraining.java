/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopstraining;

import java.util.Scanner;

/**
 *
 * @author lindy
 */
public class LoopsTraining {

    
    public static void main(String[] args) {
        LoopsClass looping_while = new LoopsClass();
        //looping_while.leftPyramid();
        //looping_while.whileLoop();     
        //looping_while.doWhileLoop();
        
        Scanner input = new Scanner(System.in);
        System.out.println("select an option : \n _______");
        System.out.println("W - While Loop");
        System.out.println("D - Do While loop");
        System.out.println("P - Pyramid");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        
        String option;
        
        option=input.next();
        
            switch(option){
                    case "W": 
                    case "w":
                        looping_while.whileLoop(); 
                        break;
                        
                    case "D": 
                    case "d" :
                        looping_while.doWhileLoop();
                        break;
                        
                    case "P":
                    case "p":
                        looping_while.leftPyramid();
                        break;
                        
                    default: 
                        System.out.print("invalid option");
                       
                
                }
        
        
        

    }
    
}
