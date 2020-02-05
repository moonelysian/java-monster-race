public class Movement {

    boolean verifyMovement() {
        int randomMax = 10;
        int standard = 3;
        int randomNumber = (int) (Math.random() * randomMax);

        return (randomNumber > standard);
    }

     String moveMonster() {
         String move = "--";
         String stop = "";

         return (verifyMovement() ? move : stop);
    }
}
