public class Main {
    public static void main(String[] args) {
        BotPlayer botScientist = new BotPlayer("botScientist", "testGame", new ScientistCheckStrategy());
        RealPlayer playerScientist = new RealPlayer("realPlayer", "testGame", new ScientistCheckStrategy());
        RealPlayer defaultPlayer = new RealPlayer("defaultPlayer", "testGame", new DefaultCheckStrategy());
        RealPlayer playerLogistician = new RealPlayer("playerLogistician", "testGame", new LogisticianCheckStrategy());

        botScientist.canTreatDisease();
        botScientist.canMoveTo();

        playerScientist.canTreatDisease();
        playerScientist.canMoveTo();

        defaultPlayer.canTreatDisease();
        defaultPlayer.canMoveTo();

        playerLogistician.canTreatDisease();
        playerLogistician.canMoveTo();

        if (botScientist.isScientist()){
            System.out.println("Scientist actions can happen here");
        }
        if (playerScientist.isScientist()){
            System.out.println("Scientist actions can happen here as well");
        }
    }
}