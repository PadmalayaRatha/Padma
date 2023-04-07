import java.util.Random;
public class RandomNumber{

    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt(50);
        int y = random.nextInt(1000);

        System.out.println("Randomly generated integer values:");
        System.out.println(x);
        System.out.println(y);

        double a = random.nextDouble();
        double b = random.nextDouble();

        System.out.println("Randomly generated double values:");
        System.out.println(a);
        System.out.println(b);

        float f = random.nextFloat();
        float i = random.nextFloat();

        System.out.println("Randomly generated float values:");
        System.out.println(f);
        System.out.println(i);

        long p = random.nextLong();
        long q = random.nextLong();

        System.out.println("Randomly generated long values:");
        System.out.println(p);
        System.out.println(q);

        boolean m = random.nextBoolean();
        boolean n = random.nextBoolean();

        System.out.println("Randomly generated boolean values:");
        System.out.println(m);
        System.out.println(n);
    }
}







