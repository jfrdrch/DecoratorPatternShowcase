public class ScientistDecorator extends PlayerDecorator {

    public ScientistDecorator(AbstractPlayer player) {
        super(player);
    }

    @Override
    public boolean canMoveTo(String destination) {
        System.out.println("I check as a scientist if a can move to " + destination);
        return false;
    }
}
