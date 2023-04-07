package Test2;

class TestDemo10
{
	String[] getSecondHalf(String[] arr)
	{
		int arrLen = arr.length/2;
		String[] resArray = new String[arrLen];
		int index = 0;
		for(int k=arrLen;k<arr.length;k++)
		{
			resArray[index]=arr[k];
			index++;
			
		}		
		return resArray;	
	}
	
	
}

public class Demo10 {

	public static void main(String[] args) {
		
		String[] arr = {"Divya","Santhosh","Mohith","Harsha"};
		
		TestDemo10 obj = new TestDemo10();
		String[] arr_sechalf =  obj.getSecondHalf(arr);
		
		
		for(int k=0;k<arr_sechalf.length;k++)
		{
			System.out.print(arr_sechalf[k]+"  ");
		}
		
		
	}

}
