package damages;

import vehicles.IDamage;

public class FlatTyre implements IDamage {

    private int damageCost;

    public FlatTyre(int damageCost){
        this.damageCost = damageCost;
    }

    public int damageCost() {
        return damageCost;
    }
}
