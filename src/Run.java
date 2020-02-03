import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("<스릴만점 건전한 몬스터 경주>");
        System.out.println("시도할 회수는 몇 회 인가요?");

        int count = Integer.parseInt(input.nextLine());
        Controller controller = new Controller(count);

        System.out.println("<실행 결과>");
        System.out.println(controller.run());
    }
}
