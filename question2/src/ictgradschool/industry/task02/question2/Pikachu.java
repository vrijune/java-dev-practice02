package ictgradschool.industry.task02.question2;

public class Pikachu extends Pokemon {

    public Pikachu(String name, int level) {
        super(name, level);

    }

    @Override
    public void attack(Pokemon other) {
        other.loseLifePoints(3 * level);
        lifePoint += 3;
        levelUp();
    }

    @Override
    public void levelUp() {
        if (lifePoint >= 2 * level) {
            level++;
            System.out.println("Pikachu levelled up!");
        } else {
            System.out.println("Not enough experience for Pikachu!");
        }
    }

    @Override
    public int getLevel() {
        return level * 100;
    }

}

public class Pikachu implements INoise{
    @Override
    public String makeNoise() {
        return "Pika pika";
    }
}