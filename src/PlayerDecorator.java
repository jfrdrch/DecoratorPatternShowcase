public abstract class PlayerDecorator extends AbstractPlayer {
    AbstractPlayer player;


    public PlayerDecorator(AbstractPlayer player) {
        super(player.game);
        this.player = player;
    }

    // Check methods already implemented get inserted here
    public boolean canMoveTo(String destination) {
        System.out.println("The standard way how to determine the move is executed for city " + destination);
        return false;
    }

    public AbstractPlayer getPlayer() {
        return player;
    }
}
