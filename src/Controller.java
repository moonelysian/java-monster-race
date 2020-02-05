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
        final String startLine = "<스릴만점 건전한 몬스터 경주>";
        final String askNumberOfMonster = "몬스터는 모두 몇 마리인가요?";
        final String askNumberOfChance = "시도할 회수는 몇 회 인가요?";

        Scanner input = new Scanner(System.in);

        System.out.println(startLine);
        System.out.println(askNumberOfMonster);
        this.numberOfMonster = Integer.parseInt(input.nextLine());

        System.out.println(askNumberOfChance);
        this.chance = Integer.parseInt(input.nextLine());
    }

    ArrayList<String> resultOfRace() {
        ArrayList result = new ArrayList();
        for (int i = 0; i < numberOfMonster; i++) {
            result.add(calculateTotalMovement());
        }
        return result;
    }

    String calculateTotalMovement() {
        String result = "";
        Movement movement = new Movement();
        for (int i = 0; i < chance; i++) {
            result += movement.moveMonster();
        }
        return result;
    }

    void printResult(ArrayList<String> resultOfRace) {
        final String endGameMessage = "<실행 결과>";
        System.out.println(endGameMessage);

        resultOfRace.forEach(resultOfMonster -> System.out.println(resultOfMonster));
    }
}
