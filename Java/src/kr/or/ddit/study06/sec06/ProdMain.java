package kr.or.ddit.study06.sec06;


public class ProdMain {
	
	public static void main(String[] args) {
		Prod p1 = new Prod();
		p1.setName("상품, ");
		p1.setDescript("아이스크림이다. ");
		p1.setPrice(3000);
		p1.setDate(" 2024-01-01");
		System.out.println(p1.getName() + p1.getDescript() + p1.getPrice() + p1.getDate());

	
	}
		
	
	
}