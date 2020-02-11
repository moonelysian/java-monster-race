package view;

import model.Monster;
import util.Message;
import java.util.Collections;

import static controller.Controller.*;

public class OutputView {
    public void result() {
        printRaceResult();
        printWinner();
    }

    void printRaceResult() {
        System.out.println(Message.gameStartMessage.getMessage());
        for (Monster monster : monsterList) {
            System.out.println(monster.name + " [" + monster.type + "] : " + monster.distanceToString());
        }
    }

    void printWinner() {
        Monster winner = Collections.max(monsterList);
        System.out.println(Message.congratulations.getMessage() + " " + winner.name + " " + Message.winner.getMessage());
    }
}
