import java.util.Random;

public class Knight extends Character {
    private static final Random random = new Random();

    public Knight() {
        super(random.nextInt(11) + 2, random.nextInt(11) + 2); 
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(power) + 1;
        System.out.println("Knight deals " + damage + " damage to " + c.getClass().getSimpleName() + "!");
        c.setHp(c.getHp() - damage);
    }
}
