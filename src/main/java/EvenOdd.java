
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class EvenOdd {
    
    public static void main(String[] args) {
        Random random = new Random();
        int evenCounter = 0;
        int oddCounter = 0;
        
        for(int i = 1; i <= 100; i++){
            int ranNum = random.nextInt();

            if(isEven(ranNum)){
                evenCounter++;
            }else{
                oddCounter++;
            }
        }
        System.out.println("Even count was: " + evenCounter);
        System.out.println("Odd count was: " + oddCounter);
        
    }
    
    public static boolean isEven(int testNum){
        
        if(testNum % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
