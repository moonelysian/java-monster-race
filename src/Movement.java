public class Movement {
    int randomMax = 10;
    int standard = 3;

    boolean verifyMovement() {
        int randomNumber = (int) (Math.random() * randomMax);
        return (randomNumber > standard);
    }

     String moveMonster() {
         String move = "--";
         String stop = "";

         return (verifyMovement() ? move : stop);
    }
}
