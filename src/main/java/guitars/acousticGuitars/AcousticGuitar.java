package guitars.acousticGuitars;

import guitars.Guitar;
import guitars.GuitarType;
import guitars.Material;

public class AcousticGuitar extends Guitar {
    public AcousticGuitar(GuitarType guitarType, Material material, String colour, int priceBought, int priceSell) {
        super(guitarType, material, colour, priceBought, priceSell);
    }
}
