
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tyler
 */
public class Prime {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to check if it's prime");
        int chosenNumber = Integer.parseInt(keyboard.nextLine());
        
        if(isPrime(chosenNumber)){
            System.out.println("Your number is prime!");
        }else{
            System.out.println("Your number is not prime");
        }
        
    }
    public static boolean isPrime(int testNum){
        if(testNum <=1){
            return false;
        }
        for(int i = 2; i < testNum; i++){
            if(testNum % i == 0){
                return false;
            }
        }
        return true;
        
    }
}
