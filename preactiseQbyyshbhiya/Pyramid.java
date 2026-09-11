// // import java.util.*;

// public class Pyramid {
//     public static void main(String args[]){
//         int n = 10;
//         int even = 2;
//         int count = 0;

//         for(int line=0; line<=n; line++ ){
          
//             for(int number=1; number<=line; number++){ // number<=line; number++
                 
//                     System.out.print(even + " ");
//                     even += 2;
//                 count++;
                 
//             }
           
//             System.out.println();
            
            
//         }
//         System.out.println("count:"+count);
//     }
// }
import java.util.*;
public class Test.class {
    private int[] stackArr;
    private int top = -1;
    private int maxSize;

    public Test.class(int size) {
        maxSize = size;
        stackArr = new int[maxSize];
    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            stackArr[++top] = item;
            System.out.println("pushed " + item);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; // sentinel for underflow
        } else {
            int item = stackArr[top--];
            return item;
        }
    }

    public static void main(String[] args) {
        StackExample s = new StackExample(10);

        s.push(35);
        s.push(20);

        System.out.println("popped " + s.pop());
        System.out.println("popped " + s.pop());
        System.out.println("popped " + s.pop()); // will show underflow and print -1
    }
}

