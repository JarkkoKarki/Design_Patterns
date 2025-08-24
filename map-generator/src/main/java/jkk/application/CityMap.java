package jkk.application;

public class CityMap extends Map {
    
    public CityMap() {
        super();
    }

    @Override
    protected Tile createTile() {
        int tileType = random.nextInt(3);

        if (tileType == 0) {
            return new RoadTile();
        } else if (tileType == 1) {
            return new ForestTile();
        } else if (tileType == 2) {
            return new BuildingTile();
        } else {
            return new RoadTile();
        }
    }
}
