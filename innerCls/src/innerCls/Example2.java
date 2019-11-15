package innerCls;


interface Helloo{
	String sayHello();
}

public class Example2 {

	public static void main(String[] args) {
		String name ="prassi";
		Helloo h=()->{
			return "welcome"+name    ;
			
		};
		//String h1=h.sayHello();
	System.out.println(h.sayHello());
	}

}
