import java.util.Scanner; //for user input
// import java.util.*; -- to import whole util librabry

public class JavaTutorial2 {

    static Scanner userInput = new Scanner(System.in); // creating input var

    public static void main(String[] args) {

        System.out.print("What is your age? "); // asking question

        if (userInput.hasNextInt()) // if user types an int into the keybard
        {
            int numberEntered = userInput.nextInt(); // gets user iput
            ;
            System.out.println("Your age is " + numberEntered); // combines user inut w/ text

            // Short hand addition/subtraction
            System.out.println("Short hand things:");
            numberEntered += 2;
            System.out.println(numberEntered);
            numberEntered -= 5;
            System.out.println(numberEntered);

            // increase or decrease by 1
            numberEntered++;
            System.out.println(numberEntered);
            numberEntered--;
            System.out.println(numberEntered);

            // THINGS WITH MATH LIBARBY
            System.out.println("Things using math library:");
            int numberABS = Math.abs(numberEntered); // to find absolute value using the Math libabry
            System.out.println(numberABS);
            int whichIsBigger = Math.max(5, 7); // find bigger num
            int whichIsSmaller = Math.min(5, 7); // find smaller num
            System.out.println(whichIsBigger + " " + whichIsSmaller);
            double numSqrt = Math.sqrt(5.23); // to find sqrt, will return double!
            System.out.println(numSqrt);
            int numCeiling = (int) Math.ceil(5.23); // will round UP (6)-- ceil returns double, so the (int) forces it
                                                    // to return int
            int numFloor = (int) Math.floor(5.23); // will round DOWN (5)-- same as above with the int
            int numRound = (int) Math.round(5.63); // will round to 6
            System.out.println(numCeiling + " " + numFloor + " " + numRound);

            // RANDOM NUMBERS
            System.out.println("Random Numbers:");
            double randomNum = (Math.random()); // random num from .0 - .099
            System.out.println(randomNum);
            int randWholeNum = (int) (Math.random() * 10); // random num from 0 - 9 (10 = max num (that wont show up))
            System.out.println(randWholeNum);

        } else { // if they didn't type an int
            System.out.println("You didn't type in an int!");
        }

    }
}
