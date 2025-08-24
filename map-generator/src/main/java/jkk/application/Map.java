package jkk.application;

import java.util.Random;

public abstract class Map {
    private static final int MAP_WIDTH = 10;
    private static final int MAP_HEIGHT = 10;
    protected Tile[][] tiles;
    protected Random random;
    
    public Map() {
        this.tiles = new Tile[MAP_HEIGHT][MAP_WIDTH];
        this.random = new Random();
        generateMap();
    }
    
    protected abstract Tile createTile();
    
    private void generateMap() {
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                tiles[i][j] = createTile();
            }
        }
    }

    public static Map createMap(String mapType) {
        if (mapType.toLowerCase() == "city") {
            return new CityMap();
        } else if (mapType.toLowerCase() == "wilderness") {
            return new WildernessMap();
        } else {
            return new CityMap();
        }
    }
    
    public void display() {
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                System.out.print(tiles[i][j].getCharacter() + " ");
            }
            System.out.println();
        }
    }
    
    public String getMapAsString() {
        StringBuilder mapString = new StringBuilder();
        mapString.append("Generated Map:\n\n");
        
        for (int i = 0; i < MAP_HEIGHT; i++) {
            for (int j = 0; j < MAP_WIDTH; j++) {
                mapString.append(tiles[i][j].getCharacter()).append(" ");
            }
            mapString.append("\n");
        }

        mapString.append("\n");
        mapString.append("S = Swamp, W = Water, R = Road\n");
        mapString.append("F = Forest, B = Building");
        
        return mapString.toString();
    }
}
