/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopstraining;

/**
 *
 * @author lindy
 */
public class LoopsClass {
    
    public void forLoop(){
        for(int x=1; x<=20; x++){
            System.out.print('A');
            
        }
    }   
    
    public void forEachLoop(){
        int[] numbers = {1,2,3,4,5,6,7};
        for(int y:numbers){
            System.out.println("the value is : " +y);
                    
        
        }
    
    }
    
    public void whileLoop(){
        int count = 0;
        while(count<20){
            System.out.println("Number : " +count);
            count++;
            
            
        }
        
    }
    
    public void doWhileLoop(){
        int count = 10;
        do{
            System.out.println("Numbers: " +count);
            count++;
        }
        while(count<10);
    
    }
    
    public void leftPyramid(){
        for(int row=1; row<=10; row++){
            for(int col=1; col<=row; col++){
                System.out.print("o");
            
            }
            System.out.println(" ");
    
         }
    }
}
