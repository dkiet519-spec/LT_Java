package communityuni.com;

public class xaydunglopnhanvien {

	public static void main(String[] args) {
		// TODO Auto-generated method 
    

	}
	public class nhanvien
	{
		private String ho;
		private String ten;
		private int So_sp;
	
	
	    public nhanvien(String ho, String ten, int So_sp)
		{
			this.ho = ho;
			this.ten = ten;
			
			
			if(So_sp >= 0)
			{
				this.So_sp = So_sp;
				
				
			}
			else
			{
				this.So_sp = 0;
			}
		
			
			
		}
	}
	
	

}
