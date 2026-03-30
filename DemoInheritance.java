

class Employee{
	private int EmpId;
	private String EmpName;
	private double EmpSal;
	
	Employee(int EmpId, String EmpName){
		this.EmpId=EmpId;
		this.EmpName= EmpName;
	}
	
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int EmpId) {
		this.EmpId = EmpId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String EmpName) {
		this.EmpName = EmpName;
	}
	public double getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(double EmpSal) {
		this.EmpSal = EmpSal;
	}
	
}

class ContractEmployee extends Employee{

	private double Wage;
	private float hoursWorked;

	ContractEmployee(int EmpId, String EmpName, double Wage, float hoursWorked){

		super(EmpId, EmpName);
		this.Wage= Wage;
		this.hoursWorked=hoursWorked;
		calculateSalary();
	}

	public double getWage(){
		return Wage;
	}
	public void setWage(double Wage){
		this.Wage=Wage;
	}
	public float gethoursWorked(){
		return hoursWorked;
	}
	public void sethoursWorked(float hoursWorked){
		this.hoursWorked=hoursWorked;
	}

public void calculateSalary(){
	setEmpSal(gethoursWorked()*getWage());
	System.out.println("the salary is "+getEmpSal());

}
}

class PermanantEmployee extends Employee{
	private double basicPay;
	private double hra;
	private float experience;

	PermanantEmployee(int EmpId,String EmpName, double basicPay, double hra, float experience){
		super(EmpId, EmpName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}

	public double getBasicPay() {
		return basicPay;
	}

	public double gethra() {
		return hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public void sethra(double hra) {
		this.hra = hra;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	void calculateMonthlySalary(){
		if(getExperience()<3){
		}
		else if (getExperience()>=3 && getExperience()<5){
		}
		else if (getExperience() >=5 && getExperience()<10){
		}
		else {
		}
		
	}
}
	
public class DemoInheritance{
	public static void main(String[] args){
	
	}
}

//payment will be abstract because paybill will be abstract(only where italic);
//underlined - static;