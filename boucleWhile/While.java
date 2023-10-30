package boucleWhile;

public class While {
    public static void main(String[] args) {
        int i = randomNumber();
        while (i < 90) {
            i = randomNumber();
            System.out.println(i);
        }
    }

    static int randomNumber() {
        return (int) ((Math.random() * ((100 - 1) + 1)) + 1);
    }

}
