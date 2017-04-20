package companyRenew;

public class Company {
	private double salary;
	private double income;
	private double afterTaxIncome;
	private double bonus;
	private double afterTaxBonus;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(double salary) {
		super();
		this.salary = salary;
	}
	public double getIncome(){
		income += salary*12;
		return income;
	}
	public double afterTaxIncome(){
		afterTaxIncome = income - (income*0.1);
		return afterTaxIncome;
	}
	public double getBonus(){
		bonus += (salary*4*0.2);
		return bonus;
	}
	public double getAfterTaxBonus(){
		afterTaxBonus= bonus - (bonus*0.055);
		return afterTaxBonus;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getAfterTaxIncome() {
		return afterTaxIncome;
	}
	public void setAfterTaxIncome(double afterTaxIncome) {
		this.afterTaxIncome = afterTaxIncome;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}
	
	

}
