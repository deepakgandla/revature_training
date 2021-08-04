package collectionsfw;

public class Product {
	private int id;
	private String name;
	private float cost;
	private int availableQuantity;
	public Product(int id, String name, float cost, int availableQuantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.availableQuantity = availableQuantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", cost=" + cost + ", availableQuantity=" + availableQuantity
				+ "]";
	}
	
	
}
