package Section8_OOPs;

public class ClassObject {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColour("Blue");
        System.out.println(p1.colour);

    }
}

class Pen {
    String colour;
    int tip;

    void setColour(String newColour) {
        colour = newColour;
    }

     void setTip(int newTip){
        tip = newTip;
     }
    }

    class Student {
        String name;
        int age;
        float percentage;

        void calcPercentage(int phy, int chem, int math) {
            percentage = (phy + chem + math) / 3;
        }
    }

