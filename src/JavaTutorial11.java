// he went soooo fast!!! Pretty much, the video was just over arrayList, which I don't even think r on the AP cs test. And, I don't think they are used in everyday life bc they require an import... actually several imports...

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaTutorial11 {

    public static void main(String[] args) {
        ArrayList arrayList1; // create an arraylist varible

        arrayList1 = new ArrayList(); // didn't have to define size, bc it will do that for u

        // ^^ defining an arraylist with 2 lines

        ArrayList arrayList2 = new ArrayList(); // defining it all on 1 line

        // by defualt, an arraylist can store any types of data

        // to make an array that ONLY stores strings
        ArrayList<String> names = new ArrayList<String>();

        names.add("John Doe"); // to add a value to the array -- .add
        // all these have indexs (ie. john doe = o, jane doe = 1, etc.)
        names.add("Jane Doe");
        names.add("Mary Miller");

        names.add(2, "Jack Tyler"); // to add a value to a SPECIFIC index (everything else will move around w/out u
                                    // having to do anything)
        // So now Jake Tyler is at 2 and Mary Miller is at 3 (not 2)

        // to print values from the array
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();
        System.out.println("After replacing a name:");

        names.set(0, "New Name"); // will replace the value with the new value at whatever index (in this case 0)

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        System.out.println();
        System.out.println("After removing value at index 3:");

        names.remove(3); // will remove the value at 3

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // names.removeRange(0, 1); //will delete the range of indexs
        System.out.println();
        System.out.println(names); // will print everything on one line

        for (String i : names) // will print values out -- enchanced for loop
        {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Using iterator: ");
        Iterator indivItems = names.iterator(); // creates new iterator value
        // this is what was done b4 enchanced for loops

        while (indivItems.hasNext()) // hasNext is a boolean thing. checks if there is another value
        {
            System.out.println(indivItems.next()); // if there is another value, .next will grab it

        }

        // to show u don't need to define data type
        ArrayList nameCopy = new ArrayList();
        ArrayList nameBackup = new ArrayList();

        nameCopy.addAll(names); // will copy values from name and put them in nameCopy (a copy of the values)

        String paulYoung = "Paul Young";

        names.add(paulYoung); // adding var pual young to the array

        // To check if paul was added
        if (names.contains(paulYoung)) // .contains -- self explanitory
        {
            System.out.println("Paul is here");
        }

        if (names.containsAll(nameCopy)) // does names contain everything (all values) in namecopy --boolean
        // BUT if nameCopy.containALL(names) will be false bc we added paul to names and
        // not nameCopy
        {
            System.out.println("Everything in nameCopy is in names");
        }

        names.clear(); // will delete every item in names

        if (names.isEmpty()) // to check if array is empty -- boolean
        {
            System.out.println("Array list is empty");
        }

        Object[] moreNames = new Object[4]; // creating an array

        moreNames = nameCopy.toArray(); // values in nameCopy are copied to moreNames which is a plain array (not list)

        System.out.println(Arrays.toString(moreNames)); // to check if everything copied??

    }

}
