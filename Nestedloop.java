public class Nestedloop {
    public static void main (String args[]) {

        for(int line = 1; line <= 69; line++) {
            for(int star = 1; star <= line; star++) {
                System.out.print("*");   // use print instead of println
            }
            System.out.println();
        }

    }
}
