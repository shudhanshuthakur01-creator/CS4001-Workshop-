public class mathoperations {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // this stores Arithmetic operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        // this stores Unary operators
        System.out.println("Unary Operators");
        System.out.println("Value of a: " + a);
        System.out.println("a++ : " + (a++));
        System.out.println("After a++ value: " + a);
        System.out.println("++a : " + (++a));

        // this stores Assignment operator
        int c = 10;
        c += 5;
        System.out.println("Assignment operator result: " + c);

        // this stores Relational operators
        System.out.println("Relational Operators");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));

        // this stores Logical operators
        System.out.println("Logical Operators");
        System.out.println((a > b) && (b > 2));
        System.out.println((a > b) || (b < 2));

        // Ternary operator
        String result;
        result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
