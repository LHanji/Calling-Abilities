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

    public void startGame() {
        System.out.println("\nDo you want to call a ability?");
        Scanner s = new Scanner(System.in);
        Boolean answer = s.nextBoolean();
        if (answer) {
            System.out.println("Select a Character");
            System.out.println("(1) Gon " + "(2) All Might " + "(3) Hiro");
            int selected = s.nextInt();
            switch (selected) {
                case 1:
                    Gon gon = new Gon();
                    System.out.println("What ability do you want to use? ");
                    System.out.println("(1) " + "(2) " + "(3)");
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
                    AllMight allmight = new AllMight();
                    System.out.println("What ability do you want to use? ");
                    System.out.println("(1) " + "(2) " + "(3)");
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
                    Hiro hiro = new Hiro();
                    System.out.println("What ability do you want to use? ");
                    System.out.println("(1) " + "(2)");
                    ability = s.nextInt();
                    switch (ability) {
                        case 1:
                            hiro.skillOne();
                            startGame();
                        case 2:
                            hiro.skillTwo();
                            startGame();
                    }
            }
        }
    }
}

