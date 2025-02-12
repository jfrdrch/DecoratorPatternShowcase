public class DefaultCheckStrategy implements CheckStrategy {
    private AbstractPlayer player;

    public void setPlayer(AbstractPlayer player) {
        if (this.player = null) {
            this.player = player;
        }
    }
    
    @Override
    public boolean canMoveTo() {
        System.out.println("Default check for canMoveTo");
        return false;
    }

    @Override
    public boolean canTreatDisease() {
        System.out.println("Default check for canTreatDisease");
        return false;
    }
}
