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

    public void askPlayer(){
        System.out.println("What ability do you want to call? ");
        System.out.println("(1) " + "(2) " + "(3)");
    }

    public void startGame() {
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("\nYou said you wanna call an ability? (true or false)");
        Scanner s = new Scanner(System.in);
        Boolean answer = s.nextBoolean();
        if (answer) {
            System.out.println("Oh, sure. There we go!\nSelect a Character");
            System.out.println("(1) Gon " + "(2) All Might " + "(3) Hiro");
            int selected = s.nextInt();
            switch (selected) {
                case 1:
                    System.out.println("--------------------------------------------------------------------------------");
                    Gon gon = new Gon();
                    askPlayer();
                    int ability = s.nextInt();
                    switch (ability) {
                        case 1:
                            gon.skillOne();
                            startGame();
                        case 2:
                            gon.skillTwo();
                            startGame();
                        case 3:
                            gon.skillThree();
                            startGame();
                    }
                case 2:
                    System.out.println("--------------------------------------------------------------------------------");
                    AllMight allmight = new AllMight();
                    askPlayer();
                    ability = s.nextInt();
                    switch (ability) {
                        case 1:
                            allmight.skillOne();
                            startGame();
                        case 2:
                            allmight.skillTwo();
                            startGame();
                        case 3:
                            allmight.skillThree();
                            startGame();
                    }

                case 3:
                    System.out.println("--------------------------------------------------------------------------------");
                    Hiro hiro = new Hiro();
                    askPlayer();
                    ability = s.nextInt();
                    switch (ability) {
                        case 1:
                            hiro.skillOne();
                            startGame();
                        case 2:
                            hiro.skillTwo();
                            startGame();
                        case 3 :
                            hiro.skillThree();
                            startGame();
                    }
            }
        }else{
            System.out.println("Ok, so game is over!\nSee you later :)");
        }
    }
}

