import java.util.*; //imported whole libabry, not just Scanner
import java.io.*; //another libabry..

public class JavaTutorial6 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        // for arthimetic error
        System.out.println("For arthmeticException Error: ");
        divideByZero(2);

        // for scanner error
        System.out.println();
        System.out.println("For mismatch Error with user input: ");
        System.out.print("How old are you? ");
        int age = checkValidAge();
        if (age != 0) // bc of the return value we had to have...
        {
            System.out.println("You are " + age + " years old");
        }

        // for file error
        System.out.println();
        System.out.println("For file error/errors in general: ");
        getAFile("./somestuff.txt"); // this file doesn't exsits

    }

    // for arthimetic error
    public static void divideByZero(int a) {
        try {
            System.out.println(a / 0); // will cause an error
        } catch (ArithmeticException e) // trying to catch the expcetion u think will happen
        {
            System.out.println("You can't do that");
            System.out.println(e.getMessage()); // java has messages for their errors
            System.out.println(e.toString()); // to print out error that was triggered
            e.printStackTrace(); // umm idk abt this one XD
        }
        // if u didn't 'catch' the error, it would run and print out an error message
    }

    // for mismatch error
    public static int checkValidAge() {
        try {
            return userInput.nextInt(); // will return what user inputed (assuming it's an int!)

        } catch (InputMismatchException e) // name of exception (if they don't input an int)
        {
            userInput.next(); // skips over user input, goes to 'next' one
            System.out.print("That isn't a whole number");
            return 0; // smthg has to be returned..
        }
    }

    // for File error
    public static void getAFile(String fileName) // could add right after ) throws IOException, FileNotFoundException
                                                 // (all before brakcet)
    // throws will throw the error bck to main (ie. u dont need try and catch in the
    // method), but main then needs to be able to handle the error
    // Would have to set up a try{}catch{} in main around the line that called this
    // function

    // havent talked abt files yet
    {
        try {
            FileInputStream file = new FileInputStream(fileName); // file doesn't exsist so it doesnt wrok (there will
                                                                  // be an error)
        } catch (FileNotFoundException e) {
            System.out.println("Sorry can't find that file");
        } catch (IOException e) // can catch multi exceptions.. this is a general IO one
        {
            System.out.println("Unknown IO Error");// see how this one is less specific than the one above

            // } catch (ClassNotFoundException e) { //WONT LET ME RUN SO IT"S IN CODE
            // // if u want to ignore an exception, just dont put anything between the
            // brackets
            // // just to clarify, u caught the error, but just didn't do anything abt it
            // }
        } catch (Exception e) // will catch EVERY error (extremly unspecific)
        { // always use last!
            System.out.println("There was an error");
        }

        finally // anything in finally will run even if smthg was caught.. to clean up anything
                // like open files, etc.
        {
            System.out.println("Will always print");
        }

    }
}
