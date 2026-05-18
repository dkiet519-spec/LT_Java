package communityuni.com;
import java.util.*;
public class quan_ly_danh_sach_hoa_don_oop {// InvoiceTest
	static Scanner sc= new Scanner(System.in);
	static ArrayList<quanlydanhsach_Invoice> danhsach= new ArrayList<>();
	
	static void nhapdanhsach()
	{
		int n = 10;
		
		for(int i = 0; i < n; i++)
		{
			String ma;
			do {
				System.out.println("Nhập Mã Hàng Hóa:");
				ma=sc.nextLine();
			}while(timmakhac(ma) !=-1);//*-
			
			System.out.println("Nhập tên Hàng Hóa:");
			String ten=sc.nextLine();
			System.out.println("Nhập Số Lượng Hàng Hóa:");
			int soluong=sc.nextInt();
			sc.nextLine();//vì sao lại đặt ký tự ở đây là do khi ta nhập xong máy tự động bỏ qua qua luôn phần nhập tiếp theo thế nên cần đặt ký tự ở đây ngầm hiểu là cho máy tự động lưu lại biến đừng dể bỏ phần nhập đó đừng để rỗng
			System.out.println("Đơn Giá Hàng Hóa");
			double dongia=sc.nextDouble();
			sc.nextLine();//dưới đây cx như ở trên
			
			danhsach.add(new quanlydanhsach_Invoice(ma, ten, soluong, dongia));		
		}		
	}
//thuật toán này là 1 phần ở thuật toán trên (//*-) giúp cho việc kiểm tra coi có mã ta nhập có cùng mã cũ ko, nếu có thì dừng,ko cho qua 
	static int timmakhac(String ma) {
	    for (int i = 0; i < danhsach.size(); i++) {
	        if (danhsach.get(i).getmahanghoa().equals(ma))
	            return i;
	    }
	    return -1;
	}
	//
	
	static void xuatdanhsach()
	{
		for(int i = 0; i < danhsach.size(); i++)
		{
			System.out.println("Đây là tất cả danh sách mà bạn vừa nhập"+ danhsach.get(i).tra_ve());
			//get là phương thức có sẵn của ArrayList dùng để lấy 1 phần tử theo vị trí
		}
		
		
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
		    	 nhapdanhsach();
		    	
		    	break;
		    case 2:
		    	System.out.println("Bạn Chọn Xuất Danh Sách");
		    	xuatdanhsach();
		    	
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
