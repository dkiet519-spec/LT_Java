
package communityuni.com;
import java.util.Scanner;
public class chuoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String s = "D:/music/bolero/longme.mp3";
		String s2 = s.substring(16, 22);
		String []arr = s.split("D:/music/bolero/");
		for (String ma: arr)
		//int len = s.length(); đếm dãy
		//System.out.println ("là", +len  );
		System.out.println (ma );
		System.out.println(s2);
		

	}

}
