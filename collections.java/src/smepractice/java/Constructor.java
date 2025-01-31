package smepractice.java;

class C
{
    String name;
    int age;

    C(String s, int a)
    {
        name = s;
        age = a;
    }

    void show() {
        System.out.println("Your name is " + name + " and your age is " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        C obj = new C("suguna", 24);
        obj.show();
    }
}
