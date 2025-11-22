// Notes 1
// class A {
// public A() {
// super();
// System.out.println("Inside A constructor");
// }

// public A(int a) {
// super();
// System.out.println("Inside A constructor int");
// }
// }

// class B extends A {
// public B() {
// super();
// System.out.println("Inside B constructor");
// }

// public B(int b) {
// // super(b);
// this(); // use this if you want to execute both the constructors of the same
// class.
// System.out.println("Inside B constructor int");
// }
// }

// public class Hello {
// public static void main(String[] args) {
// // B b = new B();
// B b = new B(20);
// }
// }

// Notes 2
class A {
    public A() {
        System.err.println("Inside A constructor");
    }

    public void show() {
        System.out.println("Show A");
    }
}

class B extends A {
    public B() {
        System.err.println("Inside B constructor");
    }
}

class Hello {
    public static void main(String[] args) {
        // new A(); // anonymous object
        new A().show();
        new A().show();
    }
}