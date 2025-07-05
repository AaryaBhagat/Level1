public class RelationOp {
    public static void main(String[] args) {
        System.out.println("Welcome to Practice Set No.6");
        System.out.println();

        System.out.println("Relational Ops");
        int p = 10;
        int q = 10;
        int u = 20;
        boolean r1 = p==q;
        boolean r2 = p==u;
        boolean r3 = p>u;
        boolean r4 = q<p;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(p<=q);//Same answer, store in bollean
        System.out.println(p>=u);
        System.out.println(p>=q);
        System.out.println(p<=u);
        System.out.println(p!=q);
        System.out.println(p!=u);
    }
}
