package communityuni.com;
import java.util.Random;
import java.util.Scanner;
public class gamedoanso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rd= new Random();
		
		int ngaunhien= rd.nextInt(101);
		int lansai=7;
	
		while (lansai > 0)
		{
			System.out.println("bạn hãy số khoản (0~100)");
			int nhapso=sc.nextInt(); 
			
			
			if (nhapso == ngaunhien)
			{
				System.out.println("chúc mừng bạn đã chiến (WINER)");
				return;// kết thúc khi thắng
			}
			else {
				lansai --;
			
				if(nhapso > ngaunhien)//so sánh số nhập với số random của máy
				{
					System.out.println("số khá lớn.nhập lại nhá:>\n");
				}
				else {
					System.out.println("số khá nhỏ.nhập lại nhé");					
				}
				System.out.println("còn lại " + lansai +" lần" );
			}
		
		}
		System.out.println("rất tiếc bạn đã thua");
		System.out.println("số đúng là" +ngaunhien);

	
	}
}

	


