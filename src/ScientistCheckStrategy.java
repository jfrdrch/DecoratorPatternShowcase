public class ScientistCheckStrategy extends DefaultCheckStrategy {

    // Only override the methods that differ from the default version!

    @Override
    public boolean canTreatDisease() {
        System.out.println("Scientist treat check");
        return false;
    }
}
