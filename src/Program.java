import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Zoop zoop = new Zoop();

        TextHelper.showWelcome();

        while (zoop.getGameState() == zoop.GameState.PLAYING) {
            String input = TextHelper.readln();

            switch (input) {
                case 'close':
                case 'quit':
                case 'exit':
                    zoop.close();
                    break;
                case 'feed penguin':
                    zoop.feedPenguin();
                    break;
                case 'feed polar bear':
                case 'feed polarbear':
                    zoop.feedPolarBear();
                    break;
                case 'help':
                case '?':
                    zoop.showHelp();
                    break;
                case 'new day':
                    zoop.nextDay();
                    zoop.showStatus();
                    break;
                case 'status':
                    zoop.showStatus();
                    break;
                default:
                    zoop.showUnknownCommand(input);
                    break;
            }
        }
    }
}
