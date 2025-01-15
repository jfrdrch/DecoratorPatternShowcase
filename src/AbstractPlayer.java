public abstract class AbstractPlayer {
    protected String game;
    protected CheckStrategy strategy;

    public AbstractPlayer(String game, CheckStrategy strategy) {
        this.game = game;
        this.strategy = strategy;
    }

    public boolean canMoveTo(){
        if (strategy != null){
            return strategy.canMoveTo();
        }
        return false;
    }

    public boolean canTreatDisease() {
        if (strategy != null){
            return strategy.canTreatDisease();
        }
        return false;
    }

    public boolean isScientist() {
        return strategy instanceof ScientistCheckStrategy;
    }

    // And so on
}
