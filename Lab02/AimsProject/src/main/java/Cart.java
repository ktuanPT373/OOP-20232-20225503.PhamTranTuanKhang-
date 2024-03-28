import java.util.ArrayList;
import java.util.List;
public class Cart {
	private int qtyOrdered;
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private List<DigitalVideoDisc> itemsOrdered;
	
	public Cart() {
		itemsOrdered = new ArrayList<>(MAX_NUMBERS_ORDERED);
		qtyOrdered = 0;
	}
	public int getQtyOrdered(){
        return this.qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered){
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if(qtyOrdered > MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        } else {
            qtyOrdered++;
            itemsOrdered.add(disc);
            System.out.println("The disc has been added");
        }
        return;
    }
    public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		try {
			itemsOrdered.remove(disc);
			qtyOrdered -= 1;
			System.out.println("The disc is removed!");
		}
		catch (Exception e) {
			System.out.println("Disc has not been added yet!");
			return ;
		}
	}
    public float totalCost() {
		float total = 0;
		for(int i= 0; i< itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}
}
