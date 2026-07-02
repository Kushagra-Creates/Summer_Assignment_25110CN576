/* This is an RPG turn based game like Pokemon where you enter a dungeon and encounter monster and have to defeat it */
import java.util.Scanner;
public class Question120 {
    // Index mapping: 0 = Player, 1 = Boss
    //creating class level variables
    private static String[] names = {"Hero", "Shadow Dragon"}; 
    // Formula used for generating boss health randomly deciding the difficulty of the game => (int)(Math.random() * (max - max + 1)) + min;
    //Math.random() generates a number between 0.0 and 1.0(exclusive) hence the use of the formula
private static int bossHealth = (int)(Math.random() * (300 - 150 + 1)) + 150; 
    private static int[] hp = {100, bossHealth};
    private static int mana = 30; //amount of mana (magic) the playes has
    private static int ultimateCooldown = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===============================================================================================================");
        System.out.println(" You enter a dungeon to check what all the fuss made by the villagers is about\n When you traverse through the overgrown dungeon you feel an Evil presence watching you!\n And Suddenly!");
        System.out.println(" A wild " + names[1] + " with "+ hp[1]+" appears! Battle Start! ");
        while (hp[0] > 0 && hp[1] > 0) {
            displayStatus();//method to display the stats of the player and the enemy 
            System.out.print(" >Choose action (ATTACK, HEAL, ULTIMATE): \n >Attack will deal an amount of damage(randomly)\n >Heal will heal you for 25 health\n >Ultimate deals a random amount of damage but takes Three turns to regenerate:\n >");
            String action = in.next().trim().toUpperCase();//getting the input from the player
            playerAction(action); //Method to do the action chosen by the player
            if (hp[1] <= 0) {
                System.out.println("\n Victory! You defeated the " + names[1] + "!");
                System.out.println(" As the beast fells, you see the beast is not sad but....It Smiles in relief\n And as the beast fades you feel Happy for the Tormented Beast as a Light shines upon you!\n You crawl out of the Dungeon battered and bruised as the Villagers cheer you on and you smile with a sense of relief\n As there is no more the Beast for village and no Torment for the Beast....");
                System.out.println("===============================================================================================================");
                break;
            }
            bossTurn();//Method for the attack done by the boss
            if (ultimateCooldown > 0) ultimateCooldown--;//Every turn we decrease the ultimate's cooldown if there is any 
        }
        if (hp[0] <= 0) System.out.println("\n Game Over! You were defeated...\n You shout with agony as you're voice echoes through the dungeon!\n As you look at the Dragon a last time you can see....The beast sheding tears!?\n And you can make out 'I am Sorry' from the beast's mouth as you close you're eyes the last time......\n Outside the Villagers hear a spine chilling Roar knowing another time....The Beast Won");
        System.out.println("===============================================================================================================");
        in.close();
    }
    //Method to display the current stats of the player as well as the health of the boss
    public static void displayStatus() {
        System.out.printf("\n%s HP: %d\t|     %s HP: %d\n", names[0], hp[0], names[1], hp[1]);
        System.out.println("Mana: " + mana + " | Ultimate Cooldown: " + ultimateCooldown);
    }
    //Method to do the action that is decided by the player i.e Attack, Heal, Ultimate 
    public static void playerAction(String action) {
        switch (action) {
            //Regular attack that will deal a random amount of damage between 10 and 60
            case "ATTACK" -> {
                int damage = 10 + (int)(Math.random() * 61);
                hp[1] -= damage;
                System.out.println(" \n===>You strike for " + damage + " damage!");
            }
            //Heal will heal you're wounds for 25 hp if you have mana 
            case "HEAL" -> {
                if (mana >= 10) {
                    mana -= 10;
                    hp[0] = Math.min(100, hp[0] + 25);
                    System.out.println(" \n===>You cast Heal! Restored 25 HP.");
                } else {
                    System.out.println(" \n===>Low Mana! Standard attack used instead.");
                    playerAction("ATTACK");
                }
            }
            //Ultimate will deal a random amount of damage in the range of 0 and 80
            case "ULTIMATE" -> {
                if (ultimateCooldown == 0) {
                    // Formula used to calculate the intensity of you're ultimate attack => (int)(Math.random() * (max - min + 1)) + min;
                    int damage = (int)(Math.random() * (80 - 40 + 1)) + 40;
                    hp[1] -= damage;
                    ultimateCooldown = 3; // 3 turn restriction that is on Ultimate attacks
                    System.out.println(" \n===>CRITICAL HIT! Ultimate deals " + damage + " damage!");
                } else {
                    System.out.println(" \n===>Ultimate on cooldown! Standard attack used.");
                    playerAction("ATTACK");
                }
            }
            //Default case for when you can't follow simple instructions 
            default -> {
                System.out.println(" \n===>Confused, you skipped your turn!");
            }
        }
    } 
    //Method for enemy's turn 
    public static void bossTurn() {
        System.out.println("\n " + names[1] + "'s Turn!");
        int move = (int)(Math.random() * 2); //this variable decides between the moves that boss can attack with, The boss has two different moves 
        if (move == 0) {
            int dmg = 12 + (int)(Math.random() * 9);
            hp[0] -= dmg;
            System.out.println(" \n--->The Dragon claws you for " + dmg + " damage.");//Simple attack that deals a random amount of damage between 12 and 20
        } else {
            hp[0] -= 25;
            System.out.println(" \n--->The Dragon breathes fire! You take 18 damage.");//Ultimate attack of the boss that deals 18 amount of damage
        }
    }
}
/*Thank You*/