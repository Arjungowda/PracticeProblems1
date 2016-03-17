/**
 * Created by mandy on 3/6/2016.
 */
public class test {

}
class A
{
    int i;

    {
        System.out.println("First IIB Block");
    }

    {
        System.out.println("Second IIB Block");
    }

    A(int j)
    {
        this();
        System.out.println("First Constructor");
    }

    A()
    {
        System.out.println("Second Constructor");
    }
}

class MainClass
{
    public static void main(String[] args)
    {
        A a = new A(50);
    }
}
