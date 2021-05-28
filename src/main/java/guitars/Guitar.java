package guitars;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar implements IPlay, ISell {

    private GuitarType guitarType;
    private int numberOfStrings;
    private Material material;
    private String colour;
    private int priceBought;
    private int priceSell;

    public Guitar(GuitarType guitarType, Material material, String colour, int priceBought, int priceSell) {
        this.guitarType = guitarType;
        this.numberOfStrings = 6;
        this.material = material;
        this.colour = colour;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPriceBought() {
        return priceBought;
    }

    public void setPriceBought(int priceBought) {
        this.priceBought = priceBought;
    }

    public int getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(int priceSell) {
        this.priceSell = priceSell;
    }

    public String play() {
        return "That's a bloody juicy riff isn't it?";
    }


    public int calculateMarkup() {
        return priceSell - priceBought;
    }
}
