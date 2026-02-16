public class Game {
    private int difficulty;
    private int numberToGuess;
    private int guessAttempts;

    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
        switch (difficulty) {
            case 1:
                this.guessAttempts = 10;
                break;
            case 2:
                this.guessAttempts = 5;
                break;
            case 3:
                this.guessAttempts = 3;
                break;
            default:
                System.out.println("Invalid difficulty. Setting to easy.");
                this.guessAttempts = 10;
        }
    }

    public int getDifficulty() {
        return this.difficulty;
    }

    public String welcomeMessage() {
        return "Welcome to the Number Guessing Game!\nI'm thinking of a number between 1 and 100.\n";
    }

    public String difficultyMessage() {
        return "Please select the difficulty level:\n1. Easy (10 chances)\n2. Medium (5 chances)\n3. Hard (3 chances)";
    }

    public void selectedDifficultyMessage() {
        System.out.println("Great! You have selected the " + (this.difficulty == 1 ? "Easy" : this.difficulty == 2 ? "Medium" : "Hard") + " difficulty level. Let's start the game!");
    }

    public void getGuessAttempts() {
        System.out.println("You have " + this.guessAttempts + " attempts left.");
    }

    public boolean checkGuess(int guess) {
        if (guess < this.numberToGuess) {
            System.out.println("Too low! Try again.");
            this.guessAttempts--;
            getGuessAttempts();
            return false;
        } else if (guess > this.numberToGuess) {
            System.out.println("Too high! Try again.");
            this.guessAttempts--;
            getGuessAttempts();
            return false;
        } else {
            System.out.println("Congratulations! You've guessed the number!");
            this.guessAttempts = 0; // End the game
            return true;
        }
    }

    public void getNumberToGuess() {
        System.out.println("The number to guess is: " + this.numberToGuess);
    }

    @Override
    public String toString() {
        return "Game{" + this.difficulty + " difficulty, " + this.guessAttempts + " attempts left " + this.numberToGuess + " number to guess}";
    }

}
