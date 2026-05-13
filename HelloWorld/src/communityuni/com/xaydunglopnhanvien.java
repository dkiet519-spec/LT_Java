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
			
			//*
			if(So_sp >= 0)
			{
				this.So_sp = So_sp;
				
				
			}
			else
			{
				this.So_sp = 0;
			}
		    //*
			//*this.SoSP = (soSP >= 0) ? soSP : 0;*//

	
		}
	    public String getHo() {return ho;}
	    
	    public void setHo(String ho) {this.ho = ho;}
	    
	    public String getTen() {return ten;}
	    
	    public void setTen(String ten) {this.ten = ten;}
	    
	    public double getLuongNhanVien()
	    {
	    	double dongia = 0;
	    	if (So_sp > 600)
	    		dongia = 0.65;
	    	else 
	    		if(So_sp > 400 )
	    		{
	    			dongia = 0.6;
	    			
	    		}
	    		else 
	    			if(So_sp > 200)
	    			{
	    				dongia = 0.55;   				
	    			}
	    			else 
	    				if(So_sp > 1)
	    				{
	    					dongia = 0.5;
	    				}
	    	return So_sp * dongia;
	    }
	    public boolean LonHon(nhanvien nv2)
	    {
	    	if (this.So_sp > nv2.So_sp)
	    		return true;
	    	else
	    		return false;
	    	
	    	
	    }
	    
	    
	}
	
	

}
