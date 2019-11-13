package test;

public class Cat
{
    long length;
    public Cat(long l)
    {
        length = 1;
    }
    public static void main(String arg[])
    {
        Cat c1, c2, c3;
        c1 = new Cat(10L);
        c2 = new Cat(10L);
        c3 = c2;
        long m = 21L;
        System.out.println(c1==c2);
        System.out.println(c2==c3);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
    }
}
 