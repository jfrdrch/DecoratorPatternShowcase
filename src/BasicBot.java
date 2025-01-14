public class BasicBot extends AbstractPlayer {
    String botName;

    public BasicBot(String game, String botName) {
        super(game);
        this.botName = botName;
    }

    public void botAction() {
        System.out.println("Bot action happens");
    }
}
