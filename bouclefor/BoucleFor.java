package bouclefor;

public class BoucleFor {
    static int[] myArray = new int[] { 7, 2, 4 };

    public static void main(String[] args) {
        for (int i = 0; i < myArray.length; i++) {
            bonjour(Integer.toString(i));
        }
    }

    static void bonjour(String nom) {
        System.out.println("Bonjour " + nom + " !!");
    }
}
