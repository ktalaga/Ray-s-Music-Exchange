package guitarShopTest;

import behaviours.ISell;
import guitarShop.GuitarShop;
import guitars.GuitarType;
import guitars.Material;
import guitars.bassGuitars.BassGuitar;
import guitars.bassGuitars.BassGuitarType;
import guitars.electricGuitars.ElectricGuitar;
import guitars.electricGuitars.ElectricGuitarType;
import guitars.electricGuitars.Pickups;
import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GuitarShopTest {

    private ISell electricGuitar_1;
    private ISell electricGuitar_2;
    private ISell bassGuitar_1;
    private GuitarShop guitarShop;
    private ArrayList<ISell> stock;


    @Before
    public void before(){
        bassGuitar_1 = new BassGuitar(GuitarType.BASS, Material.ROSEWOOD, "Black", 2100, 3400, BassGuitarType.IBANEZ );
        electricGuitar_1 = new ElectricGuitar(GuitarType.ELECTRIC, guitars.Material.MAHOGANY, "Sunburst", 1299, 1999, guitars.electricGuitars.ElectricGuitarType.STRATOCASTER, Pickups.SINGLE);
        electricGuitar_2 = new ElectricGuitar(GuitarType.ELECTRIC, Material.ROSEWOOD, "Red", 1100, 2000, ElectricGuitarType.LESPAUL, Pickups.HUMBUCKER);
        stock = new ArrayList<>();
        guitarShop = new GuitarShop(stock);
    }

    @Test
    public void hasStockStartingWith0Items(){
        assertEquals(0,stock.size());
    }

    @Test
    public void canAddItemsToStock() {
        stock.add(bassGuitar_1);
        stock.add(electricGuitar_1);
        stock.add(electricGuitar_2);
        assertEquals(3, stock.size());
    }

    @Test
    public void canRemoveItemsFromStock() {
        stock.add(bassGuitar_1);
        stock.add(electricGuitar_1);
        stock.add(electricGuitar_2);
        stock.remove(electricGuitar_1);
        assertEquals(2, stock.size());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        stock.add(bassGuitar_1);
        stock.add(electricGuitar_1);
        stock.add(electricGuitar_2);
        assertEquals(2900, guitarShop.calculateTotalPotentialProfit());
    }
}
