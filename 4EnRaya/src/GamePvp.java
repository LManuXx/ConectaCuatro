import java.util.Scanner;

public class GamePvp implements GameInterface {

    public GamePvp() {

    }

    @Override
    public void startGame() {

        do {

            Board board = new Board();
            HumanPlayer playerX = new HumanPlayer(board);

            while (!board.isFinished()) {
                playerX.putToken();

            }

            System.out.println("Ha ganado el color: " + board.getWinnerColor().toString());

        } while (isResumed());

    }

    static boolean isResumed() {
        System.out.println("¿Quieres iniciar otra partida?");
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input.equals("s");

    }

}
