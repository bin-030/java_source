package pack4extends;

public class Ex20Salesman extends Ex20Regular{
	private int sales;
	private double commission;
	
	public Ex20Salesman(String irum, int nai, int salary, int sales, double commission) {
		super(irum, nai, salary);
		this.sales = sales;
		this.commission = commission;
	}
	@Override
	public double pay() {
		return getSalary() + (sales * commission);
	}
	public void print() {
		display();
		System.out.println(", 수령액:" + pay());
	}
}
