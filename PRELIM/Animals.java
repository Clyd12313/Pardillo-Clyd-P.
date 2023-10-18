// Name: Clyd Pardillo #35
// Yr & Sec: BSIT 2B
// Activity #1

import java.util.Scanner;

public class Animals {
String dog = "Woof! Woof! Woof! Woof!";
String cat = "Meow! Meow! Meow! Meow!";
String cow = "Moo! Moo! Moo! Moo!";
String fox = "Ring-Ding-Ding-Ding-Dingeringeding!";

public void printDog() {
System.out.println(dog);
}

public void printCat() {
System.out.println(cat);
}

public void printCow() {
System.out.println(cow);
}

public void printFox() {
System.out.println(fox);
}

public static void main(String[] args) {
Animals animalSounds = new Animals();
Scanner scan = new Scanner(System.in);
int num = -1; // set ug non-zero para mu run ang loop

while (num != 0) {
System.out.println("\n========== Activity One: What does the animal say? ==========");
System.out.println("Select an animal:");
System.out.println("1. Dog\n2. Cat\n3. Cow\n4. Fox");
System.out.println("Enter a number between 1-4 (0 to exit): ");
num = scan.nextInt();

switch (num) {
case 1:
animalSounds.printDog();
break;
case 2:
animalSounds.printCat();
break;
case 3:
animalSounds.printCow();
break;
case 4:
animalSounds.printFox();
break;
case 0:
System.out.println("Goodbye!");
break;
default:
System.out.println("Invalid input. Please enter a number between 1 and 4 (0 to exit).");
}
}
}
}