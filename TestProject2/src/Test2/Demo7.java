package Test2;

class TestDemo7
{
	int getCount(int num1,int num2)
	{
		int count = 0;
		for(int k=num1;k<=num2;k++)
		{
			if(k%5 == 0)
			{
				count++;
			}
		}
		return count;
	}
}

public class Demo7 {

	public static void main(String[] args) {
		
		TestDemo7 obj = new TestDemo7();
		int res_count = obj.getCount(100,200);
		System.out.println(res_count);

	}

}
