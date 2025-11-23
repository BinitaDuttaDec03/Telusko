class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc {
    public int add(int n1, int n2) {
        return n1 + n2 + 1; // method overriding
    }
}

public class Hello {
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc();
        System.out.println(c.add(2, 3));
    }
}
