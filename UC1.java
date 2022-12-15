public class UC1 {
    public static void main(String[] args) {

        System.out.println("Welcome to Snake And Ladder Program");
        {
            int single_player = 0;
            System.out.println("Game Starts at: " + single_player);
            int random = (int) Math.floor(Math.random() * 10) & 6;
            if (random != 0) {
                single_player = single_player + random;
                System.out.println("player moved to " + single_player);
            }
        }
    }
}