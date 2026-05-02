package communityuni.com;
import java.util.*;

class sinhvien 
{
	String ten;
	
	public sinhvien( String ten)
	{
		this.ten = ten;
		
	}
	public void xuat()
	{
		System.out.println( "tên là" + ten);
	}
}

public class quanlysinhvien {
	static  sinhvien[] danhsach = new sinhvien[10];
	static int soluongsinhvien = 0;
	static Scanner sc = new Scanner(System.in);
	
	static void themsv()
	{
		System.out.println("nhập sinh viên mới");
		sc.nextLine();// sử lý hàng đợi nhập 1 xong cho qua sử lý phía sau
		String ten = sc.nextLine();
		danhsach[soluongsinhvien] = new sinhvien(ten);//sử lý phần sinh viên mới vừa thêm
		soluongsinhvien ++;//ban đầu giá trị = 0 (null) khi ta nhập giá trị sẽ tăng lên 1
		System.out.println("đã thêm thành công");
		
	}
	static void xuatdanhsach()
	{
		if(soluongsinhvien == 0)
		{
			System.out.println("không có sinh viên . danh sách rỗng");
			return;
		}
		for(int i = 0; i < soluongsinhvien; i++ )
		{
			System.out.println((i +1) +"..");
			danhsach[i].xuat();

		}
		
	}
	static void xuatsoluong()
	{
		System.out.println("số lượng sinh viên" + soluongsinhvien);
	}
	







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int chon;
		do {
		System.out.println("1.thêm sinh viên");
		System.out.println("2.xuất danh sach sinh vien");
		System.out.println("3.sửa sinh viên");
		System.out.println("4.xóa sinh viên");
		System.out.println("5.tìm sinh viên");
		System.out.println("6.sắp xếp sinh viên");
		System.out.println("7.xuất số lượng sinh viên");
		System.out.println("0. Thoat");
		
		

		chon = sc.nextInt();
		switch (chon)
		{
		case 1:
			System.out.println("chọn thêm sinh viên");
			themsv();
			break;
		case 2:
			System.out.println(" chọn xuất danh sách sinh viên");
			xuatdanhsach();
			break;
		case 3:
			System.out.println(" chọn sửa sinh viên ");
			break;
		case 4:
			System.out.println("chọn xóa sinh viên");
			break;
		case 5:
			System.out.println("chọn tìm  sinh viên");
			break;
		case 6:
			System.out.println("chọn sắp xếp  sinh viên");
			break;
		case 7:
			System.out.println("chọn xuất số lượng sinh viên");
			xuatsoluong();
			break;
		case 8:
			System.out.println("thoát chương trình");
			break;
			default : System.out.println("không có trong menu. chương trình không hợp lệ");
		}
	
	} while (chon !=0);
	
	} // đóng main
} // đóng hàm quản lý sinh vien




