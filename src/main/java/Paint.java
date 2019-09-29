
import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Paint {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many rooms are you wanting to paint?");
        int numOfRooms = Integer.parseInt(keyboard.nextLine());
        System.out.println("What is the price per gallon of your paint?");
        double paintPrice = Double.parseDouble(keyboard.nextLine());
        double totalSquareFeet = 0;
        
        for(int i = 1; i <= numOfRooms; i++){
            System.out.println("Enter the square ft of room " + i);
            String roomSqFt = keyboard.nextLine();
            totalSquareFeet = totalSquareFeet + Double.parseDouble(roomSqFt);
        }
        double gallonsOfPaint = paintRequired(totalSquareFeet);
        double laborRequired = laborHoursRequired(totalSquareFeet);
        double totalPaintCost = totalPaintCost(gallonsOfPaint, paintPrice);
        double totalLaborCost = totalLaborCost(laborRequired);
        double totalJobCost = totalJobCost(totalPaintCost, totalLaborCost);
        
        System.out.println("Gallons of paint required: " + gallonsOfPaint);
        System.out.println("Labor hours required: " + laborRequired);
        System.out.println("Total paint cost was: " + totalPaintCost);
        System.out.println("Total labor cost was: " + totalLaborCost);
        System.out.println("Total job cost was: " + totalJobCost);
        
        
    }
    
    public static double paintRequired(double totalSquareFeet){
        return totalSquareFeet / 115;
    }    
    public static double laborHoursRequired(double totalSquareFeet){
        return totalSquareFeet / 8;
    }
    public static double totalPaintCost(double gallonsOfPaint, double paintPrice){
        return gallonsOfPaint * paintPrice;
    }
    public static double totalLaborCost(double laborHours){
        return laborHours * 18;
    }
    public static double totalJobCost(double totalPaint, double totalLabor){
        return totalPaint + totalLabor;
    }
}
