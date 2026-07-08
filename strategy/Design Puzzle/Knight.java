import java.util.Scanner;
public class Knight extends Character{
    public Knight(){
        name = "Grand Warden ";
        heroTier = "🌟🌟🌟🌟 ";
        weapon = new AxeBehavior();
    }
    public void chooseWeapon(){
        System.out.println("Set a new weapon\n1. Axe 🪓\n2. Bow and Arrow 🏹\n3. Knife 🔪\n4. Sword ⚔️\n");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option){
            case 1:
                this.setWeapon(new AxeBehavior());
                System.out.println("\nAxe Selected");
                break;
            case 2:
                this.setWeapon(new BowAndArrowBehavior());
                System.out.println("\nBow and Arrow Selected");
                break;
            case 3:
                this.setWeapon(new KnifeBehavior());
                System.out.println("\nKnife Selected");
                break;
            case 4:
                this.setWeapon(new SwordBehavior());
                System.out.println("\nSword Selected");
                break;
            default:
                this.setWeapon(new AxeBehavior());
                System.out.println("\nAxe Selected");
                break;
        }
        this.fight();
    }
}