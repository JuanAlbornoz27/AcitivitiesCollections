package co.edu.uptc.presenter;

import co.edu.uptc.model.Shop;
import co.edu.uptc.view.IoManager;

public class Presenter {
	IoManager io;
	Shop shop;
	public Presenter() {
		init();
	}
	private void init() {
		shop= new Shop();
		io = new IoManager();
		boolean salir=false;
		while (!salir) {
		try {
			switch (io.readMenu()) {
			case 1:
				this.showProducts();
				break;
			case 2:
				this.buyProducts();
				break;
			case 3:
				this.showCart();
				break;
			case 4:
				this.showPrice();
				break;
			case 5:
				io.showGraphicMessage("----Has salido del menu----");
				salir = true;
				break;			
			default:
				io.showGraphicErrorMessage("Ingrese Un Numero de la lista!!!");
				break;
			}
		}catch(NumberFormatException e) {
			io.showGraphicErrorMessage("Debe Ingresar un numero entero");
		}
	}
	}
	public void showProducts() {
		io.showGraphicMessage(shop.showProducts());
	}
	public void buyProducts() {
		io.showGraphicMessage(shop.showProducts());
		shop.buyProduct(io.readGraphicInt("Digite el id del producto"), io.readGraphicInt("Ingrese la cantidad de este producto:"));
	}
	public void showCart() {
		io.showGraphicMessage(shop.showCart());
	}
	public void showPrice() {
		io.showGraphicMessage(shop.totalPrice());
	}
	
	public static void main(String[] args) {
		new Presenter();
	}
}
