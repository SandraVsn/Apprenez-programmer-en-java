package boucleWhile;

public class While {
    public static void main(String[] args) {
        // Boucle "While" : ne fera pas de push up
        int pushUpGoal = 0;
        while (pushUpGoal > 0) {
            System.out.println("Push up!");
            pushUpGoal -= 1;
        }
        // Boucle "do/while" fera un push up quoi qu'il arrive au début avant de
        // vérifier la condition
        pushUpGoal = 0;
        do {
            System.out.println("Push up ???");
            pushUpGoal -= 1;
        } while (pushUpGoal > 0);
    }
}
