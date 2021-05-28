package electricGuitarTest;

import guitars.GuitarType;
import guitars.Material;
import guitars.electricGuitars.ElectricGuitar;
import guitars.electricGuitars.ElectricGuitarType;
import guitars.electricGuitars.Pickups;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    private ElectricGuitar electricGuitar_1;

    @Before
    public void before(){
        electricGuitar_1 = new ElectricGuitar(GuitarType.ELECTRIC, guitars.Material.MAHOGANY, "Sunburst", 1299, 1999, guitars.electricGuitars.ElectricGuitarType.STRATOCASTER, Pickups.SINGLE);
    }

    @Test
    public void hasGuitarType(){
        assertEquals(GuitarType.ELECTRIC, electricGuitar_1.getGuitarType());
    }

    @Test
    public void canSetGuitarType(){
        electricGuitar_1.setGuitarType(GuitarType.BASS);
        assertEquals(GuitarType.BASS, electricGuitar_1.getGuitarType());
    }

    @Test
    public void hasNumberOfStringsDefaultAt6(){
        assertEquals(6, electricGuitar_1.getNumberOfStrings());
    }

    @Test
    public void canSetNumberOfStrings() {
        electricGuitar_1.setNumberOfStrings(4);
        assertEquals(4,electricGuitar_1.getNumberOfStrings());
    }

    @Test
    public void hasMaterial() {
        assertEquals(Material.MAHOGANY, electricGuitar_1.getMaterial());
    }

    @Test
    public void canSetMaterial() {
        electricGuitar_1.setMaterial(Material.MAPLE);
        assertEquals(Material.MAPLE, electricGuitar_1.getMaterial());
    }

    @Test
    public void hasColor() {
        assertEquals("Sunburst", electricGuitar_1.getColour());
    }

    @Test
    public void canSetColour() {
        electricGuitar_1.setColour("Black");
        assertEquals("Black", electricGuitar_1.getColour());
    }

    @Test
    public void hasBoughtPrice() {
        assertEquals(1299, electricGuitar_1.getPriceBought());
    }

    @Test
    public void canSetPriceBought() {
        electricGuitar_1.setPriceBought(1000);
        assertEquals(1000, electricGuitar_1.getPriceBought());
    }

    @Test
    public void hasPriceSell() {
        assertEquals(1999, electricGuitar_1.getPriceSell());
    }

    @Test
    public void canSetPriceSell() {
        electricGuitar_1.setPriceSell(2000);
        assertEquals(2000, electricGuitar_1.getPriceSell());
    }

    @Test
    public void hasElectricGuitarType() {
        assertEquals(ElectricGuitarType.STRATOCASTER, electricGuitar_1.getElectricGuitarType());
    }

    @Test
    public void canSetElectricGuitarType() {
        electricGuitar_1.setElectricGuitarType(ElectricGuitarType.SG);
        assertEquals(ElectricGuitarType.SG, electricGuitar_1.getElectricGuitarType());
    }

    @Test
    public void hasPickups() {
        assertEquals(Pickups.SINGLE, electricGuitar_1.getPickups());
    }

    @Test
    public void canSetPickups() {
        electricGuitar_1.setPickups(Pickups.HUMBUCKER);
        assertEquals(Pickups.HUMBUCKER, electricGuitar_1.getPickups());
    }

    @Test
    public void canPlay() {
        assertEquals("That's a bloody juicy riff isn't it?", electricGuitar_1.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(700, electricGuitar_1.calculateMarkup());
    }
}
