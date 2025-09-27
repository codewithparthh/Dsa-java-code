import java.util.*;

public class Array{
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
               secondlargest = numbers[i];
             

            }
        }
        for (int i=0;i<number.length;i++)
0
        return largest;
    }
    public static void main(String args[]){
        int number[] = {1,2,8,6,1};
       System.out.println("largest value is : " + getLargest(number));
        //System.out.println("integer min value: " + Integer.MIN_VALUE);
    }
}
