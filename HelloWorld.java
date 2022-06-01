public class HelloWorld {

    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println(a + "+" + b + "=" + add(a,b));
    }

    private static int add(int a, int b) {
        return a+b;
    }
    private static int subtract(int a, int b) {
        return a-b;
    }


}