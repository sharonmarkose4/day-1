
public class StringBuilderDemo {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("IBM");//mutable
	sb.append(",Bangalore");
//	sb.append()
	System.out.println(sb);
	System.out.println(sb.charAt(3));
	System.out.println(sb.indexOf("B"));
	System.out.println(sb.lastIndexOf("B"));
	String s1=new String("IBM,Bangalore");
	String s2=new String("IBM,Bangalore");
	System.out.println(s1==sb.toString());
	System.out.println(s1==s2);
	System.out.println(sb.substring(3));
}
}
