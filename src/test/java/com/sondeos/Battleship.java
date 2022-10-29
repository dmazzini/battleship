package com.sondeos;
public class Battleship {
    private int[] locations;

    private int hits = 0;
    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public String shot(int userShot) {
        String ret = "";
        if (locations[0] == userShot || locations[1] == userShot || locations[2] == userShot) {
            hits++;
            ret = "hit";
            if (hits == 3) {
                ret = "sunk";
            }
        } else {
            ret = "miss";
        }
        return ret;
    }
}
