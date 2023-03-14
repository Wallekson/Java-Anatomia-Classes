import org.w3c.dom.ls.LSOutput;

public class ExercicioOperadoresRelacionais {

    public static void main(String[] args) {


        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        char c1 = 'x';
        char c2 = 'y';
        double d1 = 5.9;
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 100000L;
        long l2 = 200000L;
        short h1 = 25;
        byte y1 = 1;



        System.out.println("l1 == l2 " + (l1 == l2));
        System.out.println("l1 != l2 " + (l1 != l2));
        System.out.println("l1 > l2 " + (l1 > l2));
        System.out.println("l1 <= l2 " + (l1 <= l2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2 " + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
        //System.out.println(s1 >= s2);
        //System.out.println(s1 < s2);

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
        //System.out.println(b1 > b2);
        //System.out.println(b1 <= b2);

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
        //System.out.println(s2 != c1);
        //System.out.println(s3 != i1);

        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 >= i1 " + (l2 >= i1));
        System.out.println("y1 != h2 " + (y1 != h1));





    }

}