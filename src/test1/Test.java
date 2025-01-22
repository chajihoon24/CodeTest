package test1;

public class Test {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		String[] test = {"a", "b" ,"c"};
		
		for(String n : test) {
			
			str.append(n+"님\n");
			
		};
		
		String result = str.toString();
		System.out.println(result);

	}

}
