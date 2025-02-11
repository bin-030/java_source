package pack4extends;

public class Ex20Manager extends Ex20Regular{
	private double incentive;
	
	public Ex20Manager(String irum, int nai, int salary) {
		super(irum, nai, salary);
		if(salary >= 2500000) {
			incentive = salary * 0.6;
		}else if(salary >= 2000000) {
			incentive = salary * 0.5;
		}else
			incentive = salary * 0.4;
	}
	@Override
	public double pay() {
		return getSalary() + incentive;
	}
	@Override
	public void print() {
		display();
		System.out.println(", 고정급:" + pay());
	}
}

/* 생성자에 뭔갈 많이 쓰는 건 좋지 않음. 생성자에 지우고 pay()에 쓸 경우,
 	public double pay() {
	if(super.pay() >= 2500000)
	incentive = super.pay() * 0.6;
}else if(super.pay() >= 2000000)
	incentive = super.pay() * 0.5;
}else
	insentive = super.pay() * 0.4;
} */