// Notes 1
// class Calculator {
// int num = 10; // instance variable

// public int add(int n1, int n2) { // added to stack
// System.out.println(num);
// return n1 + n2;
// }
// }

// public class Hello {
// public static void main(String args[]) {
// int data = 10; // added to stack

// Calculator obj = new Calculator(); // creates a new object obj in the heap
// memory
// Calculator obj1 = new Calculator(); // creates a new object obj1 in the heap
// memory

// // int result = obj.add(3, 4); // added to stack
// // System.out.println(result);

// obj.num = 4;

// obj.add(3, 4); // 4
// obj1.add(5, 6); // 4 (does not change num to 4)
// }
// }

// Notes 2 - declaring
// public class Hello {
// public static void main(String args[]) {
// int arr1[] = { 1, 2, 3 };
// int arr2[] = new int[4];

// // System.out.println(arr1); // returns the addresses
// // System.out.println(arr2); // returns the addresses

// arr1[1] = 9;
// // System.out.println(arr1[1]); // 9

// /*
// * multi-dimensional array (outer array has 3 inner arrays, and each of the
// * arrays has 4 boxes )
// */
// int nums[][] = new int[3][4];

// for (int i = 0; i < 3; i++) {
// for (int j = 0; j < 4; j++) {
// nums[i][j] = (int) (Math.random() * 10);
// System.out.print(nums[i][j] + " ");
// }

// System.out.println();
// }
// }
// }

// Notes 3 - enhanced for-loop
// public class Hello {
// public static void main(String args[]) {
// int nums[][] = new int[3][4];

// for (int n[] : nums) {
// for (int m : n) {
// System.out.print(m + " ");
// }
// System.out.println();
// }
// }
// }

// Notes 4 - jagged-array
// public class Hello {
// public static void main(String args[]) {
// int nums[][] = new int[3][];

// nums[0] = new int[3];
// nums[1] = new int[2];
// nums[2] = new int[4];

// for (int i = 0; i < nums.length; i++) {
// for (int j = 0; j < nums[i].length; j++) {
// nums[i][j] = (int) (Math.random() * 10);
// }
// }

// for (int n[] : nums) {
// for (int m : n) {
// System.out.print(m + " ");
// }

// System.out.println();
// }
// }
// }

// Notes 5
// class Student {
// int rollNo;
// String name;
// int marks;
// }

// public class Hello {
// public static void main(String args[]) {
// Student s1 = new Student();
// s1.rollNo = 1;
// s1.name = "Binita";
// s1.marks = 100;

// Student s2 = new Student();
// s2.rollNo = 2;
// s2.name = "Riya";
// s2.marks = 99;

// Student s3 = new Student();
// s3.rollNo = 3;
// s3.name = "Jhoom";
// s3.marks = 98;

// Student students[] = new Student[3];
// students[0] = s1;
// students[1] = s2;
// students[2] = s3;

// for (int i = 0; i < students.length; i++) {
// System.out.println(students[i].name + " : " + students[i].marks);
// }
// }
// }

// Notes 6 - for-each loop
// public class Hello {
// public static void main(String args[]) {
// int nums[] = new int[4];

// for (int i = 0; i < nums.length; i++) {
// nums[i] = i + 1;
// }

// for (int n : nums) {
// System.out.println(n);
// }
// }
// }

// Notes 7
class Student {
    int rollNo;
    String name;
    int marks;
}

public class Hello {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.rollNo = 1;
        s1.name = "Binita";
        s1.marks = 100;

        Student s2 = new Student();
        s2.rollNo = 2;
        s2.name = "Riya";
        s2.marks = 99;

        Student s3 = new Student();
        s3.rollNo = 3;
        s3.name = "Jhoom";
        s3.marks = 98;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student student : students) {
            System.out.println(student.name + " : " + student.marks);
        }
    }
}