package guitars.bassGuitars;

import guitars.Guitar;
import guitars.GuitarType;
import guitars.Material;

public class BassGuitar extends Guitar {

    private BassGuitarType bassGuitarType;


    public BassGuitar(GuitarType guitarType, Material material, String colour, int priceBought, int priceSell, BassGuitarType bassGuitarType) {
        super(guitarType, material, colour, priceBought, priceSell);
        this.bassGuitarType = bassGuitarType;
    }

    public BassGuitarType getBassGuitarType() {
        return bassGuitarType;
    }

    public void setBassGuitarType(BassGuitarType bassGuitarType) {
        this.bassGuitarType = bassGuitarType;
    }
}
