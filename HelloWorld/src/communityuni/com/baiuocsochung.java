package communityuni.com;
import java.util.*;
public class baiuocsochung {
	static void tinh_uoc_so_chung_lon_nhat()
	{
		{
			Scanner sc= new Scanner(System.in);
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
//				else 
//				    System.out.print("không có ước số chung");
			}
			System.out.print("ước số chung lớn nhât của a và b là:" +uocsochung);
			
		}
	}
	static void check_co_phai_so_hoan_thien_khong()
	{
		//ArrayList<Integer>danhsachuocsochung = new ArrayList<>();in ra dãy ước số chung của n
		Scanner sc= new Scanner(System.in);
		System.out.print("nhâp số bạn mong muốn:");
		int n = sc.nextInt();
		int tong = 0;
		for(int i = 1; i <=n; i ++)
		{
			if(n%i == 0)
			{
				//danhsachuocsochung.add(i);// in ra dãy ước số chung của n
				tong += i;
				if(tong == n)
				{
					System.out.print("đây là số hoàn thiện:" + tong);
				}
				else
					System.out.print("đây không phải số hoàn thiện"+ tong);
			}
			
			
			
		}
		
		
	}
      



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int chon;
		do {
		System.out.println("1.Tính ước số chung lớn nhất");
		System.out.println("2.Đó có phải số hoàn thiện hay không");
		System.out.println("3.kiểm tra số nguyên dương n có phải số toàn chẵn không");
		System.out.println("4.Tính bài tập s");
		
		
		

		chon = sc.nextInt();
		switch (chon)
		{
		case 1:
			System.out.println("Tính ước số chung lớn nhất");
			tinh_uoc_so_chung_lon_nhat();
		
			break;
		case 2:
			System.out.println("Đó có phải số hoàn thiện hay không");
			check_co_phai_so_hoan_thien_khong();
			
			break;
		case 3:
			System.out.println("kiểm tra số nguyên dương n có phải số toàn chẵn không");
			break;
		case 4:
			System.out.println("Tính bài tập s");
			break;
		
			default : System.out.println("không có trong menu. chương trình không hợp lệ");
		}
	
	} while (chon !=0);
	
		
		
		

	}

}
