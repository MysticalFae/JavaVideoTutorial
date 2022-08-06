import java.util.Scanner;

public class JavaTutorial4 {

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;

        while (i <= 20) {
            if (i == 3) // so it doesn't print '3' NOR '4'
            {
                i += 2;
                continue; // jumps out of ireation in while loop and jumps back to top
                // so it doesn't countinue on to print or i++
            }
            System.out.println(i);
            i++;

            if ((i % 2) == 0) // to find if odd
            {
                i++; // see, it doesn't print it (the even #), it just skips over it
            }

            if (i > 15) {
                break; // will break out of while loop
            }
        }
        System.out.println("To make PI: \n");
        // will not be exact!

        double myPi = 4.0;

        double j = 3.0;

        while (j < 11) // make calculation 11 times, need more times (like ALOT more) to get close to
                       // pi
        {
            myPi = myPi - (4 / j) + (4 / (j + 2));
            j += 4;
            System.out.println(myPi);
        }

        System.out.println("While loop for user inputs: \n");

        String contYorN = "Y";

        int h = 1;

        while (contYorN.equalsIgnoreCase("y")) // so y and Y work
        {
            System.out.println(h);
            System.out.println("continue y or n? ");
            contYorN = userInput.nextLine(); // accept string input from user and save to contYorN
            h++;
            // if user doesn't put in a y or Y, it cancles out of while loop
        }

        System.out.println("Do while loop: \n");

        int k = 10;

        do {
            System.out.println(k); // will print it out once
            k++;
        } while (k < 10); // then check this part, but bc k = 11, it will stop

        System.out.println("For loop: \n");

        for (int l = 10; l >= 1; l--) // decalred l IN the for statment so it ONLY EXSISTS inside the for loop
        {
            System.out.println(l);
        }

        int m, n;

        for (m = 1, n = 2; m <= 9; m += 2, n += 2) {
            System.out.println(m + "\n" + n + "\n");
        }

    }

}
