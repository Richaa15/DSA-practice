import java.util.*;

abstract class Pump{
	public double price;
	public double amount;
	void setPrice() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Set price of 1L petrol: ");
		double p = obj.nextDouble();
		price = p;

		System.out.println("The current price is: "+price);
	}
	
	void petrolOut() {
		Scanner ob = new Scanner(System.in);
		System.out.println("The current price is: "+price);
		System.out.println("Enter the amount: ");
		double r = ob.nextDouble();
		amount = r;
		System.out.println("The total petrol you get is: "+(amount/price));
	}
}

class Manager1 extends Pump{
	private String emp_name;
	private int emp_id;
	double total_petrol;
	double total_profit;
	
	void calTotalProfit() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total petrol out: ");
		total_petrol = s.nextDouble();
		System.out.println("Enter current 1L price: ");
		price = s.nextDouble();
		// Assuming profit percent to be 10% 
		total_profit = total_petrol * price * 0.1;
		System.out.println("Total profit for the amount: "+total_profit);
	}
	
	public Manager1(String emp_name, int emp_id) {
		this.emp_name = emp_name;
		this.emp_id = emp_id;
	}
	
	public String getName() {
		return emp_name;
	}
	public int getId() {
		return emp_id;
	}
	
	public String toString() {
		return "Employee Name: "+emp_name+"\n Employee ID: "+emp_id;
	}
}

class Employee1 extends Pump{
	public String toString() {
		return "Introduction: "+super.toString();
	}
}
public class PetrolPump {

	public static void main(String[] args) {
		System.out.println("0 - End program");
		System.out.println("1 - Set Price / Start Program");
		System.out.println("2 - Output Quantity");
		Employee1 us = new Employee1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0/1/2: ");
		int n = sc.nextInt();
		while(n!=0) {
			System.out.println("Enter 0/1/2: ");
			int no = sc.nextInt();
			n=no;
			if(n==1) {
				us.setPrice();
			}
			else if(n==2) {
				us.petrolOut();
			}
		}
		
		Manager1 emp1 = new Manager1("Raj", 1234);
		Manager1 emp2 = new Manager1("Arya", 2345);
		System.out.println(emp1 + "\n");
		System.out.println(emp2 + "\n");
		emp1.calTotalProfit();

	}

}
