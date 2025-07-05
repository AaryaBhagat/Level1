public class LogicalOp {
    public static void main(String[] args) {
        System.out.println("Welcomr to Practice Set No.7");
        System.out.println();

        int a = 10;
        int b = 20;
        int c = 10;
        boolean r1 = a==c;//T
        boolean r2 = a==b;//F
        boolean r3 = a<=b;//T
        boolean r4 = a>=c;//T
        boolean r5 = a!=c;//F
        boolean r6 = b<c; //F
        System.out.println("AND");
        System.out.println(r1 && r2 && r3);
        System.out.println(r1 && r3 && r4);
        System.out.println(r4 && r2 && r5);
        System.out.println();
        
        System.out.println("OR");
        System.out.println(r1 || r3 || r6);
        System.out.println(r4 || r2 || r5);
        System.out.println(r2 || r5 || r6);
        System.out.println();

        System.out.println("NOT");
        boolean final1 = !(r1||r2);//T
        boolean final2 = !(r1&&r2);//F
        System.out.println(final1);
        System.out.println(final2);
    }
}
