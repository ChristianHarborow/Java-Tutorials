package Week08;

public class Hello {

    public Hello ()
    {
        sayHello ();
    }

    private void sayHello ()
    {
        System.out.println ("hello, world");
    }

    public static void main (String args[])
    {
        new Hello ();
    }
}
