package jkk.application;

public class BuildingTile extends Tile {
    public BuildingTile() {
        this.character = 'B';
        this.type = "building";
    }
    
    @Override
    public String action() {
        return null;
    }
}
