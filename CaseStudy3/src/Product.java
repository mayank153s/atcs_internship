import java.util.*;

public class Product {
	
	public int product_id;
	public int product_code;
	public int product_amt;
	public int product_pincode;
	public String product_name;
	public String product_address;
	static HashMap<String, Product> map = new HashMap<String, Product>();
	
	public Product(int id, String name, int code, int amt, int pincode, String address) {
		// TODO Auto-generated constructor stub
		product_id = id;
		product_name = name;
		product_code = code;
		product_amt = amt;
		product_address = address;
		product_pincode = pincode;
	}
	
	public static void addProduct(int id, String name, int code, int amt, int pincode, String address){
		
		map.put(name,new Product(id,name,code,amt,pincode,address));
		
	}
	
	public static void getAllProduct() {
		for(String i : map.keySet()) {
			System.out.println(map.get(i).product_id+", "+map.get(i).product_name+", "+map.get(i).product_code+", "+map.get(i).product_amt+", "+map.get(i).product_address+", "+map.get(i).product_pincode);
			}
		}
	public static void deleteProduct(String name){
		map.remove(name);
	}
	public static void updateProduct(String name){
		map.get(name).product_amt = 1000;
	}
	
	public static void main(String[] args) {

		addProduct(232,"mayank",23,3400,302017,"xyz");
		addProduct(562,"himanshu",73,3600,302018,"xadf");
		addProduct(442,"aakash",63,2400,302019,"xrtg");
		addProduct(732,"uma",43,3300,302070,"grggz");
		System.out.println(map);
		System.out.println("Map:");
		getAllProduct();
		
		deleteProduct("aakash");
		System.out.println("Updated map after deletion:");
		getAllProduct();
		
		updateProduct("mayank");
		System.out.println("Updated map after updating amt:");
		getAllProduct();
	}

}
