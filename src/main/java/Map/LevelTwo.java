package Map;

import Entity.Enemy;
import Entity.Item;
import Entity.Player;

public class LevelTwo extends Maps {

    //Constructor
    public LevelTwo(Player player) {
        this.player = player;
        this.currentLocation = Map0;
    }



    //Generate Enemies
    Enemy goblin = new Enemy("Goblin", 50, 10);
    Enemy hobgoblin = new Enemy("Hobgoblin", 100, 30);
    Enemy goblinHorde = new Enemy("Goblin Horde", 500, 50);

    //Generate Items
    Item key = new Item("Mysterious Key","key",0,0);
    Item shortSword = new Item("Short Sword","weapon", 100, 0);


    //Generate Maps
    public void generateMap(){
        Map0.setMapBlock(Map0,Map1,Map2,Map3,Map4, goblin,null, false);
        Map1.setMapBlock(Map1,Map3,Map6,Map0,Map7, goblin,null, false);
        Map2.setMapBlock(Map2,Map8,Map4,Map8,Map1, goblin,null, false);
        Map3.setMapBlock(Map3,Map2,Map8,Map1,Map4, goblin,null, false);
        Map4.setMapBlock(Map4,Map5,Map6,Map5,Map2, goblin,key, false);
        Map5.setMapBlock(Map5,Map6,Map8,Map4,Map6, goblin,shortSword, false);
        Map6.setMapBlock(Map6,Map7,Map9,Map5,Map8, goblin,null, false);
        Map7.setMapBlock(Map7,Map7,Map8,Map6,Map4, goblin,null, false);
        Map8.setMapBlock(Map8,Map0,Map6,Map0,Map3, goblin,null, false);
        Map9.setMapBlock(Map9,null,null,null,Map6, hobgoblin,null, true);
    }


}
