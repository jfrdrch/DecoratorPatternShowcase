public class DefaultCheckStrategy implements CheckStrategy {
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
