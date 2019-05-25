package Testing;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setName("Lohana");
        player1.setUsername("LHanji");
        System.out.println("Name: " + player1.getName());
        System.out.println("Username: " + player1.getUsername());
        player1.startGame();
    }
}
