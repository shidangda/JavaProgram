package chapter10;

public class Loan {
	private double annualInterestRate;  //�������װ
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;
	
	public Loan() {  //���췽��
		this(2.5,1,1000);
	}
	public Loan(double annualInterestRate,int numberOfYears,double loanAmount) {
		this.annualInterestRate=annualInterestRate;
		this.numberOfYears=numberOfYears;
		this.loanAmount=loanAmount;
		loanDate=new java.util.Date();
	}
	
	public double getAnnualInterestRate() {  //������������������޸���
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
	
	public double getLoanAmount() {  //ע��loanAmount�޶�Ӧ���޸���
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount=loanAmount;
	}
	
	
	public double getMonthlyPayment() {  //����ķ���
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
