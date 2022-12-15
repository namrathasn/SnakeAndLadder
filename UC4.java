public class UC4 {
    public static void main(String[] args) {

        System.out.println("Welcome to Snake And Ladder Program");
        {
            int random_number = 0;
            int firstSnake_Position = 20;
            int secondSnake_Position = 68;
            while (random_number < 100) {
                int random_Check = (int) Math.floor(Math.random() * 10) % 6;
                if (random_Check != 0) {
                    random_number = random_number + random_Check;
                }
                if (random_number == firstSnake_Position) {
                    System.out.println("Dies Moved to Snakes Position and moved towards backward direction:");
                    random_number = 0;
                } else if (random_number == secondSnake_Position) {
                    System.out.println("Dies Moved to Snakes Position and moved towards backward direction:");
                    random_number = 0;
                }
                if (random_Check != 0) {
                    System.out.println("Ladder got a Number : " + random_Check + " My Ladder Moved to the Position : " + random_number);
                }
            }
        }
    }
}