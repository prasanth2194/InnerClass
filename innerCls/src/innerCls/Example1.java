package innerCls;


interface Hello{
	void sayHello();
}



public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="prassi";
		Hello h =()->{
			System.out.println("lamda expression\t"+name);
		};
		h.sayHello();

	}

}
