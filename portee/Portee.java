package portee;

public class Portee {

    public static void main(String[] args) {
        // Works if variable is public but not if is private
        // System.out.println(Exemple.text);

        // Works if method is public but not if private
        Exemple.printText();
    }
}

class Exemple {
    // public static String text = "Hello";
    private static String text = "Hello";

    public static void printText() {
        System.out.println(text);
    }
}
