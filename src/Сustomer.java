public class Сustomer {
	private int ID;
	private boolean isNew;
	private double total;
	
public Сustomer() {
		this.ID = 1;
    this.isNew = true;
    this.total = 0;
	}

  public int getID() {
		return ID;
	}

	public void setID(int iD) {
		if (ID >0) this.ID=ID;
	}

	public boolean isNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		if (total >0) this.total=total;
	}

	public void displayCustomerInfo() {
		System.out.println("ID is " + this.ID);
		System.out.println("Is new: " + this.isNew);
		System.out.println("Total is " + this.total);
	}
}