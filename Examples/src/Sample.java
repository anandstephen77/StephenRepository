
public class Sample {
	public static void main(String[] args) {
		try{
		int b = 10;
		String s= "Stephen";
		String a = "Hello Ojasers";
		String sb = "10";
		int n = Integer.parseInt(sb);
		System.out.println(n);
		System.out.println(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(a.trim());
		System.out.println(s.startsWith("st"));
		System.out.println(s.endsWith("en"));
		System.out.println(s.charAt(4));
		System.out.println(s.length());
		String s2 = s.intern();
		System.out.println(s2);
		String sa = String.valueOf(a);
		System.out.println(sa+10);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
