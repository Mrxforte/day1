
class App {
    public static void main(String[] args) {

        // find the symbol at a specific index in a string

        System.out.println("Hello, World!");
        var index = 0;
        var text = "This is a sample text.";
        var symbolAt = text.charAt(index);
        System.out.println("Symbol at index " + index + ": " + symbolAt);

        // working with the errors

        char mySymbol = 'A';
        System.out.println("My symbol: " + mySymbol);

        for (int i = 0; i < text.length(); i++) {
            System.out.println("Symbol at index " + i + ": " + text.charAt(i));
        }

        // data types in java

        // byte
        byte myByte = 127; // range: -128 to 127
        System.out.println("Byte value: " + myByte);
        // short
        short myShort = 32767; // range: -32768 to 32767
        System.out.println("Short value: " + myShort);
        // int
        int myInt = 2147483647; // range: -2147483648 to 2147483647
        System.out.println("Int value: " + myInt);
        // long
        long myLong = 9223372036854775807L; // range: -9223372036854775808 to 9223372036854775807
        System.out.println("Long value: " + myLong);
        // float
        float myFloat = 3.14f; // range: approximately ±3.40282347E+38F (6-7 significant decimal digits)
        System.out.println("Float value: " + myFloat);
        // double
        double myDouble = 3.141592653589793; // range: approximately ±1.7976931348623157E+308D (15 significant decimal
                                             // digits)
        System.out.println("Double value: " + myDouble);
        // boolean
        boolean myBoolean = true; // values: true or false
        System.out.println("Boolean value: " + myBoolean);
        // char
        char myChar = 'A'; // range: '\u0000' (or 0) to '\uffff' (or 65,535)
        System.out.println("Char value: " + myChar);
        // String
        String myString = "Hello, Java!"; // a sequence of characters
        System.out.println("String value: " + myString);

        // math in the java

        int a = 10;
        int b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // using the increment and decrement operators

        int x = 5;
        System.out.println("Initial value of x: " + x);
        x++; // increment x by 1
        System.out.println("After incrementing x: " + x);
        x--; // decrement x by 1
        System.out.println("After decrementing x: " + x);

        // String fromatting in java

        String name = "Alice";
        int age = 30;
        String formattedString = String.format("My name is %s and I am %d years old.", name, age);
        System.out.println(formattedString);

        // old way of string formatting
        System.out.println("Hello %s, you are %d years old.".formatted(name, age));

    }
}