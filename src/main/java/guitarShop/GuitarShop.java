package guitarShop;

import behaviours.ISell;

import java.util.ArrayList;

public class GuitarShop {

    private ArrayList<ISell> stock;

    public GuitarShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }
}
