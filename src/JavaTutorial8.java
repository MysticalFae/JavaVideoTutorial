import java.util.Arrays;
//import org.apache.commons.lang3.ArrayUtils; //umm idk

public class JavaTutorial8 {

    // USING THE FILE NAMED Monsters4Java8

    public static void main(String[] args) {

        Monster4Java8.buildBattleBoard();

        // char[][] tempBattleBoard = new char[10][10];

        // objectName[] arrayName = new objName[#of obj u want in it]

        Monster4Java8[] Monsters = new Monster4Java8[4]; // creates 4 monsters

        Monsters[0] = new Monster4Java8(1000, 20, 1, "Frank");
        Monsters[1] = new Monster4Java8(40, 10, 0, "Mary");
        Monsters[2] = new Monster4Java8(500, 15, 1, "Bob");
        Monsters[3] = new Monster4Java8(800, 20, 1, "Jane");

        Monster4Java8.reDrawBoard();

        for (Monster4Java8 m : Monsters) {
            if (m.getAlive()) {
                int arrayItemIndex = Arrays.asList(Monsters).indexOf(m);
                m.moveMonster(Monsters, arrayItemIndex);
            }
        }

        Monster4Java8.reDrawBoard();

    }
}