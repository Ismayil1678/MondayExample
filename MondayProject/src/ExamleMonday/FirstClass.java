package ExamleMonday;


public class FirstClass {

	public static void main(String[] args) {
	FirstClass obj=new FirstClass();
		
		System.out.println("Add method: " + obj.add(10, 15));
		System.out.println("Sub method: " + obj.Sub(100, 55));
		
	

	}
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int Sub(int a,int b) {
		return a-b;
	}
}
