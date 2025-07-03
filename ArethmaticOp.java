public class ArethmaticOp {
    public static void main(String[] args) {
        System.out.println("Welcome to Practice Set No.4");
        System.out.println();
        int a = 12;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println("\n");
        float x = a;
        float y = b;
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println("\n");
        double p = 8;
        double q = 3;
        System.out.println(p/q);
        System.out.println(p%q);
        System.out.println();
        float c;
        float d;
        c = (float)p;
        d = (float)q;
        System.out.println(c/d);
        System.out.println(c%d);
        System.out.println();

        System.out.println("BODMAS");
        System.out.println(a/b*c/d);
        System.out.println(p-q/d*b);
        System.out.println(p*q-a+b);
    }
}
