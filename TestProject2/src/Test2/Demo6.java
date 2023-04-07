package Test2;
class TestDemo6
{
	int[] getCube(int[] arr)
	{
		int[] res = new int[arr.length];
		int[] reverse_res = new int[arr.length];
		int index = 0;
		
		for(int k =0;k<arr.length;k++)
		{
			int val = arr[k];
			int cube_val = val*val*val;
			res[k] =  cube_val;
		}
		
		for(int k = (res.length-1); k>=0;k--)
		{
             reverse_res[index] = res[k];
             index++;
         
		}
		
		return reverse_res;
	}
}

public class Demo6 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		TestDemo6 obj = new TestDemo6();
		int[] reverse_res = obj.getCube(arr);
		
		for(int k =0;k<reverse_res.length;k++)
		{
			System.out.print(reverse_res[k]+"  ");
		}
		
		
		
	}

}
