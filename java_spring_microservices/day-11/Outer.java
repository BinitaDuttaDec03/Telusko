import accessmods.*;

class Abc extends Inner {
    public void abc() {
        System.out.println(marks);
    }
}

public class Outer {
    public static void main(String[] args) {
        AnotherOuter ao = new AnotherOuter();
        System.out.println(ao.marks); // accessible

        Inner i = new Inner();
        System.out.println(i.age);
        // System.out.println(i.marks); not accessible like this

        Abc abc = new Abc();
        abc.abc();
    }
}
