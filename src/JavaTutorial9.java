import java.util.Arrays; //importing arrays

//so smtimes this code runs iffy in visual studio code... just be aware
//it's NOT u, it's the compiler XD

public class JavaTutorial9 {

    public static void main(String[] args) {

        int[] randomArray; // defining an array (no value)

        int[] numberArray = new int[10]; // defining an array (with a value of ten)

        randomArray = new int[20]; // defining the value of randomArray as 20
        randomArray[1] = 2; // spot/box 1 now =s 2

        String[] stringArray = { "just", "random", "words" }; // don't have to say how big the array will be,
        // u can just add stuff to the array and it will take the amt of stuff as the
        // size of it
        // ie. here ^^ the stringArray has a size of 3 (due to the 3 values we added in)

        for (int i = 0; i < numberArray.length; i++) // i has to be less than the length/size of numberArray
        {
            numberArray[i] = i; // so spot 0 will = 0, spot 1 will have the value 1, etc
        }

        int k = 1;
        while (k <= 41) // could do (so it's all on one line) - while(k <= 41){ System.out.print('-');
                        // k++; }
        {
            System.out.print('-');
            k++;
        }
        System.out.println(); // for looks

        // To print the array out in "boxes"
        for (int j = 0; j < numberArray.length; j++) {

            System.out.print("| " + j + " "); // formatting
        }
        System.out.println("|"); // for looks for last box

        // MULTI DEMENSINAL
        System.out.println();
        System.out.println("MULTI DEMENTIONAL ARRAYS: "); // doesnt print for some reason

        String[][] multiArray = new String[10][10];

        for (int i = 0; i < multiArray.length; i++) // length hori (rows)
        {
            for (int j = 0; j < multiArray[i].length; j++) // length vert (columns)
            // so in each 'i' (the start of a colunm), it goes DOWN it (?)
            {
                multiArray[i][j] = i + " " + j;
            }

        }
        k = 1;
        while (k <= 61) // could do (so it's all on one line) - while(k <= 41){ System.out.print('-');
                        // k++; }
        {
            System.out.print('-');
            k++;
        }
        System.out.println(); // for looks

        for (int i = 0; i < multiArray.length; i++) // length hori (rows)
        {
            for (int j = 0; j < multiArray[i].length; j++) // length vert (columns)
            // so in each 'i' (the start of a colunm), it goes DOWN it (?)
            {
                System.out.print("| " + multiArray[i][j] + " ");
            }
            System.out.println(); // very important XD looks so werid without

        }
        k = 1;
        while (k <= 61) // could do (so it's all on one line) - while(k <= 41){ System.out.print('-');
                        // k++; }
        {
            System.out.print('-');
            k++;
        }
        System.out.println(); // for looks

        // enhanced for loop
        System.out.println();
        System.out.println("ENHANCED FOR LOOP TO PRINT A ROW: ");

        // for(datatype placeHolder : nameOfArray) {}

        for (int row : numberArray) // idk what ':' means
        // int = datatype for array
        // row = a place holder
        {
            System.out.print(row); // row = temp holding cell
        }
        System.out.println("\n");

        System.out.println();
        System.out.println("ENCHANCED FOR LOOP USING MULTI ARRAYS: ");

        // for(dataType[] varForRow : nameOFMultiArray)
        // for(dataType varForColumn : varForRow) -- bc u r printing out a value, u lose
        // the []

        for (String[] rows : multiArray) // rows = temp, rows starts at 0
        {
            for (String column : rows) // column and rows = temp, column starts at 0
            {
                System.out.print("| " + column + " "); // see diff.. now it's "column"
            }
            System.out.println("|");
        }

        // why the util.arrays library was added
        System.out.println();
        System.out.println("Copying an array using the Arrays library: ");

        int[] numberCopy = Arrays.copyOf(numberArray, 5);
        // will copy the 1st 5 (0-4) values from numberArray and put them in numberCopy
        // could do -- Array.copyOfRange(numberArray, 3, 6) //3 = starting place, 6 =
        // ending place

        for (int row : numberCopy) // to print values in numberCopy
        {
            System.out.print(row);
        }
        System.out.println("\n");

        System.out.println();

        System.out.println();
        System.out.println("Printing entire array to screen with 1 line using Arrays Libabrby: ");

        System.out.println(Arrays.toString(numberCopy)); // prints out entire array to screen

        // won't print -- to fill an array
        int[] moreNumbers = new int[100];
        Arrays.fill(moreNumbers, 2); // every value in moreNumbers now = 2

        // wont print -- filling spots but w/ a multi array

        char[][] boardGame = new char[10][10];

        for (char[] row : boardGame) {
            Arrays.fill(row, '*'); // every spot will have a *

        }

        // to sort an array (full of rand #s)
        System.out.println();
        System.out.println("SORTING #S IN ARRAYS: ");

        int[] numsToSort = new int[10];

        for (int i = 0; i < 10; i++) {
            numsToSort[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(numsToSort); // will sort the array

        System.out.println(Arrays.toString(numsToSort)); // will print array

        System.out.println("FINDING THINGS IN AN ARRAY: ");

        int whereIs50 = Arrays.binarySearch(numsToSort, 50);
        // Arrays.binarySearch will search array for a value (in this case 50)
        // if not found, it will return a negitive #
        System.out.println(whereIs50);
    }
}
