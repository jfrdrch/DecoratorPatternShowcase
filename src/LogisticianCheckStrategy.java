public class LogisticianCheckStrategy extends DefaultCheckStrategy{

    @Override
    public boolean canMoveTo() {
        System.out.println("LogisticianCheckStrategy canMoveTo called");
        return true;
    }
}
