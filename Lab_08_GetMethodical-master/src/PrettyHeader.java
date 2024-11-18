public class PrettyHeader {
    public static void main(String[] args) {
        prettyHeader("Hi");

    }


    public static void prettyHeader(String msg) {
        final int WIDTH = 60;
        final String STAR = "*";
        final String SPACE = " ";

        // Calculate padding
        int padding = (WIDTH - msg.length() - 6) / 2;

        // Print the top line of asterisks
        for (int i = 0; i < WIDTH; i++) {
            System.out.print(STAR);
        }
        System.out.println();

        // Print the message line
        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(SPACE);
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(SPACE);
        }
        if ((msg.length() % 2) != 0) { // Adjust for odd length messages
            System.out.print(SPACE);
        }
        System.out.println("***");

        // Print the bottom line of asterisks
        for (int i = 0; i < WIDTH; i++) {
            System.out.print(STAR);
        }
        System.out.println();
    }
}