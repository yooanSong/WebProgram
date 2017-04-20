package bookRenew;

public class bookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book []= new Book[3];
		book[0]= new Book("SQL Plus", 50000, 5.0);
		book[1]= new Book("Java 2.0", 40000, 3.0);
		book[2]= new Book("JSP Servlet", 60000, 6.0);
		
		System.out.println("책이름 \t \t 가격 \t 할인율 \t 할인후금액");
		System.out.println("-------------------------------------------");
		
		for(int i=0; i<book.length; i++){
			
			System.out.println(book[i].getBookName()+"\t"+
			book[i].getBookPrice()+"원"+"\t"+
			book[i].getBookDiscountRate()+"%"+"\t"+
			book[i].getDiscountBookPrice()+"원"
					
					);
			
			
		}
		

	}

}
