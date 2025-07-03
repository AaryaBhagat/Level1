public class Typecasting {
   public static void main(String[] args) {
    System.out.println("Welcome to Practice Set No.3");
    System.out.println();
    System.out.println("Implecit");
    int M1 = 45;
    System.out.print("Your Mark1: ");
    System.out.println(M1);
    double M2;
    M2 = M1;
    System.out.print("Your Mark2: ");
    System.out.println(M2);
    System.out.println();

    System.out.println("Explecit");
    double M3 = 45.8;
    System.out.print("Mark3: ");
    System.out.println(M3);
    int M4;
    M4 = (int)M3;
    System.out.print("Mark4: ");
    System.out.println(M4);
    System.out.println();
   }    
}