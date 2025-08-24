package jkk.application;

public class WildernessMap extends Map {
    
    public WildernessMap() {
        super();
    }

    @Override
    protected Tile createTile() {
        int tileType = random.nextInt(3);

        if (tileType == 0) {
            return new SwampTile();
        } else if (tileType == 1) {
            return new WaterTile();
        } else if (tileType == 2) {
            return new ForestTile();
        } else {
            return new SwampTile();
        }
    }
}
