public class HelloWorld {

    static String stringOutsideMain = "String to print";
    static final double PINUM = 3.141529;

    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("Basic printing from outside main");
        System.out.println(stringOutsideMain);
        System.out.println(PINUM);

        System.out.println("Integers:");
        int integerOne = 22; // declaration statment
        int integerTwo = integerOne + 1; // expression statment
        System.out.println(integerTwo);

        System.out.println("Other datatypes:");
        byte bigByte = 127; // biggest value a byte can hold
        short bigShort = 32767; // biggest num a 'short' can hold

        System.out.println("Max size of Float and Double:");
        // to find max size of float and double
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println("Char:");
        char charWithNum = 66;
        char charWithLetter = 'A';

        char escapedChars = '\b'; // backspace (can hold a lot of other weird stuff too)

        System.out.println(charWithNum + " and " + charWithLetter);

        System.out.println("Strings:");
        String partOfStringOne = "I am";
        String partOfStringTwo = "a pig.";

        String stringsTogether = partOfStringOne + ' ' + partOfStringTwo;
        System.out.println(stringsTogether);

        System.out.println("Datatypes to a string:");
        int beforeString = 100;
        String afterString = Integer.toString(beforeString); // Byte. Short. Long. Float. Boolean. Double. toString()
        System.out.println(afterString);

        System.out.println("DataTypes (not Strings) to other DataTypes:");
        int beforeDouble = 3;
        double afterDouble = (double) beforeDouble;
        System.out.println(afterDouble);

        System.out.println("String to another datatype:");
        String beforeInt = "5";
        int afterInt = Integer.parseInt(beforeInt); // .parseByte/Long/Float/Double/Boolean/Short
        System.out.println(afterInt);

    }
}
