package br.com.mariojp.solid.srp;

public class ReceiptService {
	private double subtotal;
	private double tax;
	private double total;

	public String generate(Order order){
		TaxCalculator tc = new TaxCalculator();
		this.subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		this.tax = tc.CalculateTax(subtotal);
		this.total = subtotal + tax;


		ReceiptFormatter rf = new ReceiptFormatter();
		return rf.format(order, tax, subtotal, total);
	}
	public double getSubtotal(){
		return this.subtotal;
	}
	
}
