package chapter10;

public class Loan {
	private double annualInterestRate;  //数据域封装
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan() {  //构造方法
		this(2.5,1,1000);
	}
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount) {
		this.annualInterestRate=annualInterestRate;
		this.numberOfYears=numberOfYears;
		this.loanAmount=loanAmount;
		loanDate=new java.util.Date();
	}
	
	public double getAnnualInterestRate() {  //各个数据域访问器和修改器
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate=annualInterestRate;
	}
	
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears=numberOfYears;
	}
	
	public double getLoanAmount() {  //注意loanAmount无对应的修改器
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	
	
	public double getMonthlyPayment() {  //具体的方法
		double monthlyInterestRate=annualInterestRate/1200;
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
		return monthlyPayment;
	}
	
	public double getTotalPayment() {
		double totalPayment=getMonthlyPayment()*numberOfYears*12;
		return totalPayment;
	}
	
	public java.util.Date getLoanDate(){
		return loanDate;
	}
}
