package Test2;

class TestDemo4
{
	String getFirstElement(String[] arr)
	{
		return arr[0];
	}
	
}

public class Demo4 {

	public static void main(String[] args) {
		
		String[] arr = {"Divya","Santhosh","Vidya","Mohith"};
		
		TestDemo4 obj = new TestDemo4();
		String res = obj.getFirstElement(arr);
		
		System.out.println(res);
		

	}

}
