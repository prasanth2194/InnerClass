package innerCls;

public class StaticDemo {
 private static class sinner{
	 void funb(){
		 System.out.println("inside funb");
	 }
	 static void funin(){
		 System.out.println("Static inner class funIn");
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinner si = new sinner();
		
		sinner.funin();
		StaticDemo.sinner.funin();
		si.funb();

	}

}
