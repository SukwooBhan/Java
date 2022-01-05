package ch06;

import ch05.Account;

public class StockAccount extends Account{

	private String stock;
	private int amount;
	private int price;
	
	public StockAccount(String bank, String id, String name, int balance, String stock, int amount, int price) {
		super(bank, id, name, balance);
		this.stock = stock;
		this.amount = amount;
		this.price = price;
	}
	
	
	public void sell(int amount, int price) {
		this.amount -= amount;
		super.balance += amount * price;
		
	}
	public void buy(int amount, int price) {
		this.amount += amount;
		super.balance -= amount * price;
		
	}
	
	public void show() {
		System.out.println("==============");
		System.out.println("증권사 : "+bank);
		System.out.println("계좌번호 : "+id);
		System.out.println("이름 : "+name);
		System.out.println("잔액 : "+balance);
		System.out.println("주식 : "+stock);
		System.out.println("수량 : "+amount);
		System.out.println("주식가격 : "+price);
		System.out.println("--------------");
	}
	
	
	
	
	
}
