import java.util.Scanner;

class Add {
    int addNumbers(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Add obj = new Add();
        Sub obj1 = new Sub();
        int result = obj.addNumbers(a, b);  
        System.out.println("Result = " + obj1.subNumbers(result, c));
        sc.close();
    }
}

class Sub {
    int subNumbers(int a, int b) {
        return a - b;
    }
}