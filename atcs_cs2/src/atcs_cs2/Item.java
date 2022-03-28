package atcs_cs2;

public abstract class Item {

	private int id;
	private String title;
	private int NumberOfCopies;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return NumberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		NumberOfCopies = numberOfCopies;
	}
	
	
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", NumberOfCopies=" + NumberOfCopies + "]";
	}

	public void checkIn() {
		NumberOfCopies += 1;
	}

	public void checkOut() {
		NumberOfCopies -= 1;
	}

}
