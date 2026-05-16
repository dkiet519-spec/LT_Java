package communityuni.com;
import java.util.*;
public class quan_ly_danh_sach_hoa_don_oop {// InvoiceTest
	private String mahanghoa;
	private String tenhanghoa;
	private int soluonghanghoa;
	private double dongiahanghoa;
	public double thanhtien()
	{
		return soluonghanghoa*dongiahanghoa;
	}
	static void nhapdanhsach()
	{
		int n = 10;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= n; i++)
		{
			String ma;
			do {
				System.out.println("Nhập Mã Hàng Hóa:");
				ma=sc.nextLine();
			}while(timmakhac(ma) !=-1);
			
			System.out.println("Nhập tên Hàng Hóa:");
			String ten=sc.nextLine();
			System.out.println("Nhập Số Lượng Hàng Hóa:");
			int soluong=sc.nextInt();
			System.out.println("Đơn Giá Hàng Hóa");
			double dongia=sc.nextDouble();
			
			
			
		}
		
	}
	
	static void xuatdanhsach()
	{
		
	}
	static void sapxepdanhsach()
	{
		
	}
	static void timkiemdanhsach()
	{
		
	}
	static void xoadanhsach()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int chon;
		do 
		{
			System.out.println("1.Nhâp Danh Sách");
		    System.out.println("2.Xuất Danh Sách");
		    System.out.println("3.Sắp Xếp ");
		    System.out.println("4.Tìm Kiếm ");
		    System.out.println("5.xóa");
		    System.out.println("0.thoat chương trình");
		    
		    chon = sc.nextInt();
		  
		    switch (chon)
		    {
		    case 1:
		    	System.out.println("Bạn chọn nhập Danh Sách ");
		    	//gọi lại hàm nhập
		    	break;
		    case 2:
		    	System.out.println("Bạn Chọn Xuất Danh Sách");
		    	//
		    	break;
		    case 3:
		    	System.out.println("Bạn Chọn Sắp Xếp");
		    	//
		    	break;
		    case 4:
		    	System.out.println("Bạn Chọn tìm Kiếm");
		    	//
		    	break;
		    case 5:
		    	System.out.println("Bạn Chọn Xóa");
		    	//
		    	break;	    
		    }
		}while(chon !=0) ;
		
		
		

	}

}
