package Test2;

class TestDemo2
{
	static String[] displayProgramminglan()
	{
		String[] arr_Plang = new String[3];
		arr_Plang[0] = "Java";
		arr_Plang[1]="CSharp";
		arr_Plang[2]="C++";
		
		return arr_Plang;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		
	String[] res_arr =TestDemo2.displayProgramminglan();
	
	for(int k=0;k<res_arr.length;k++)
	{
		System.out.println(res_arr[k]);
	}

	}

}
