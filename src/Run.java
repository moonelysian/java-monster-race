import java.util.Scanner;

public class Run {
    enum Message{
        startLine("<스릴만점 건전한 몬스터 경주>"),
        numberOfMonster("몬스터는 모두 몇 마리인가요?"),
        numberOfChance("시도할 회수는 몇 회 인가요?"),
        gameResult("<실행 결과>");

        private String message;

        Message(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    private static void printResult(int numberOfMonster, int chance){
        Controller controller = new Controller(numberOfMonster, chance);
        controller.resultOfRace().forEach(monster -> System.out.println(monster));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(Message.startLine.getMessage());
        System.out.println(Message.numberOfMonster.getMessage());
        int numberOfMonster = Integer.parseInt(input.nextLine());

        System.out.println(Message.numberOfChance.getMessage());
        int chance = Integer.parseInt(input.nextLine());

        System.out.println(Message.gameResult.getMessage());
        printResult(numberOfMonster, chance);

    }
}
