package oct16;


class MyClass{
	private static MyClass ref;
	private MyClass() {
		
	}
	public static MyClass getInstance() {
		if(ref==null) {
			ref = new MyClass();
		}
		return ref;
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
