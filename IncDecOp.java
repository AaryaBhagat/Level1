public class IncDecOp {
    public static void main(String[] args) {
        System.out.println("Welcome to Practice Set No.4");
        System.out.println("Inc");
        int a = 5;
        a = a+1;
        System.out.println(a);
        System.out.println("Dec");
        a = a-1;
        System.out.println(a);
        System.out.println("\n");

        System.out.println("Post-Inc: a++ , Pre-Inc: ++a");
        int b = 5;
        int c;
        c = b++;
        System.out.println(c);
        c = ++b;
        System.out.println(c);
        System.out.println("\n");

        System.out.println("Post-Dec: a-- , Pre-Dec: --a");
        int d = 5;
        int e;
        e = d--;
        System.out.println(e);
        e = --d;
        System.out.println(e);
        System.out.println("\n");

        System.out.println("Qus");
        int x = 10;
        int y;
        y = x++ + ++x + --x + x--;
        System.out.println(x);
        System.out.println(y);
        System.out.println("\n");

        int p = 10;
        int q;
        q = p++ + ++p + ++p + p++ + --p + p--;
        System.out.println(p);
        System.out.println(q);
    }
}
