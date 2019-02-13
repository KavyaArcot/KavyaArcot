package Interface;

public class Developing implements BankingClient,DomainClient {
	public static void main (String[] args){
		Developing d=new Developing();
		d.checkbalance();
		d.paycreditcard();
		d.transferbalance();
		d.login();
		d.investment();
				
	}
	public void paycreditcard() {
		System.out.println("Paycredit card implemented");
	}
	public void transferbalance() {
		System.out.println("Transfer Balance implemented");
	}
	public void checkbalance() {
		System.out.println("Check balance implemented");
	}
	public void login() {
		System.out.println("Login Implemented");
	}
	public void investment()
	{
		System.out.println("Investment Implemented");
	}


}

