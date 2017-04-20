package companyRenew;

public class companyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company company = new Company();
	
		company = new Company(100);
		
		System.out.println("연 기본급 합:"+company.getIncome()
		+"\t"+"세후:"+company.afterTaxIncome());
		System.out.println("연 보너스 합:"+company.getBonus()
		+"\t"+"세후:"+company.getAfterTaxBonus());
		System.out.println("연 지급액 합:"+
				(company.afterTaxIncome()+company.getAfterTaxBonus()));
		

	}

}


