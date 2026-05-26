
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

    }
}