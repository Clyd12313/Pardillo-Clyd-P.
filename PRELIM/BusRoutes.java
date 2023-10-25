import java.util.InputMismatchException;
import java.util.Scanner;

public class BusRoutes {
    public static void main(String[] args) {
        System.out.println("Welcome To LaTransco");

        System.out.println("\nDefault Routes:");
        System.out.println("Cebu City (Start)");
        System.out.println("Minglanilla (Route 1)");
        System.out.println("San Fernando (Route 2)");
        System.out.println("CarCar (Route 3)");
        System.out.println("Barili (Route 4.1)");
        System.out.println("Dumanjug (Route 4.1.1)");
        System.out.println("Alcantara (Route 4.1.2)");
        System.out.println("Moalboal (End)");

        float bariliDistance = 84.9f;
        float dumanjugDistance = 94.0f;
        float argaoDistance = 92.3f;
        float estimatedTime;
        float estimatedTime3;

        Scanner input = new Scanner(System.in);

        System.out.println("\nIs Barili obstructed? (1=YES & 0=NO)");
        int bariliObstructed;

        do {
            try {
                bariliObstructed = input.nextInt();
                if (bariliObstructed != 0 && bariliObstructed != 1) {
                    System.out.println("Invalid input. Please enter 0 for NO or 1 for YES.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter 0 for NO or 1 for YES.");
                input.next();  
                bariliObstructed = -1;  
            }
        } while (bariliObstructed != 0 && bariliObstructed != 1);

        if (bariliObstructed == 1) {
            int dumanjugObstructed;

            do {
                Scanner input2 = new Scanner(System.in);
                System.out.println("\nHow about Dumanjug? (1=YES & 0=NO)");
                try {
                    dumanjugObstructed = input2.nextInt();
                    if (dumanjugObstructed != 0 && dumanjugObstructed != 1) {
                        System.out.println("Invalid input. Please enter 0 for NO or 1 for YES.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter 0 for NO or 1 for YES.");
                    input2.next(); 
                    dumanjugObstructed = -1;  
                }
            } while (dumanjugObstructed != 0 && dumanjugObstructed != 1);

            if (dumanjugObstructed == 1) {
                float speed;
                do {
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("\nHow fast are you going?(km/hr): ");
                    try {
                        speed = input3.nextFloat();
                        if (speed <= 0) {
                            System.out.println("Invalid input. Please enter a positive numeric speed value.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a positive numeric speed value.");
                        input3.next();  
                        speed = -1; 
                    }
                } while (speed <= 0);
                estimatedTime = argaoDistance / speed;

                System.out.println("\nRecommended Route:");
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("CarCar (Route 3)");
                System.out.println("Sibonga (Route 4.2)");
                System.out.println("Argao (Route 5)");
                System.out.println("Ronda (Route 5.1)");
                System.out.println("Alcantara (Route 5.2)");
                System.out.println("Moalboal (End)");

                int estimatedTime2 = (int) estimatedTime;
                estimatedTime3 = estimatedTime - estimatedTime2;
                int estimatedTime4 = (int) (estimatedTime3 * 60);

                System.out.println("\nSpeed: " + speed + " km/hr ");
                System.out.println("Distance: " + argaoDistance + " km ");

                if (estimatedTime2 == 1 && estimatedTime4 == 1) {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hour " + estimatedTime4 + " Minute");
                } else if (estimatedTime2 == 1) {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hour " + estimatedTime4 + " Minutes");
                } else if (estimatedTime4 == 1) {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hours " + estimatedTime4 + " Minute");
                } else {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hours " + estimatedTime4 + " Minutes");
                }
            } else {
                float speed;
                do {
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("\nHow fast are you going?(km/hr): ");
                    try {
                        speed = input3.nextFloat();
                        if (speed <= 0) {
                            System.out.println("Invalid input. Please enter a positive numeric speed value.");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter a positive numeric speed value.");
                        input3.next();  
                        speed = -1;  
                    }
                } while (speed <= 0);
                estimatedTime = dumanjugDistance / speed;

                System.out.println("\nRecommended Route:");
                System.out.println("Cebu City (Start)");
                System.out.println("Minglanilla (Route 1)");
                System.out.println("San Fernando (Route 2)");
                System.out.println("CarCar (Route 3)");
                System.out.println("Sibonga (Route 4.2)");
                System.out.println("Dumanjug (Route 4.2.1)");
                System.out.println("Alcantara (Route 4.2.2)");
                System.out.println("Moalboal (End)");

                int estimatedTime2 = (int) estimatedTime;
                estimatedTime3 = estimatedTime - estimatedTime2;
                int estimatedTime4 = (int) (estimatedTime3 * 60);

                System.out.println("\nSpeed: " + speed + " km/hr ");
                System.out.println("Distance: " + dumanjugDistance + " km ");

                if (estimatedTime2 == 1 && estimatedTime4 == 1) {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hour " + estimatedTime4 + " Minute");
                } else if (estimatedTime2 == 1) {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hour " + estimatedTime4 + " Minutes");
                } else if (estimatedTime4 == 1) {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hours " + estimatedTime4 + " Minute");
                } else {
                    System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hours " + estimatedTime4 + " Minutes");
                }
            }
        } else {
            float speed;
            do {
                Scanner input3 = new Scanner(System.in);
                System.out.println("\nHow fast are you going?(km/hr): ");
                try {
                    speed = input3.nextFloat();
                    if (speed <= 0) {
                        System.out.println("Invalid input. Please enter a positive numeric speed value.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a positive numeric speed value.");
                    input3.next();  
                    speed = -1;  
                }
            } while (speed <= 0);
            estimatedTime = bariliDistance / speed;

            System.out.println("\nRecommended Route:");
            System.out.println("Cebu City (Start)");
            System.out.println("Minglanilla (Route 1)");
            System.out.println("San Fernando (Route 2)");
            System.out.println("CarCar (Route 3)");
            System.out.println("Barili (Route 4.1)");
            System.out.println("Dumanjug (Route 4.1.1)");
            System.out.println("Alcantara (Route 4.1.2)");
            System.out.println("Moalboal (End)");

            int estimatedTime2 = (int) estimatedTime;
            estimatedTime3 = estimatedTime - estimatedTime2;
            int estimatedTime4 = (int) (estimatedTime3 * 60);

            System.out.println("\nSpeed: " + speed + " km/hr ");
            System.out.println("Distance: " + bariliDistance + " km ");

            if (estimatedTime2 == 1 && estimatedTime4 == 1) {
                System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hour " + estimatedTime4 + " Minute");
            } else if (estimatedTime2 == 1) {
                System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hour " + estimatedTime4 + " Minutes");
            } else if (estimatedTime4 == 1) {
                System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hours " + estimatedTime4 + " Minute");
            } else {
                System.out.println("Estimated Time Arrival: " + estimatedTime2 + " Hours " + estimatedTime4 + " Minutes");
            }
        }
    }
}
