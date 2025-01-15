public class RealPlayer extends AbstractPlayer {
    private final String user;

    public RealPlayer(String user, String game, CheckStrategy strategy) {
        super(game, strategy);
        this.user = user;
    }
}
