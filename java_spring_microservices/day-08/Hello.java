// Notes 1
// class Student {
// private String name;
// private int age;

// public int getAge() {
// return this.age;
// }

// public String getName() {
// return name;
// }

// public void setName(String name) { // name = local variable
// this.name = name; // this.name = refers to the instance variable
// }

// public void setAge(int age, Student stu) {
// // age = age; doesn't work and returns 0

// // Student stu = new Student(); doesn't work since we are creating a new
// object
// // and returns 0
// // stu.age = age;

// // Student stu1 = stu; works because we are referring to the same object
// created
// // in class Hello
// // stu1.age = age;

// this.age = age;
// }
// }

// public class Hello {
// public static void main(String[] args) {
// Student stu = new Student();

// stu.setName("Binita");
// stu.setAge(25, stu);

// System.out.println(stu.getName());
// System.out.println(stu.getAge());
// }
// }

// Notes 2
class Student {
    private String name;
    private int age;

    public Student() { // default constructor
        System.out.println("Inside Default Constructor");
    }

    public Student(String name, int age) { // parameterized constructor
        this.name = name;
        this.age = age;

        System.out.println("Inside Parameterized Constructor");
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

    }
}

public class Hello {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("Binita", 25);

        System.out.println(stu1.getName() + " : " + stu1.getAge());
    }
}
