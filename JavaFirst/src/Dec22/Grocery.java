package Dec22;

public class Grocery {
	 int weight;
	 String name;
	 double price;
	
	Grocery(){
		weight=15;
		name="Salt";
		price=10;
	}
	public void checktheweight() {
		System.out.println(+weight);
	}
	
	public void addtheweight() {
		weight+=5;
	}
	public void removetheweight() {
		weight-=5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Grocery g=new Grocery();
		System.out.println("The current weight ");
		g.checktheweight();
		System.out.println("The weight after addition ");
		g.addtheweight();
		g.checktheweight();
		System.out.println("The weight after subtraction ");
		g.removetheweight();
		g.checktheweight();
	}

}
