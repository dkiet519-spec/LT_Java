package communityuni.com;
import java.util.Scanner;
import java.util.*;
public class nhap1mangcacsotunhien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] m= {3, 6, 7, 8, 11, 17, 2, 90, 2, 5, 4, 5, 8};
	    int tongchan = 0;
	    int tongle = 0;
	    for (int i = 0; i < m.length; i++)
	    {
	    	if (m[i] %2 == 0)
	    	{
	    		System.out.println(m[i] +"là số lẻ");
	    		tongchan = +m[i]; 
	    	}
	    	else {
	    		System.out.println(m[i] +"là số chẵn");
	    		tongle = +m[i];
	    		
	    	}
	    	boolean dayso = true;
	    	if (m[i] < 2)
	    	{
	    		dayso = false;
	    	}
	    	for (int j = 2; j <= Math.sqrt(m[i]); j++)
		    {
		    	if(m[i] % j == 0)
		    	{
		    		 dayso = false;
		    		 
		    	}	
		    }
	    	dayso =true;
	    	if(dayso)
	    	{
	    		System.out.println(m[i] + " đây là số nguyên tố");
	    	}
	    	else {
	    		System.out.println(m[i] + " không phải số nguyên tố");
	    	}

	    
	    	
	    }
	    
	}

}
