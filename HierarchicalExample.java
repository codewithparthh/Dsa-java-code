class Parent {
    String familyName = "Sharma";  

    void showParent() {
        System.out.println("This is " + familyName + " family's property.");
    }
}


class Child1 extends Parent {
    String childName = "Aarav";  

    void showChild1() {
        System.out.println(childName + " is the first child of the " + familyName + " family.");
    }
}


class Child2 extends Parent {
    String childName = "Vihaan";  // Child2 variable

    void showChild2() {
        System.out.println(childName + " is the second child of the " + familyName + " family.");
    }
}


class Child3 extends Parent {
    String childName = "Kavya";  // Child3 variable

    void showChild3() {
        System.out.println(childName + " is the third child of the " + familyName + " family.");
    }
}

public class HierarchicalExample {
    public static void main(String[] args) {
        // Creating objects of each child class
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        Child3 obj3 = new Child3();

        System.out.println("--- Object of Child1 ---");
        obj1.showParent();
        obj1.showChild1();

        System.out.println("\n--- Object of Child2 ---");
        obj2.showParent();
        obj2.showChild2();

        System.out.println("\n--- Object of Child3 ---");
        obj3.showParent();
        obj3.showChild3();
    }
}