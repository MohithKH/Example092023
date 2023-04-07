package Test2;

class TestDemo8
{
	int getSum(int[] arr)
	{
		int sum = 0;
		for(int k=0;k<arr.length;k++)
		{
			sum = sum + arr[k];
		}
		
		return sum;
	}
}

public class Demo8 {

	public static void main(String[] args) {
		
		TestDemo8 obj = new TestDemo8();
		
		int[] arr = {1,2,3,4};
		System.out.println(obj.getSum(arr));

	}

}
