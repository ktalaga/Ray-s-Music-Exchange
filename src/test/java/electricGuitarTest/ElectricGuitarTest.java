package electricGuitarTest;

import guitars.GuitarType;
import guitars.Material;
import guitars.electricGuitars.ElectricGuitar;
import guitars.electricGuitars.ElectricGuitarType;
import guitars.electricGuitars.Pickups;
import org.junit.Before;

public class ElectricGuitarTest {

    private ElectricGuitar electricGuitar_1;

    @Before
    public void before(){
        electricGuitar_1 = new ElectricGuitar(GuitarType.ELECTRIC, guitars.Material.MAHOGANY, "Sunburst", 1299, 1999, guitars.electricGuitars.ElectricGuitarType.STRATOCASTER, Pickups.SINGLE);
    }



}
