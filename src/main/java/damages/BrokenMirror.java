package damages;

import vehicles.IDamage;

public class BrokenMirror implements IDamage {

    private int damageCost;

    public BrokenMirror(int damageCost){
        this.damageCost = damageCost;
    }

    public int damageCost() {
        return damageCost;
    }
}
