package com.sondeos;
public class Battleship {
    private int[] locations;

    public void setLocations(int[] locations) {
        this.locations = locations;
    }

    public String shot(int userShot) {
if(locations[0] == userShot || locations[1] == userShot || locations[2] == userShot) {
            return "hit";
        } else {
            return "miss";
        }
    }
}
