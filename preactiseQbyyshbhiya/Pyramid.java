import java.util.*;

public class Pyramid {
    public static void main(String args[]){
        int n = 10;
        int even = 2;
        int count = 0;

        for(int line=0; line<=n; line++ ){
          
            for(int number=1; number<=line; number++){
                 
                    System.out.print(even + " ");
                    even += 2;
                count++;
                 
            }
           
            System.out.println();
            
            
        }
        System.out.println("count:"+count);
    }
}
