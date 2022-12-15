public class UC2 {
    public static void main(String[] args) {

        System.out.println("Welcome to Snake And Ladder Program");
        {
            int random_check = (int) Math.floor(Math.random() * 10) % 7;

            if (random_check != 0) {
                System.out.println("The player dice number is : " + random_check);
            }
        }
    }
}

