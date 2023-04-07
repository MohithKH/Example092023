package Test2;

class TestDemo9
{
	int getFactorial(int num)
	{
		int fact = 1;
		for(int k=num;k>=1;k--)
		{
			fact = fact*k;
		}
		
		return fact;
	}
	
}

public class Demo9 {

	public static void main(String[] args) {
		
		TestDemo9 obj = new TestDemo9();
		int res = obj.getFactorial(5);
		
		System.out.print(res);

	}

}
