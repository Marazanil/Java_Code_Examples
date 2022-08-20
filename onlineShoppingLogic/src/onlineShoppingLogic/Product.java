package onlineShoppingLogic;

public class Product {
	
	private int id;
	private String name;
	private String detail;
	private int unitAmount;
	private double unitPrice;
	private String color;
	
	
	public Product () {
		//this(); ise herhangi bir s�n�f�n mevcut �rne�ini temsil eder.
		super(); //super bir �st s�n�f�n mevcur �rne�ini temsil eder.Biz Inheriteance yap�s�n� kullanaca��m�z i�in super();'i kulland�k.
	}
	public Product (int id , String name , String detail , int unitAmount , double unitPrice) {
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitAmount = unitAmount;
		this.unitPrice = unitAmount;
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
	
	
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	public int getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(int unitAmount) {
		this.unitAmount = unitAmount;
	}
	
	
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}
