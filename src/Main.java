public class Main {
    public static void main(String[] args) {
        PlayerDecorator userScientist = new ScientistDecorator(new Player("Player A", "Game1"));
        PlayerDecorator botLogistician = new LogisticianDecorator(new BasicBot("Bot 1", "Game1"));
        PlayerDecorator userPlayer = new DefaultPlayerDecorator(new Player("Player B", "Game1"));

        userScientist.canMoveTo("City A");
        botLogistician.canMoveTo("City B");
        userPlayer.canMoveTo("City A");

        if(userScientist.player instanceof  BasicBot){
            System.out.println("User scientist does bot action:");
            ((BasicBot) userScientist.player).botAction();
        }
        if(botLogistician.player instanceof  BasicBot){
            System.out.println("Bot scientist does bot action:");
            ((BasicBot) botLogistician.player).botAction();
        }

        // Analog käme man an den Usernamen des echten Spielers dran
    }
}