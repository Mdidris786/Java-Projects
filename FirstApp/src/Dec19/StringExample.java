package Dec19;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Jeeva";
		a.concat("Nandham");
		System.out.println(a);
		
		StringBuffer br=new StringBuffer("Jeeva");
		br.append("Nandham");
		System.out.println(br);
		
		StringBuilder brr=new StringBuilder("Jeeva");
		brr.append("Nandham");
		System.out.println(brr);

	}

}
