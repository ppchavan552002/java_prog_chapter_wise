package EncapsulationDemoExp;

class Account{
	private long acc_no;
	private String name,email;
	private float amount;
	public int add;           //we can get public but not concept of encapsulation
	public int getAdd() {
		return add;
	}
	public void setAdd(int add) {
		this.add = add;
	}							// up to hire
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}

public class EncapsulationExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.setAcc_no(235546);
		a.setAmount(40000);
		a.setEmail("prathamesh@gmail.com");
		a.setName("prathamesh");
		a.setAdd(234);                  //this is not concept
		System.out.println(a.getAdd()); //this is not concept
		System.out.println(a.getAcc_no());
		System.out.println(a.getAmount());
		System.out.println(a.getEmail());
		System.out.println(a.getName());
		System.out.println("\naccount No : "+a.getAcc_no()+"\n Amount : "+a.getAmount() +
				"\n Email : "+a.getEmail()+"\n Name : "+ a.getName());
	}

}
