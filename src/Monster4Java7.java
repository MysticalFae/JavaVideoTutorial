public class Monster4Java7 {

    public final String TOMBSTONE = "RIP"; // remeber final?

    // ALL THE VARS IN THIS CLASS

    // want as many things private as possible!
    private int health = 500; // private = only obj can change it
    private int attack = 20;
    private int movement = 2;
    private int xPos = 0;
    private int yPos = 0;
    private boolean alive = true;

    public String name = "Big Monster";

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

    public Monster4Java7(int newHealth, int newAttack, int newMovement) // the constructor!
    // runs ONLY when new obj created, runs once per obj, has to have SAME NAME as
    // file/class

    // so this is creating a new monster and allowing health, attack, and movement
    // to be changed
    {
        health = newHealth;
        attack = newAttack;
        movement = newMovement;
        // .this -- to specific the var is inside the class or object vs outside (in
        // notes)
    }

    public Monster4Java7() // overloading constructor!
    // can have multi constructors (just make sure they have diff parameters)
    // this would be the defualt constructor (ie. no parameters)
    {
        // does nothing..
    }

    // USES OF THIS WITH METHODS

    public Monster4Java7(int newHealth) // overload!
    {
        health = newHealth;
    }

    public Monster4Java7(int newHealth, int attack) // overload!
    {
        this(newHealth); // sends the newHealth to the method above since it already has the work done
        // more on ^^ so 'this' is a "refrence to constructors inside our program",
        // and there is only 1 parameter, so it goes to the health overloading method

        // SO, 'this' doesn't quite work how u thought.. it doesn't go to the method
        // above bc it sees it solves for newhealth, or even that it involves newhealth
        // it goes to it bc it has ONE PARAMETER and is an int

        this.attack = attack; // clarifies that the 1st attack is the var mentioned in the class
    }

    // SO... THIS IS TO POINT A POTENTIOAL ERROR OUT

    public static void main(String[] args) // creating a main in a class is fine (I think)
    {
        Monster4Java7 Frank = new Monster4Java7(); // creating a monster named frank and using the defualt method
        // I think ^^ is also fine
        // BUT THIS IS WHERE THINGS COULD GO WRONG
        System.out.println(Frank.attack); // attack is a PRIVATE var for security reasons...
        // so we shouldn't ever be able to just print it (ie. change its value)
        // BUT bc we r STILL in the CLASS, we have ACCESS to ALL the PRIVATE varibles
    }

}