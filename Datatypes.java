public class Datatypes {
    public static void main(String args[]) {
        System.out.println("Welcome to Practice Set No.2");
        System.out.println("\n");
        System.out.println("For whole no.");
        byte B1 = 100;
        byte B2 = 12;
        short S1 = 90;
        short S2 = 140;
        int I1 = 80;
        int I2 = 16;
        long L1 = 70l;
        long L2 = 20000070l;

        int Result1 = B1+B2;
        System.out.print("Result 1 = ");
        System.out.println(Result1);

        int Result2 = S1-I2;
        System.out.print("Result 2 = ");
        System.out.println(Result2);

        long Result3 = L2-L1;
        System.out.print("Result 3 = ");
        System.out.println(Result3);

        long Result4 = S1*L1;
        System.out.print("Result 4 = ");
        System.out.println(Result4);

        int Result5 = B1*I2;
        System.out.print("Result 5 = ");
        System.out.println(Result5);

        int Result6 = S2/I1;
        System.out.print("Result 6 = ");
        System.out.println(Result6);// truncated
        System.out.println();

        System.out.println("For real no.");
        float a = 10.5f;
        float b = 1.987654321f; 
        double c = 1.987654321;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();
        
        System.out.println("For Character");
        char x = '4';
        char y = 'A';
        char z = '%';
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println();

        System.out.println("For Logical");
            boolean isRaining = true;
    if (isRaining) {
        System.out.println("Take an umbrella.");
    } else {
        System.out.println("Enjoy the sunshine.");
    }
    }
}