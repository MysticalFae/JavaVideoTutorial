import java.util.Arrays; //to input arrays

public class Monster4Java8 {

    static char[][] battleBoard = new char[10][10]; // creating a 2D array

    public static void buildBattleBoard() {

        for (char[] row : battleBoard) // cycles through each spot somehow
        {
            Arrays.fill(row, '*'); // fills each spot with *
        }
    }

    public static void reDrawBoard() // to draw board
    {

        int k = 1;
        // TOP LINE
        while (k <= 30) {
            System.out.print('-'); // draw boarder
            k++;

        }
        System.out.println(); // space
        for (int i = 0; i < battleBoard.length; i++) // gets length of battle board
        {
            for (int j = 0; j < battleBoard[i].length; j++) // length of number of spcaes in the row IDL
            {
                System.out.print("|" + battleBoard[i][j] + "|");
            }
            System.out.println(); // space
        }
        // BOT LINE
        k = 1;
        while (k <= 30) {
            System.out.print('-'); // draw boarder
            k++;

        }
        System.out.println(); // space

    }

    public final String TOMBSTONE = "RIP"; // remeber final?

    // ALL THE VARS IN THIS CLASS

    // want as many things private as possible!
    private int health = 500; // private = only obj can change it
    private int attack = 20;
    private int movement = 2;

    private boolean alive = true;

    public String name = "Big Monster";
    public char nameChar1 = 'B';
    public int xPos = 0;
    public int yPos = 0;

    public static int numOfMonsters = 0;

    // ALL THE FUNCTIONS IN THIS CLASS

    public int getAttack() // gives user ability to find out the attack value wihout letting them change it
    {
        return attack;
    }

    public int getMovement() // gives user ability to find out movement wihout letting them change it
    {
        return movement;
    }

    public int getHealth() // gives user ability to find out the health wihout letting them change it
    {
        return health;
    }

    public boolean getAlive() // gives user ability to find out the health wihout letting them change it
    {
        return alive;
    }

    public void setHealth(int decHealth) // decrases health
    {

        health = health - decHealth;
        if (health < 0) {
            alive = false;
        }

    }

    public void setHealth(double decHealth) // OVERLOAD!!! look above ^^ (if decHealth = double instead of int)
    {
        int decHealthNowInt = (int) decHealth; // changes it to int
        health = health - decHealthNowInt; // repeats what's above

        if (health < 0) {
            alive = false;
        }

    }

    public Monster4Java8(int newHealth, int newAttack, int newMovement, String name) // the constructor!
    // runs ONLY when new obj created, runs once per obj, has to have SAME NAME as
    // file/class

    // so this is creating a new monster and allowing health, attack, and movement
    // to be changed

    {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
        this.name = name;
        // .this -- to specific the var is inside the class or object vs outside (in
        // notes)

        int maxXBoardSpace = battleBoard.length - 1;
        int maxYBoardSpace = battleBoard[0].length - 1;

        int randNumX, randNumY;

        do {

            randNumX = (int) (Math.random() * maxXBoardSpace);
            randNumY = (int) (Math.random() * maxYBoardSpace);
        } while (battleBoard[randNumX][randNumY] != '*');

        this.xPos = randNumX;
        this.yPos = randNumY;

        this.nameChar1 = this.name.charAt(0);

        battleBoard[this.yPos][this.xPos] = this.nameChar1;

        numOfMonsters++;
    }

    public Monster4Java8() // overloading constructor!
    // can have multi constructors (just make sure they have diff parameters)
    // this would be the defualt constructor (ie. no parameters)
    {
        // does nothing..
        numOfMonsters++;
    }

    public static void main(String[] args) // creating a main in a class is fine (I think)
    {

    }

}
