import java.util.Scanner;

public class ConsoleInput {
    int inputNumberOfMonster() {
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }

    String[] inputMonsterNameAndType() {
        Scanner input = new Scanner(System.in);
        return input.nextLine()
                    .replaceAll(" ", "")
                    .split(",");
    }

    int inputNumberOfChance() {
        Scanner input = new Scanner(System.in);
        return Integer.parseInt(input.nextLine());
    }
}
