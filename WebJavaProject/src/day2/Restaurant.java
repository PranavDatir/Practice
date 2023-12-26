package day2;

public class Restaurant {
	private int id;
	private String name;
	private String cuisine;
	private int branches;

	public Restaurant(int id, String name, String cuisine, int branches) {
		this.id = id;
		this.name = name;
		this.cuisine = cuisine;
		this.branches = branches;
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
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public int getBranches() {
		return branches;
	}
	public void setBranches(int branches) {
		this.branches = branches;
	}	
	@Override
	public String toString() {
		return "Restaurant [Id=" + id + ", name=" + name + ", cuisine=" + cuisine + ", branch=" + branches + "]";
	}
	
}
