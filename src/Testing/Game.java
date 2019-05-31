package Testing;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Player player1 = new Player();
        System.out.println("Name: ");
        player1.setName(s.nextLine());
        System.out.println("Username: ");
        player1.setUsername(s.nextLine());
        player1.startGame();
    }
}
