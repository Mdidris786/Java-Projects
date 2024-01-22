package Dec28;
class Bank
{
	public int balance;
	public int credit;
	public int debit;
	public Bank(int balance,int credit,int debit)
	{
		this.balance=1000;
		this.credit=3000;
		this.debit=1000;
	}
	public void getbalance()
	{
		System.out.println(+balance);
	}
	public void checkcredit()
	{
		balance+=3000;
	}
	public void adddebit()
	{
		balance=1000;
	}
	public void curbal()
	{
		balance+=2000;
	}
}
public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bn=new Bank(0,3000,1000);
		System.out.println("The Current balance is ");
		bn.getbalance();
		System.out.println("The credit Amount is ");
		bn.checkcredit();
		bn.getbalance();
		System.out.println("The Current balance is ");
		bn.getbalance();
		System.out.println("The Debit Amount is ");
		bn.adddebit();
		bn.getbalance();
		System.out.println("The Current balance is ");
		bn.curbal();
		bn.getbalance();
	}
}
