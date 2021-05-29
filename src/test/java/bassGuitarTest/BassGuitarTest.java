package bassGuitarTest;

import guitars.GuitarType;
import guitars.Material;
import guitars.bassGuitars.BassGuitar;
import guitars.bassGuitars.BassGuitarType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BassGuitarTest {

    private BassGuitar bassGuitar_1;

    @Before
    public void before(){
        bassGuitar_1 = new BassGuitar(GuitarType.BASS, Material.ROSEWOOD, "Black", 2100, 3400, BassGuitarType.IBANEZ );
    }

    @Test
    public void hasBassGuitarType() {
        assertEquals(BassGuitarType.IBANEZ, bassGuitar_1.getBassGuitarType());
    }

    @Test
    public void canSetBassGuitarType() {
        bassGuitar_1.setBassGuitarType(BassGuitarType.SADOVSKY);
        assertEquals(BassGuitarType.SADOVSKY, bassGuitar_1.getBassGuitarType());
    }
}
