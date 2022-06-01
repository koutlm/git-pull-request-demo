public class HelloWorld {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println(a + "+" + b + "=" + add(a,b));
    }

    private static int add(int a, int b) {
        return a+b;
    }


}