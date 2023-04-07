package Test2;
class TestDemo5
{
	int getLastElement(int[] arr)
	{
		return arr[(arr.length-1)];
	}
}

public class Demo5 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		TestDemo5 obj = new TestDemo5();
		int res = obj.getLastElement(arr);
		System.out.println(res);

	}

}
