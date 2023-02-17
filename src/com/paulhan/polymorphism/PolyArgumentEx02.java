package com.paulhan.polymorphism;

public class PolyArgumentEx02 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
	
		b.buy(new TvProduct()); // void buy(Product p)
		
		System.out.println("현재 남은 돈 : " + b.money);		// 900
		System.out.println("현재 적립금 : " + b.bonusPoint);	// 10
		System.out.println();
		
		b.buy(new ComputerProduct());
		System.out.println("현재 남은 돈 : " + b.money);		// 700
		System.out.println("현재 적립금 : " + b.bonusPoint);	// 30}
		
		b.summary();
	}
}

class Product{
	int price;		// 제품의 가격
	int bonusPoint;	// 제품 당 적립금
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = price / 10;
	}
}

class TvProduct extends Product{
	public TvProduct() { super(100); }
	
	@Override
	public String toString() { return "TvProduct"; }
}

class ComputerProduct extends Product{
	public ComputerProduct() { super(200); }
	
	@Override
	public String toString() { return "ComputerProduct"; }
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	Product[] item = new Product[10];
	int i = 0;
	
	// 제품을 구매하기 위한 buy() 메소드
	// Product p = new TvProduct() (O)
	// Product p = new ComputerProduct() (O)
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("보유 금액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		/*
		 * Product[] item = new Product[10];
		 * item[0] = new TvProduct(); (O)
		 * item[1] = new ComputerProduct(); (O)
		 */
		
		item[i++] = p;
		System.out.println(p + "을/를 구매하였습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		for(int i = 0; i < item.length; i++) {
			if(item[i] == null) {
				break;
			}
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		
		// itemList += item[i].toString() + ", "; 위와 동일
		
		System.out.println("구매하신 물품의 총 금액 : " + sum);
		System.out.println("구매하신 제품 목록 : " + itemList);
	}
}