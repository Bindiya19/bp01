public class Calculator {
    static int a = 30;
    static int b =40;
    static int ans;
    static void add() {
        ans = a + b;
        System.out.println("Addition of " + a + " and " + b + " = " + ans);
    }

    static void sub() {
        ans = a - b;
        System.out.println("Subtraction of "+ a + " and " + b + " = " + ans);
    }

    static void multiplication(int a, int b){
        ans = a * b;
        System.out.println("multiplication of " + a + "times" + b + " = " + ans);

    }

    static void divisition(int a, int b) {
        ans = a / b;
        System.out.println("dividing of "  +  a + " and " + b + " = " + ans);
        System.out.println("change");
    }

    public static void main(String[] args) {
        sub();
        add();
        multiplication(30, 40 );
        multiplication(20, 20);
        Calculator.divisition(8, 4);



        }
    }