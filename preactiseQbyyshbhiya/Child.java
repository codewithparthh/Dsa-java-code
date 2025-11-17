

class Grandparent {
    void showGrandparent() {
        System.out.println("This is Grandparents property.");
    }
}
class Parent extends Grandparent {
    void showParent() {
        System.out.println("This is Parents property.");
    }
}
class Child extends Parent {
    void showChild() {
        System.out.println("This is Childs property.");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.showGrandparent();  
        obj.showParent();       
        obj.showChild();
    }
}