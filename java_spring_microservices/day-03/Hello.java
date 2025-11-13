// Notes 1
// class Hello {
// public static void main(String args[]) {
// int num1 = 0b101; // binary number
// int num2 = 0x7E; // hexadecimal number
// int num3 = 10_00_00_000;

// System.out.println(num1);
// System.out.println(num2);
// System.out.println(num3);
// }
// }

// Notes 2
// class Hello {
// public static void main(String args[]) {
// char ch = 'a';
// ch++;

// System.out.println(ch);
// }
// }

// Notes 3
// class Hello {
// public static void main(String args[]) {
// byte b = 12;
// int a = 127;

// // b = (byte) a;
// // System.out.println(b); // 12 (type casted - explicit conversion)

// // b = a;
// // System.out.println(b); // cannot convert int to byte

// // a = (int) b;
// // System.out.println(a); // 12

// a = b;
// System.out.println(a); // 12 - implicit conversion
// }
// }

// Notes 4
// class Hello {
// public static void main(String args[]) {
// float f = 5.6f;
// int x = (int) f;

// System.out.println(x); // 5
// }
// }

// Notes 5
// class Hello {
// public static void main(String args[]) {
// // byte b = 257; // not allowed because byte ranges from -128 to 127
// byte b = 127;
// int a = b;

// System.out.println(a); // 127
// }
// }

// Notes 6
// class Hello {
//     public static void main(String args[]) {
//         int a = 259;
//         byte k = (byte) a;

//         System.out.println(k); // 1 ()
//     }
// }

// Notes 7
class Hello {
    public static void main(String args[]) {
        byte a = 10;
        byte b = 30;

        int c = a * b; // type promotion (because of the range of byte)

        System.out.println(c); // 1 ()
    }
}