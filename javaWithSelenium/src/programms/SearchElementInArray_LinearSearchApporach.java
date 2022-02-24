package programms;

public class SearchElementInArray_LinearSearchApporach {
//linear search or sequential search
	public static void main(String[] args) {
		
		int a[]= {10,20,40,50,30};
		
		int search_element=50;
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			//System.out.println(a[i]);
			
			if(search_element==a[i])
			{
				System.out.println("element is found at:"+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("element not found");
		}
		
		
	}
}
