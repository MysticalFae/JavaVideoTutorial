import java.util.Scanner;

public class JavaTutorial5 {

    // for showing how vars r overrided
    static double myPI = 3.14159; // class variable (assesible anywhere within this class)

    // For making a random # and guessing it
    static int randomNumber; // class var
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(addThem(1, 2)); // will return value found in method being called

        // how stuff is passed??
        int d = 5; // this d != the d in tryToChange (they literally don't even need the same name)
        tryToChange(d); // passing VALUE of 'd' not the var of 'd'
        System.out.println("Main version of d = " + d); // will print 5 (NOT 6)
        System.out.println();

        System.out.println("For making and guessing a rando Number: ");
        // for making a random # and guessing it
        System.out.println(getRandomNum()); // calling function + will print rando # to screen

        int guessResult = 1;
        int randomGuess = 0;

        while (guessResult != -1) // if checkguess hasn't returned -1 (ie. they havent guessed the rando #)
        {
            System.out.print("Guess # between 0 and 50: ");

            randomGuess = userInput.nextInt(); // getting guess user inputed

            guessResult = checkGuess(randomGuess); // taking that user vlaue and checking it through the checkguess
                                                   // function
        }
        System.out.println("You guessed correctly!");
    }

    // THIS IS A METHOD (below)
    // accessModifier(public/private) static returnType OR void
    // methodName(parameters){}
    public static int addThem(int a, int b) {
        System.out.println();
        System.out.println("Varible Stuff: ");
        double smallPI = 3.140; // local varible (no static)-- only avvesible inside this method

        double myPI = 3.0; // will overide "myPI" from above, but not oviride outside this method
        // BUT myPI = myPI + 1.0; -- will override in this method, AND also when myPI is
        // called elsewwhere

        System.out.println("Global " + myPI);

        System.out.println();
        System.out.println("What the method is actually suppose to do: ");

        int c = a + b;
        return c;
    }

    // Trying to show how stuff is passed (look at d = 5 above)
    public static void tryToChange(int d) // this d != the D above (it simply took it's value and then sperated)
    {
        d = d + 1;
        System.out.println("tryToChange version of d = " + d); // will print 6 (NOT 5)
    }

    // for making a rando #?
    public static int getRandomNum() {

        randomNumber = (int) (Math.random() * 51); // bc it's a class var, we dont have to decalre it
        // setting a random num between 0 (i think) and 50 (hence the 51-- relook at
        // java2)
        return randomNumber; // will return rando # up to 50
    }

    // for checking if rando # = guess
    public static int checkGuess(int guess) {
        if (guess == randomNumber) {
            return -1; // so if guess ==s the rando num, -1 will be reutrned,
            // therefore CANCELLING OUT OF THE WHILE LOOP! wow.. that's smart
            // actually, it's really stupid.. user can just 'guess' -1 and 'win' XD

        } else {
            return guess; // ...as long as they dont put in -1
        }
    }
}
