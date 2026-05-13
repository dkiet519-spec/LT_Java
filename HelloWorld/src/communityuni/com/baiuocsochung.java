package communityuni.com;
import java.util.*;
public class baiuocsochung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("nhập ước số a:");
		int a = sc.nextInt();
		System.out.print("nhập ước số b:");
		int b = sc.nextInt();
		int uocsochung =1;
		for (int i = 1; i <= a  && i <= b; i++ )
		{
			if( a%i == 0 && b%i == 0)
			{
				uocsochung = i;
			}
//			else 
//			    System.out.print("không có ước số chung");
		}
		System.out.print("ước số chung lớn nhât của a và b là:" +uocsochung);
		
		

	}

}
