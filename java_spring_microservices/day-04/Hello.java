// Notes 1
class Calculator {

    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }

    public int add(int n1, int n2, int n3) {
        int result = n1 + n2;
        return result;
    }

    // NOT ALLOWED
    // public double add(int n1, int n2) {
    // double result = n1 + n2;
    // return result;
    // }
}

public class Hello {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;

        Calculator calc = new Calculator();

        int result1 = calc.add(a, b);
        int result2 = calc.add(a, b, c);

        System.out.println(result1);
        System.out.println(result2);
    }
}