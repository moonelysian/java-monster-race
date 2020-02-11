package view;
import controller.Controller;
import util.Message;
import java.util.Scanner;

public class InputView {

    public void initializeRace() {
        System.out.println(Message.startLine.getMessage());
        System.out.println(Message.askNumberOfMonster.getMessage());
        inputNumberOfMonster();

        System.out.println(Message.askTypeOfMonster.getMessage());
        for (int i = 0; i < Controller.numberOfMonster; i++) {
            Controller.setMonsterList(inputMonsterNameAndType());
        }

        System.out.println(Message.askNumberOfChance.getMessage());
        inputNumberOfChance();
    }

    void inputNumberOfMonster() {
        Scanner input = new Scanner(System.in);
        Controller.numberOfMonster = Integer.parseInt(input.nextLine());
    }

    String[] inputMonsterNameAndType() {
        Scanner input = new Scanner(System.in);
        return input.nextLine()
                .replaceAll(" ", "")
                .split(",");
    }

    void inputNumberOfChance() {
        Scanner input = new Scanner(System.in);
        Controller.chance = Integer.parseInt(input.nextLine());
    }
}
