package test1;

import java.util.Objects;

public class Array_ex {
	String str1 = "test";
	int a = 1;
	
	@Override
	public int hashCode() {
		return Objects.hash(a, str1);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Array_ex other = (Array_ex) obj;
		return a == other.a && Objects.equals(str1, other.str1);
	}


	@Override
	public String toString() {
		return "Array_ex [str1=" + str1 + ", a=" + a + "]";
	}
	

	public void test1() {
		
		StringBuilder str = new StringBuilder();
		String[] test = {"a", "b" ,"c"};
		
		for(String n : test) {
			
			str.append(n+"님\n");
			
		};
		
		String result = str.toString();
		System.out.println(result);	
	}


}
