// Notes 1
// public class Hello {
// public static void main(String[] args) {
// // String name = new String("Binita");
// String name = "Binita"; // behind the scenes it using the above method to
// create the string
// String name1 = "Binita";

// System.out.println(name);
// System.out.println(name.hashCode());

// /*
// * due to string constant pool in the memory heap, object "name" is created
// only
// * once. The reference of which is stored in the stack. so 'name' & 'name1'
// both
// * share the same reference.
// */
// System.out.println(name == name1);
// }
// }

// Notes 2
// public class Hello {
// public static void main(String[] args) {
// StringBuffer sb = new StringBuffer();
// StringBuffer sb1 = new StringBuffer("Binita");

// // System.out.println(sb.capacity()); // 16
// // System.out.println(sb1.capacity()); // 22

// sb1.append(" Dutta");
// // System.out.println(sb1);

// String str = sb1.toString();
// System.out.println(str);
// }
// }

// Notes 3
// class Mobile {
// // instance variables
// String brand;
// int price;
// static String name;

// public void show() {
// System.out.println(brand + " : " + price + " : " + name);
// }
// }

// public class Hello {
// public static void main(String[] args) {
// Mobile mb1 = new Mobile();
// mb1.brand = "Apple";
// mb1.price = 100;

// Mobile mb2 = new Mobile();
// mb2.brand = "Samsung";
// mb2.price = 80;

// Mobile.name = "Smartphone";

// mb1.show();
// mb2.show();
// }
// }

// Notes 4
// class Mobile {
// String brand;
// int price;
// static String name;

// public Mobile() { // constructor (not a good place to provide default values
// to your static
// // variables)
// brand = "";
// price = 200;

// System.out.println("In constructor");
// }

// static { // the default for static variables are initilaized in this block
// name = "Binita";
// System.out.println("In static block");
// }

// public void show() {
// System.out.println(brand + " : " + price + " : " + name);
// }
// }

// public class Hello {
// public static void main(String[] args) {
// Mobile mb1 = new Mobile();
// mb1.brand = "Apple";
// mb1.price = 100;

// Mobile mb2 = new Mobile();
// mb2.brand = "Samsung";
// mb2.price = 80;
// }
// }

// Notes 5
class Mobile {
    String brand;
    int price;
    static String name;

    public Mobile() { // constructor (not a good place to provide default values to your static
                      // variables)
        brand = "";
        price = 200;
    }

    static { // the default for static variables are initilaized in this block
        name = "Binita";
    }

    public void show() { // non-static method
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        System.out.println("Static method show1");
        // System.out.println(brand + " : " + price + " : " + name); not allowed
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }
}

public class Hello {
    public static void main(String[] args) throws ClassNotFoundException {
        Mobile mb1 = new Mobile();
        mb1.brand = "Apple";
        mb1.price = 100;

        Mobile mb2 = new Mobile();
        mb2.brand = "Samsung";
        mb2.price = 80;

        // mb1.show1();
        // Mobile.show(); not allowed

        // Mobile.show1();
        Mobile.show1(mb1);
    }
}