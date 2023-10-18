// Name: Clyd Pardillo #35
// Yr & Sec: BSIT 2B
// Activity #3

import java.util.Scanner;

public class ActivityThreePardillo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int C1 = 0, C2 = 0, C3 = 0, R1 = 0, R2 = 0, orderCode = 1; 
        double totalCost = 0, Conversion = 0, Dollars = 56;     
       
        System.out.println("Welcome to Jollibee!");
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. C1 - Php 100.00");
            System.out.println("2. C2 - Php 150.00");
            System.out.println("3. C3 - Php 200.00");
            System.out.println("\nAdd ons:");
            System.out.println("4. R1 - Php 35.00");
            System.out.println("5. R2 - Php 50.00");
            System.out.println("\n6. Done");
            
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            
            double itemPrice = 0;
            
            switch (choice) {
                case 1:
                    C1++;
                    itemPrice = 100.00;
                    break;
                case 2:
                    C2++;
                    itemPrice = 150.00;
                    break;
                case 3:
                    C3++;
                    itemPrice = 200.00;
                    break;
                case 4:
                    R1++;
                    itemPrice = 35.00;
                    break;
                case 5:
                    R2++;
                    itemPrice = 50.00;
                    break;
                case 6:
                    System.out.println("\nOrder Summary:");
                    System.out.println("C1: " + C1);
                    System.out.println("C2: " + C2);
                    System.out.println("C3: " + C3);
                    System.out.println("R1: " + R1);
                    System.out.println("R2: " + R2);
                    
                    totalCost = (C1 * 100.00) + (C2 * 150.00) + (C3 * 200.00) + (R1 * 35.00) + (R2 * 50.00);
                    System.out.println("\nTotal Cost: Php " + String.format("%.2f", totalCost));
                    
                    Conversion = (totalCost / Dollars);
                    System.out.println("Value in Dollars: $ " + String.format("%.2f", Conversion));
                    
                    System.out.println("Order Code: " + orderCode);
                    orderCode++;
                    return;
                default:
                    System.out.println("\nInvalid choice. Please choose again.");
            }
        }
    }
}
