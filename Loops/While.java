// import java.util.*;

// public class While{
//     public static void main(String args[]){
//         int counter = 0;
//         while (counter <100 ){
//             System.out.println("ram ram");
//             counter++;
//         }
//         System.out.println("printed rr 100x");
//     }
// }

// import java.util.*;

// public class While{
//     public static void main(String args[]) {
//         int counter = 1;
//         while(counter <= 50) {
//             System.out.println(counter+" ");
//             counter++;
//         }
//         System.out.println();
//     }
// }

import java .util.*;

public class While{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
         int i=1;
         while (i<=n) {
            sum += i;
            i++;
         }
         System.out.println(sum);
        
    }
}
