public class Demo {
    public static void main(String args[]) {
        System.out.println("=== HEROES GAME ===");
        
        CharacterFactory factory = new CharacterFactory();
        GameManager gameManager = new GameManager();
        
      
        Character character1 = factory.createCharacter();
        Character character2 = factory.createCharacter();
      
        gameManager.fight(character1, character2);
    }
}
