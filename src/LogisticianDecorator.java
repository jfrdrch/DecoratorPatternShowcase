public class LogisticianDecorator extends PlayerDecorator{

    public LogisticianDecorator(AbstractPlayer player) {
        super(player);
    }

    @Override
    public boolean canMoveTo(String destination) {
        System.out.println("I check as a logistician if a can move to " + destination);
        return false;
    }
}
