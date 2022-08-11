
public class JavaTutorial7 {

    public static void main(String[] args) {
        // bc Monster4Java7 is in same folder as javatutor7, u can call it
        Monster4Java7 Frank = new Monster4Java7(); // creating a new mosnter the CORRECT WAY (look at Mon4java7 file
                                                   // down at bot)
        Frank.name = "Frank"; // name is public
        // BUT
        // System.out.println(Frank.attack); -- won't work bc it's private!!
        // BUT
        System.out.println(Frank.name + " has an attack of " + Frank.getAttack());
        // using the PUBLIC getAttack method to see the attack value (20)
    }
}
