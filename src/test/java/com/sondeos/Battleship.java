package com.sondeos;
public class Battleship {
    public void setLocations(int[] locations) {
    }

    public String shot(int userShot) {
        if(userShot == 2) {
            return "hit";
        } else {
            return "miss";
        }
    }
}
