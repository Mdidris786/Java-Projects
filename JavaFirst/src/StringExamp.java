
public class StringExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Mohamed";
		a.concat("Idris");
		System.out.println(a);
		
		StringBuilder br=new StringBuilder("Mohamed ");
		br.append("Idris");
		System.out.println(br);
		
		StringBuffer brr=new StringBuffer("Mohamed ");
		brr.append("Ibrahim");
		System.out.println(brr);
	}

}
