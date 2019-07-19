package Entity;

import Map.MapBlock;

public class Player {
    private int health;
    private int attackPower;
    private int armour;
    private boolean secondChance;
    private boolean key;



    public Player() {
        this.health = 100;
        this.attackPower = 20;
        this.armour = 10;
        this.secondChance = true;
        this.key = false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }

    public boolean isSecondChance() {
        return secondChance;
    }

    public void setSecondChance(boolean secondChance) {
        this.secondChance = secondChance;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public boolean attack(Enemy enemy){
        System.out.println("You have dealt " + getAttackPower());
        enemy.setHealth(enemy.getHealth() - getAttackPower());
        if (enemy.getHealth() < 0) {
            enemy.setAlive(false);
            if (enemy.getType().equals("Hobgoblin")) return true;
            else return false;
        }
        return attacked(enemy);
    }

    public boolean attacked(Enemy enemy){
        if (enemy.getAttack() < this.getArmour()) System.out.println("Goblin attack fail to hurt you, because of your superior Armour");
        else this.setHealth(this.getHealth() - (enemy.getAttack() - this.getArmour()) );
        if (this.getHealth() < 0) playerDie(this.secondChance);
        return attack(enemy);
    }

    void playerDie(boolean secondChance){
        if (secondChance) {
            setHealth(50);
            setAttackPower(getAttackPower() * 2);
            setArmour(0);
            secondChance = false;
            System.out.println("You have fallen, but the undying rage toward goblin give you another push. " +
                    "Your Attack power have doubled, but your life remains low");
        }
        else {
            System.out.println("You have been severely injured by the detestable Goblin. " +
                    "As you are dying, you remember about how to Goblin suddenly attack your village " +
                    "and raped your sister corpse. You are dying with regret, but you are powerless before " +
                    "the Goblin in front of you.");
            System.out.println("To restart the game, run the code again");
            System.exit(0);

        }

    }



}
