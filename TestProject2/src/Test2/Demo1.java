package Test2;

class TestDemo1
{
	
	static int sumofnum(int num)
	{
		int  sum = 0;
		for(int k=1;k<=10;k++)
		{
			sum = sum +k;
		}
		
		return sum;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		
		int res = TestDemo1.sumofnum(10);
		System.out.println("Sum is "+res);

	}

}
