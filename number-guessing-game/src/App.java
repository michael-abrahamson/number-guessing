
public class App {

    public static void main(String[] args) throws Exception {

        //instantiate the game class
        game game = new game();
        boolean gameOver = false;
        System.out.println(game.welcomeMessage());
        System.out.println(game.difficultyMessage());
        //read user input for difficulty level and set it in the game class
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int difficulty = Integer.parseInt(scanner.nextLine());
        while (difficulty < 1 || difficulty > 3) {
            System.out.println("Invalid difficulty. Please select again:");
            difficulty = Integer.parseInt(scanner.nextLine());
        }
        game.setDifficulty(difficulty);

        game.selectedDifficultyMessage();

        //game.getNumberToGuess();
        while (!gameOver) {
            System.out.println("Enter your guess: ");
            int guess = Integer.parseInt(scanner.nextLine());
            gameOver = game.checkGuess(guess);
        }

    }
}
