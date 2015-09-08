package Game;

public class GameMain {
    public static void main(String[] args) {
        int wins = 0;
        int rounds = 10000;
        Game game = new Game();

        for (int i = 0; i < rounds; i++) {
            if (game.play()) {
                wins += 1;
            }
        }

        System.out.printf("Probability: %.2f%%", (wins / (double) rounds) * 100);
    }
}
