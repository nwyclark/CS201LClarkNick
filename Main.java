package CS201LLab1;
import java.util.Scanner;
//NAME:  Nicholas Clark
//DATE:  3 Sept 2025
//LAB TIME: 12:00
//PROGRAM:
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to CS201L - Lab1!");

        //declare variables used
        int x1, x2, y1, y2;
        double dist1, dist2;
        char choice;
        String inputLine;
        //get choice from the user
        try (Scanner input = new Scanner(System.in)) {
            //get choice from the user
            System.out.print("\nHow would you like to get your 4 values: enter(e) or generate(g)? ");
            inputLine = input.nextLine();
            choice = inputLine.charAt(0);
            switch (choice) {
                case 'e' -> {
                    System.out.println("Enter the 4 values separated by spaces: ");
                    x1 = input.nextInt();
                    y1 = input.nextInt();
                    x2 = input.nextInt();
                    y2 = input.nextInt();
                    
                    int[] nums = {x1, y1, x2, y2};
                    
                    for (int num: nums) {
                        if (!(num >= -10 && num <= 10)){
                            System.out.println("A value entered was not valid");                    
                            return;
                        }
                    }
                }

                case 'g' -> {
                    x1 = (int)(Math.random() * 21) - 10;
                    y1 = (int)(Math.random() * 21) - 10;
                    x2 = (int)(Math.random() * 21) - 10;
                    y2 = (int)(Math.random() * 21) - 10;

                }
                
                default -> {
                    System.out.println("The value " + choice + " is not a valid option!");
                    return;
                }
            }   
            //print both points
            System.out.println("Point 1: (" + x1 + ", " + y1 + ")");
            System.out.println("Point 2: (" + x2 + ", " + y2 + ")");

            //calculate dist1 & dist2 (the distance from each point to the origin)
            dist1 = Math.pow(Math.pow((x1-0),2) + Math.pow((y1-0),2),.5);
            dist2 =  Math.pow(Math.pow((x2-0),2) + Math.pow((y2-0),2),.5);

            //determine which is distance closer to the origin and print
            if (dist1 < dist2) {
                System.out.println("Point 1 is closer to the origin at a distance of " + dist1);
            } else if (dist1 > dist2) {
                System.out.println("Point 2 is closer to the origin at a distance of " + dist2);
            } else {
                System.out.println("The distances are equally close at a distance of " + dist1);
            }
            //close scanner
        }
    }
}

//test