package Map;

import Entity.Enemy;
import Entity.Item;

public class MapBlock{
    private MapBlock here;
    private MapBlock north;
    private MapBlock east;
    private MapBlock south;
    private MapBlock west;
    private Enemy enemy;
    private Item item;
    private boolean lock;

    public void setMapBlock(MapBlock here,
                    MapBlock north, MapBlock east,
                    MapBlock south, MapBlock west,
                    Enemy enemy, Item item, Boolean lock)
    {
        this.here = here;
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        this.enemy = enemy;
        this.item = item;
        this.lock = lock;
    }

    public MapBlock getHere() {
        return here;
    }

    public void setHere(MapBlock here) {
        this.here = here;
    }

    public MapBlock getNorth() {
        return north;
    }

    public void setNorth(MapBlock north) {
        this.north = north;
    }

    public MapBlock getEast() {
        return east;
    }

    public void setEast(MapBlock east) {
        this.east = east;
    }

    public MapBlock getSouth() {
        return south;
    }

    public void setSouth(MapBlock south) {
        this.south = south;
    }

    public MapBlock getWest() {
        return west;
    }

    public void setWest(MapBlock west) {
        this.west = west;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public void peak(){
        System.out.println("The door is locked, but you look through the keyhole and see a " + getEnemy());
    }
}

