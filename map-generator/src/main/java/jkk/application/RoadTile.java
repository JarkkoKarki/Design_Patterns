package jkk.application;

public class RoadTile extends Tile {
    public RoadTile() {
        this.character = 'R';
        this.type = "road";
    }
    
    @Override
    public String action() {
        return null;
    }
}
