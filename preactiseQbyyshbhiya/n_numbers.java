import java.util.*;

public class n_numbers {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in); // FIX 1
        int range = sc.nextInt();

        int counter = 1;

        while(counter <= range){
            System.out.print(counter + " ");
            counter++;
        }

        System.out.println();  // FIX 2: inside main()
    }
}
