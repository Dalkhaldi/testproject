

package firstpr;


public class main
{    
	int valu;
	int nprod;
	 
	public main()
	 
	 {
		 valu = 0;
		 nprod = 0;
	 }
	

	public int cartval()
	{
		 return valu;
	}
	public void insertbook(int bookn,int val)
	{
		valu  = valu+val;
		nprod = nprod+bookn;
	}
	public int cartbook()
	{
		return nprod;
	}

}
