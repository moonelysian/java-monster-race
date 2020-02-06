import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private int numberOfMonster;
    private int chance;

    void startGame() {
        inputCondition();
        printResult(resultOfRace());
    }

    void inputCondition() {

        Scanner input = new Scanner(System.in);

        System.out.println(Message.startLine);
        System.out.println(Message.askNumberOfMonster);
        this.numberOfMonster = Integer.parseInt(input.nextLine());

        System.out.println(Message.askNumberOfChance);
        this.chance = Integer.parseInt(input.nextLine());
        input.close();
    }

    ArrayList<String> resultOfRace() {
        ArrayList result = new ArrayList();
        for (int i = 0; i < numberOfMonster; i++) {
            result.add(calculateTotalMovement());
        }
        return result;
    }

    String calculateTotalMovement() {
        StringBuffer result = new StringBuffer();
        Movement movement = new Movement();
        for (int i = 0; i < chance; i++) {
            result.append(movement.moveMonster());
        }
        return result.toString();
    }

    void printResult(ArrayList<String> resultOfRace) {
        System.out.println(Message.gameStartMessage);

        resultOfRace.forEach(resultOfMonster -> System.out.println(resultOfMonster));
    }
}
