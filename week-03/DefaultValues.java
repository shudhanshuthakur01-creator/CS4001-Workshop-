public class DefaultValues {

    // declaring variables without giving values
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args) {

        // this creats object of the class
        DefaultValues obj = new DefaultValues();

        // this prints default values
        System.out.println("Default byte: " + obj.b);

        System.out.println("Default short: " + obj.s);

        System.out.println("Default int: " + obj.i);

        System.out.println("Default long: " + obj.l);

        System.out.println("Default float: " + obj.f);

        System.out.println("Default double: " + obj.d);

        System.out.println("Default char: " + obj.c);

        System.out.println("Default boolean: " + obj.bool);

        // Local variables inside methods must be initialized before use.
       // If we try to print them without assigning a value,
      // Java will give a compile-time error.
    }
}
