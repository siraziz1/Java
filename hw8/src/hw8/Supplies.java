package hw8;

import java.text.DecimalFormat;
public class Supplies extends Account {
	final DecimalFormat df = new DecimalFormat("0.00");
    int numberOfItems;
    double pricePerItem;

    public Supplies(int id, int numberOfItems, double pricePerItem) {
        super(id);
        this.numberOfItems = numberOfItems;
        this.pricePerItem = pricePerItem;
    }

    public Supplies(int id) {
        super(id);
        numberOfItems = 0;
        pricePerItem = 0;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double calculateSales() {
        return getNumberOfItems() * getPricePerItem();
    }

    
    @Override
    public String toString() {
        return super.toString() + ", Price/item: $" + getPricePerItem() + ", " +
                "Items sold: " + getNumberOfItems() + ", Total Sales: $" + df.format(calculateSales());
    }
}