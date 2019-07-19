import Entity.Player;
import Map.*;

import java.util.Scanner;

public class GameApp {
    Scanner scanner = new Scanner(System.in);
    Player player;

    public GameApp() {
        this.player = new Player();
    }

    public void Start(){
        run(new LevelOne(player));
        run(new LevelTwo(player));
        run(new LevelThree(player));
        System.out.println("You have completed the game!");
    }

    public void run(Maps level){
        boolean completed = false;
        while (!completed){
            level.setCurrentLocation(move(level.getCurrentLocation()));
            loot(level);
            completed = fight(level);
        }
    }

    // Stages of each move
    public MapBlock move(MapBlock block){
        try {
            System.out.println("Please choose your way (North, South, East, West):");
            String direction = scanner.next();
            switch (direction) {
                case "North" :
                    block.setHere(block.getNorth());
                    return block;
                case "South" :
                    block.setHere(block.getSouth());
                    return block;
                case "East" :
                    block.setHere(block.getEast());
                    return block;
                case "West" :
                    block.setHere(block.getWest());
                    return block;
                default :
                    move(block);

            }
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
        }
        return block;
    }

    public void loot(Maps level){
        try {
            System.out.println("You have found " +
                        level.getCurrentLocation().getItem().getName() +
                        ". Will you take it?(y/n)");
            String decision = scanner.next();
            if (decision.equals("y")){
                if (level.getCurrentLocation().getItem().getType().equals("weapon"))
                    player.setAttackPower(level.getCurrentLocation().getItem().getDamage());
                if (level.getCurrentLocation().getItem().getType().equals("key"))
                    player.setKey(true);
            }
        }catch (NullPointerException e){
            System.err.println(e.getMessage());
        }


    }

    public boolean fight(Maps level){
        try {

            System.out.println("You engage in battle with " + level.getCurrentLocation().getEnemy().getType());
            return player.attack(level.getCurrentLocation().getEnemy());

        }catch (NullPointerException e){
            System.err.println(e.getMessage());
        }

        return false;

    }
}
