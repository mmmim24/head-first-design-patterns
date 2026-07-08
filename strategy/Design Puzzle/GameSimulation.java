import java.util.Scanner;
public class GameSimulation{
    public static void main(String[] args){
        System.out.println("Enter your townhall");
        Scanner sc = new Scanner(System.in);
        int th = sc.nextInt();
        if (th<7){
            System.out.println("No Heroes Available");
        }
        else {
            Character BarbarianKing = new King();
            BarbarianKing.display();
            BarbarianKing.chooseWeapon();
        }
        if(th>7){
            Character ArcherQueen = new Queen();
            ArcherQueen.display();
            ArcherQueen.chooseWeapon();
        }
        if(th>8){
            Character MinionPrince = new Troll();
            MinionPrince.display();
            MinionPrince.chooseWeapon();
        }
        if(th>10){
            Character GrandWarden = new Knight();
            GrandWarden.display();
            GrandWarden.chooseWeapon();
        }
    }
}