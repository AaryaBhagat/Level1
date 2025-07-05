public class AssignmentOp {
    public static void main(String[] args) {
        System.out.println("Welcome to Practice Set No.5");
        System.out.println("\n");

        System.out.println("Assignment Ops:");
        System.out.println("concatenation");
        int age, cost, number;
        age = 19;
        cost = 20000;
        number = 919;
        System.out.println(age + "  " + cost + "  " + number);
        
        System.out.println("Chaining");
        int m1,m2,m3,m4;
        m1= m2 = m3 = m4 = 10;
        System.out.println(m1+ " "+ m2+ " "+ m3+" "+m4);

        System.out.println("Compound Assign Op");
        int a,b,c,d;
        a = b = c = d = 10;
        a += 5;
        b -= 5;
        c /= 5;
        d *= 5;
        System.out.println(a + "  " + b + "  " + c + "  " + d);

        System.out.println("Exp");
        int x,y;
        x=y=10;
        x =+ 5;
        y =- 5;
        System.out.println(x + " " + y);
    }
}
