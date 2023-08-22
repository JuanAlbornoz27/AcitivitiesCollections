package co.edu.uptc.model;

import java.util.Iterator;
import java.util.Vector;

public class Shop {
	private Vector<Product> products;
	private Vector<Product> cart;

	public Shop() {
		products = new Vector<Product>();
		cart = new Vector<Product>();
		listProducts();
	}

	private void listProducts() {
		products.add(new Product(1, "libra arroz", 1200));
		products.add(new Product(2, "libra azucar", 1500));
		products.add(new Product(3, "kilo sal", 2000));
		products.add(new Product(4, "libra lenteja", 3500));
		products.add(new Product(5, "libra frijol", 6000));
		products.add(new Product(6, "libra garbanzo", 4200));
		products.add(new Product(7, "pasta", 2200));
		products.add(new Product(8, "cubeta huevos", 15000));
		products.add(new Product(9, "crema dental", 5000));
		products.add(new Product(10, "jabon rindemax (2 kg)", 10000));
		products.add(new Product(11, "jabon manos", 1200));
		products.add(new Product(12, "rollo papel higienico", 1500));
	}

	public String showProducts() {
		String listFinal = "";
		for (Product product : products) {
			listFinal += product.toString();
		}
		return listFinal;
	}

	public void buyProduct(int id, int amount) {
		for (int j = 0; j < products.size(); j++) {
			if (products.get(j).getId() == id) {
				for (int i = 0; i < amount; i++) {
					cart.add(products.get(j));
				}
			}
		}
	}

	public String showCart() {
		String cartFinal = "";
		for (Product product : cart) {
			cartFinal += product.toString();
		}
		return cartFinal + "\n" + totalPrice();
	}

	public String totalPrice() {
		int price = 0;
		for (Product product : cart) {
			price += product.getPrice();
		}
		return "Total Compra: " + price;
	}

}
