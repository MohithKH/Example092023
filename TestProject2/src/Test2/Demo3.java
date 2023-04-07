package Test2;

class TestDemo3
{
	Boolean[] displayarr()
	{
		Boolean[] arr = {true,false,true,false};
		
		return arr;
	}
}

public class Demo3 {

	public static void main(String[] args) {
		
		TestDemo3 obj = new TestDemo3();
		Boolean res[] = obj.displayarr();
		
		for(int k = 0;k<res.length;k++)
		{
			System.out.println(res[k]);
		}

	}

}
