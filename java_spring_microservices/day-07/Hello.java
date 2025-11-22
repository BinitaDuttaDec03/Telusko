// Notes 1
// class Student {
// private String name = "Binita"; // name is accessible only inside this class
// int age = 25;

// public String getName() {
// return name;
// }

// public int getAge() {
// return age;
// }
// }

// public class Hello {
// public static void main(String[] args) {
// Student obj = new Student();

// // obj.name = "Binita"; not allowed
// System.out.println(obj.getName());
// }
// }

//Notes 2
class Student {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class Hello {
    public static void main(String[] args) {
        Student obj = new Student();

        obj.setAge(10);
        System.out.println(obj.getAge());
    }
}