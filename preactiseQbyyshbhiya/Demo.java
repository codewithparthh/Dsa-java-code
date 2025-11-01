class Test {
    int id;
    String name;

    Test() {
        id = 0;
        name = "SAMARTH";
        System.out.println("Default Constructor called.");
    }
    Test(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized Constructor called.");
    }
    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Demo {
    public static void main(String[] args) {

       
        Test obj1 = new Test();
        obj1.display();

        System.out.println();

        Test obj2 = new Test(101, "RAAJ");
        obj2.display();
    }
}