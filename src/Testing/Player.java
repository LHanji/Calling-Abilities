package Testing;
import java.util.Scanner;

public class Player {
    private String name;
    private String username;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public void startGame(){
        System.out.println("Do you want to call a ability?");
        Scanner s = new Scanner(System.in);
        Boolean answer = s.nextBoolean();
        if(answer){
            System.out.println("Select a Character");
            System.out.println("(1) Gon " + "(2) All Might " + "(3) Hiro");
            int selected = s.nextInt();
            if(selected == 1){
                Gon gon = new Gon();
                System.out.println("What ability do you want to use? ");
                System.out.println("(1) " + "(2) " + "(3)");
                int ability  = s.nextInt();
                if(ability == 1){
                    gon.skillOne();
                    startGame();
                } else if(ability == 2){
                    gon.skillTwo();
                    startGame();
                } else if(ability == 3) {
                    gon.skillThree();
                    startGame();
                }
            }
            if(selected == 2){
                AllMight allmight = new AllMight();
                System.out.println("What ability do you want to use? ");
                System.out.println("(1) " + "(2) " + "(3)");
                int ability  = s.nextInt();
                if(ability == 1){
                    allmight.skillOne();
                    startGame();
                } else if(ability == 2){
                    allmight.skillTwo();
                    startGame();
                } else if(ability == 3) {
                    allmight.skillThree();
                    startGame();
                }
            }
            if(selected == 3){
                Hiro hiro = new Hiro();
                System.out.println("What ability do you want to use? ");
                System.out.println("(1) " + "(2)");
                int ability  = s.nextInt();
                if(ability == 1){
                    hiro.skillOne();
                    startGame();
                } else if(ability == 2){
                    hiro.skillTwo();
                    startGame();
                }
            }
        }
    }

}
