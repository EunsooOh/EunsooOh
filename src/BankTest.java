
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank[] bank = new Bank[3];
		bank[0] = new BadBank();
		bank[1] = new NormalBank();
		bank[2] = new GoodBank();
		
		System.out.println("BadBank의 이자율 : " + bank[0].getInterestRate());
		System.out.println("NormalBank의 이자율 : " + bank[1].getInterestRate());
		System.out.println("GoodBank의 이자율 : " + bank[2].getInterestRate());
	}

}
