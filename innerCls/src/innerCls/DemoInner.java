package innerCls;

 class DemoInner {
 class inner{
		 void fun(){
			System.out.println("inner class");
		}
	}

	public static void main(String[] args) {
		
DemoInner o=new DemoInner();
DemoInner.inner in=o.new inner();
in.fun();
	}

}
