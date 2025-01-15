public class BotPlayer extends AbstractPlayer {
    private final String botName;

    public BotPlayer(String botName, String game, CheckStrategy strategy) {
        super(game, strategy);
        this.botName = botName;
    }
}
