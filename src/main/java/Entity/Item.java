package Entity;

public class Item {
    private String name;
    private String type;
    private int damage;
    private int armour;
    private int roomunlock;

    public Item(String name, String type, int damage, int armour) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.armour = armour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}
