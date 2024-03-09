public class CalculationH_W {
    static int a = 55;
    static int b = 45;
    static int ans;
    static void addition() {
        ans = a + b;
        System.out.println("Addition of " + a + " and " + b + " = " + ans);
    }static void subtraction(){
        ans = a - b;
        System.out.println("subtraction of " + a + " and " + b + " = " + ans);
    }void addition(int a, int b ){
    System.out.println("addition of" + a + "+" + b + " = " + ans);
    }
    void subtraction(int a, int b){
        System.out.println("subtraction of" + a + " + " + b + " = " + ans );
    }
    public static void main(String[]args){
        CalculationH_W calculationHW = new CalculationH_W ();
        addition();
        subtraction();
        CalculationH_W.addition();
        CalculationH_W.subtraction();
    }
}

