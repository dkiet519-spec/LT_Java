package communityuni.com;
import java.util.*;


public class quanlydanhsach_Invoice {
	//private
	private String mahanghoa;
	private String tenhanghoa;
	private int soluonghanghoa;
	private double dongiahanghoa;

	  // Constructor
	public quanlydanhsach_Invoice(String ma, String ten, int soluong, double dongia)
	{
		this.mahanghoa = ma;
		this.tenhanghoa = ten;
		this.soluonghanghoa = soluong;
		this.dongiahanghoa = dongia;
		
	}
	 // Getter
	public String getmahanghoa() {return mahanghoa;}
	public String gettenhanghoa() {return tenhanghoa;}
	public int getsoluonghanghoa() {return soluonghanghoa;}
	public double getdongiahanghoa() {return dongiahanghoa;}
	public double thanhtien()
	{
		return soluonghanghoa*dongiahanghoa;
	}
	public String tra_ve() {
		return "mã hàng" + mahanghoa + "-- Tên hàng " + tenhanghoa+ "--số lượng hàng" +soluonghanghoa+ "-- đơn giá" +dongiahanghoa+ "--thành tiền" +thanhtien();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
}
