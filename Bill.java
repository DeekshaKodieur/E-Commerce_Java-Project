import java.io.*;


public class Bill implements Serializable
{
		private String dealer;
		private String product;
		private int cost;
		private int quant=0;
		private int total=0;
			
		public void setDeal(String dealer)
		{
			this.dealer=dealer;
		}
		public void setProd(String product)
		{
			this.product=product;
		}
		public void setCost(int cost)
		{
			this.cost=cost;
		}
		public void setQuant(int quant)
		{
			this.quant=quant;
		}
		public void setTotal(int total)
		{
			this.total=total;
		}
		public String getDeal()
		{
			return dealer;
		}
		public String getProd()
		{
			return product;
		}
		public int getCost()
		{
			return cost;
		}
		public int getQuant()
		{
			return quant;
		}
		public int getTotal()
		{
			
			return total;
		}
		
		
		public static void main(String[] args) throws Exception
		{
			
		Bill o1 = new Bill();
		o1.setDeal("Dealer 1");
		o1.setProd("Mobile 1");
		o1.setCost(12999);
		o1.setQuant(1);
		o1.setTotal(0);
		
		Bill o2 = new Bill();
		o2.setDeal("Dealer 2");
		o2.setProd("Mobile 2");
		o2.setCost(90000);
		o2.setQuant(2);
		o2.setTotal(0);
		
		Bill o3 = new Bill();
		o3.setDeal("Dealer 3");
		o3.setProd("Mobile 3");
		o3.setCost(13000);
		o3.setQuant(2);
		o3.setTotal(0);
		
		Bill o4 = new Bill();
		o4.setDeal("Dealer 4");
		o4.setProd("Mobile 4");
		o4.setCost(13999);
		o4.setQuant(1);
		o4.setTotal(0);
		
		Bill o5 = new Bill();
		o5.setDeal("Dealer 5");
		o5.setProd("Mobile 5");
		o5.setCost(18000);
		o5.setQuant(1);
		o5.setTotal(0);
		
		Bill o6 = new Bill();
		o6.setDeal("Dealer 6");
		o6.setProd("Mobile 6");
		o6.setCost(25999);
		o6.setQuant(1);
		o6.setTotal(0);
		
		File f1 = new File("obj1.txt");
		FileOutputStream fos_obj1 = new FileOutputStream(f1);
		ObjectOutputStream oos_obj1 = new ObjectOutputStream(fos_obj1);
		oos_obj1.writeObject(o1);
		oos_obj1.writeObject(o2);
		oos_obj1.writeObject(o3);
		oos_obj1.writeObject(o4);
		oos_obj1.writeObject(o5);
		oos_obj1.writeObject(o6);
		oos_obj1.close();
		fos_obj1.close();
		
		
		FileInputStream fis_obj1 = new FileInputStream(f1);
		ObjectInputStream ois_obj1 = new ObjectInputStream(fis_obj1);
		//E_Shop s = (E_Shop)ois.readObject();
		Bill b = (Bill)ois_obj1.readObject();
		int i = 1; 
		System.out.println("Dealer"+"      "+"Product" + "     " + "Price"+ "   " + "Quantity"+"    "+"Total");
		System.out.println();
		
		try
		{
		while(true)
		{
			System.out.print(b.getDeal() + "    ");
			System.out.print(b.getProd() + "    ");
			System.out.print(b.getCost() + "    ");
			System.out.print(b.getQuant() + "           ");
			System.out.println(b.getTotal() + "    ");
			b = ((Bill)ois_obj1.readObject());
			
			
		}
		}
		catch(Exception e)
		{}
		
		}
		
		
}