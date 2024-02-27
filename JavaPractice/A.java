public class A{
	public static void main(String[] args){
		System.out.println("Main Method");
		A obj = new A();
		obj.call();
	}
	
	public void call(){
		System.out.println("Method called");
	} 
}
