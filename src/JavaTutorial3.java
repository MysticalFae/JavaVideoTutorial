public class JavaTutorial3 {

    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 50);

        if (randomNum < 25) {
            System.out.println("Num is less than 25.");

        } else if (randomNum > 40) {
            System.out.println("Num is greater than 40");
        } else if (randomNum == 18) {
            System.out.println("Num is equal to 18");
        } else if (randomNum != 40) {
            System.out.println("Num is not equal to 40");
        } else if (randomNum <= 18) {
            System.out.println("Num is smaller than or equal to 18");
        } else if (randomNum >= 40) {
            System.out.println("Num is bigger than or equal to 40");
        } else {
            System.out.println("Nothing worked");
        }

        System.out.println("The random number is " + randomNum);

        if (!(false)) // if NOT (!) false -- ie. true
        {
            System.out.println("turned false into true");
        }

        System.out.println("\n To show how backslash n works!");

        if ((false) && (true)) // && needs all things to be true to run
        {
            System.out.println("Both aren't true, so they won't execute");
        } // it's just saying it's "dead code" -- ie. it won't run

        if ((false) & (true)) // rarely used. Will check all values even if 1st value is false, BUT won't
                              // run!!
        {
            System.out.println(
                    "Will still not run bc both have to be true, BUT it will check other values even if 1st value is false");
        } // same as above -- dead code

        if ((false) | (true)) // or statment, only needs 1 thing to be true to run
        {
            System.out.println("Will run since one is true");
        }

        if ((true) ^ (true)) // xor statment -- will ONLY RUN if 1 is false and the other is true
        {
            System.out.println("Will NOT run since both r true");
        }

        System.out.println("\n Conditional statments (confusing):");
        int valueOne = 1;
        int valueTwo = 2;
        int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
        // if value 1 is bigger than value 2, assign the value of value 1 to
        // 'biggestValue'
        // if value 1 is NOT bigger than value 2, assign the value 2 to 'biggestValue'
        // assign = ?
        System.out.println(biggestValue);

        System.out.println("\n Switch Statment:");

        char theGrade = 'B';

        switch (theGrade) // same as c++
        {
            case 'A': // if 'theGrade' is an A, do...
                System.out.println("Great job");
                break; // to stop checking other cases
            case 'b': // allows u to check for mutli things, but still print the same things
            case 'B': // if 'theGrade' is a B, do...
                System.out.println("Good Job");
                break;
            case 'C': // if 'theGrade' is an C, do...
                System.out.println("Could have Done better");
                break;
            default: // same as c++, defaults to this if nothing else fits
                System.out.println("You failed");
                break;

            // so if it's b OR B, it will print "good job"

        }

    }
}
