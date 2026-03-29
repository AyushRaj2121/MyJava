public class ternanryoperator {
    public static void main(String args[])
    {
        int a = 10;
        int b = 20;
        int c = 30;
        //int max = (a > b) ? System.out.println("the maximum of " + a + " and " + b + " is " + max) : (b > c) ? b : c;

        //What’s wrong
        //1) The ternary operator must return a value (not void)
        //This line tries to use System.out.println(...) inside the ternary:
        //System.out.println(...) returns void

        int max = (a > b) ? a : (b > c) ? b : c;
        System.out.println("the maximum of " + a + "," + b + "," + c + " is " + max);
    }
}
