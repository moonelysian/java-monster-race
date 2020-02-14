package view;

import controller.Controller;
import util.Message;
import java.util.Optional;
import java.util.Scanner;

public class InputView {

    public void initializeRace() {
        System.out.println(Message.startLine);
        System.out.println(Message.askNumberOfMonster);
        inputNumberOfMonster();

        System.out.println(Message.askTypeOfMonster);
        for (int i = 0; i < Controller.numberOfMonster; i++) {
            Controller.setMonsterList(inputMonsterNameAndType());
        }

        System.out.println(Message.askNumberOfChance);
        inputNumberOfChance();
    }

    private void inputNumberOfMonster() {
        Scanner input = new Scanner(System.in);
        Controller.numberOfMonster = Optional.of(Integer.parseInt(input.nextLine())).orElse(0);
    }

    private String[] inputMonsterNameAndType() {
        Scanner input = new Scanner(System.in);
        return input.nextLine()
                .replaceAll(" ", "")
                .split(",");
    }

    private void inputNumberOfChance() {
        Scanner input = new Scanner(System.in);
        Controller.chance = Optional.of(Integer.parseInt(input.nextLine())).orElse(0);
    }
}
