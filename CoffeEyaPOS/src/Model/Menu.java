package Model;

public class Menu {

	private String category;
	private String proName;
	private int proPrice;
	private int hotice;
	
	public Menu(String category, String proName, int proPrice, int hotice) {
		this.category = category;
		this.proName = proName;
		this.proPrice = proPrice;
		this.hotice = hotice;
	}

	public String getCategory() {
		return category;
	}

	public String getProName() {
		return proName;
	}

	public int getProPrice() {
		return proPrice;
	}

	public int getHotice() {
		return hotice;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public void setProPrice(int proPrice) {
		this.proPrice = proPrice;
	}

	public void setHotice(int hotice) {
		this.hotice = hotice;
	}

}
