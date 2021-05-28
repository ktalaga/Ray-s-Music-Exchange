package guitars.electricGuitars;

import guitars.Guitar;
import guitars.GuitarType;
import guitars.Material;

public class ElectricGuitar extends Guitar {

    private ElectricGuitarType electricGuitarType;
    private Pickups pickups;

    public ElectricGuitar(GuitarType guitarType, Material material, String colour, int priceBought, int priceSell, ElectricGuitarType electricGuitarType, Pickups pickups) {
        super(guitarType, material, colour, priceBought, priceSell);
        this.electricGuitarType = electricGuitarType;
        this.pickups = pickups;
    }

    public ElectricGuitarType getElectricGuitarType() {
        return electricGuitarType;
    }

    public Pickups getPickups() {
        return pickups;
    }
}
