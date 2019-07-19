package Map;

import Entity.Player;

public class Maps {
    MapBlock currentLocation;
    Player player;

    //Initialize MapBlocks
    MapBlock Map0 = new MapBlock();
    MapBlock Map1 = new MapBlock();
    MapBlock Map2 = new MapBlock();
    MapBlock Map3 = new MapBlock();
    MapBlock Map4 = new MapBlock();
    MapBlock Map5 = new MapBlock();
    MapBlock Map6 = new MapBlock();
    MapBlock Map7 = new MapBlock();
    MapBlock Map8 = new MapBlock();
    MapBlock Map9 = new MapBlock();

    //Constructor
    public Maps(){}
    public Maps(Player player) {
        this.player = player;
        this.currentLocation = Map0;
    }

    public MapBlock getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(MapBlock currentLocation) {
        this.currentLocation = currentLocation;
    }



}
