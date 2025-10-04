public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("=== FIGHT BEGINS ===");
        System.out.println("Fighter 1: " + c1);
        System.out.println("Fighter 2: " + c2);
        System.out.println();

        int round = 1;
        final int MAX_ROUNDS = 100;
        
        while (c1.isAlive() && c2.isAlive() && round <= MAX_ROUNDS) {
            System.out.println("--- Round " + round + " ---");
            
            
            System.out.print(c1.getClass().getSimpleName() + " attacks: ");
            c1.kick(c2);
            System.out.println("Result: " + c2);
            
            if (!c2.isAlive()) {
                System.out.println(c1.getClass().getSimpleName() + " wins!");
                break;
            }
           
            System.out.print(c2.getClass().getSimpleName() + " attacks: ");
            c2.kick(c1);
            System.out.println("Result: " + c1);
            
            if (!c1.isAlive()) {
                System.out.println(c2.getClass().getSimpleName() + " wins!");
                break;
            }
            
            System.out.println();
            round++;
        }
        
        if (round > MAX_ROUNDS) {
            System.out.println("Fight ended in a draw after " + MAX_ROUNDS + " rounds!");
        }
        
        System.out.println("=== FIGHT ENDS ===");
    }
}
