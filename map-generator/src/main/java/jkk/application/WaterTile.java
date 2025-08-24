package jkk.application;

public class WaterTile extends Tile {
    public WaterTile() {
        this.character = 'W';
        this.type = "water";
    }
    
    @Override
    public String action() {
        return "Swimming across water";
    }
}
