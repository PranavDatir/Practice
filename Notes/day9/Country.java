package day9;

import java.util.Objects;

public class Country {
	private String code;
	private String name;
	
	public Country() {
		code = "IND";
		name = "India";
	}

	public Country(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("Inside hashCode()");
		return Objects.hash(code, name);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Inside equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(code, other.code) && Objects.equals(name, other.name);
	}

	
	

}
