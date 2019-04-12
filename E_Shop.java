import java.io.*;
import java.util.*;
public class E_Shop implements Serializable 
{
	static String pro;
	//shop variables
	private String name;
	private int price;
	private int rate;
	private int id; 
	static int x;
	
	//bill variables
	
	private String dealer;
	private String product;
	private int cost;
	private int quant=0;
	private int total=0;
	
	//shop functions
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setRate(int rate)
	{
		this.rate=rate;
	}
	public void setID(int id)
	{
		this.id=id;
	}
	public int getID()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getPrice()
	{
		return price;
	}
	public int getRate()
	{
		return rate;
	}
	
	//bill functions
	
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
	/*public int getQuant()
	{
		return quant;
	}
	public int getTotal()
	{
		int a = quant*price;
		return a;
	}*/
		
	//main function
	
	public static void main (String[] args) throws IOException , Exception
	{
		//shop objects
		
		E_Shop obj1 = new E_Shop();
		obj1.setName("Mobile 1");
		obj1.setPrice(12999);
		obj1.setRate(4);
		obj1.setID(1);
		
		E_Shop obj2 = new E_Shop();
		obj2.setName("Mobile 2");
		obj2.setPrice(90000);
		obj2.setRate(2);
		obj2.setID(2);
		
		E_Shop obj3 = new E_Shop();
		obj3.setName("Mobile 3");
		obj3.setPrice(13000);
		obj3.setRate(4);
		obj3.setID(3);
		
		E_Shop obj4 = new E_Shop();
		obj4.setName("Mobile 4");
		obj4.setPrice(13999);
		obj4.setRate(3);
		obj4.setID(4);
		
		
		E_Shop obj5 = new E_Shop();
		obj5.setName("Mobile 5");
		obj5.setPrice(18000);
		obj5.setRate(4);
		obj5.setID(5);
		
		E_Shop obj6 = new E_Shop();
		obj6.setName("Mobile 6");
		obj6.setPrice(25999);
		obj6.setRate(4);
		obj6.setID(6);
		
		//bill objects
		
		Bill o1 = new Bill();
		o1.setDeal("Dealer 1");
		o1.setProd("Mobile 1");
		o1.setCost(12999);
		
		
		Bill o2 = new Bill();
		o2.setDeal("Dealer 2");
		o2.setProd("Mobile 2");
		o2.setCost(90000);
		
		
		Bill o3 = new Bill();
		o3.setDeal("Dealer 3");
		o3.setProd("Mobile 3");
		o3.setCost(13000);
		
		
		Bill o4 = new Bill();
		o4.setDeal("Dealer 4");
		o4.setProd("Mobile 4");
		o4.setCost(13999);
		
		
		Bill o5 = new Bill();
		o5.setDeal("Dealer 5");
		o5.setProd("Mobile 5");
		o5.setCost(18000);
		
		
		Bill o6 = new Bill();
		o6.setDeal("Dealer 6");
		o6.setProd("Mobile 6");
		o6.setCost(25999);
		
		
		
		
		//shop file
		
		File f = new File("obj.txt");
		FileOutputStream fos_obj = new FileOutputStream(f);
		ObjectOutputStream oos_obj = new ObjectOutputStream(fos_obj);
		oos_obj.writeObject(obj1);
		oos_obj.writeObject(obj2);
		oos_obj.writeObject(obj3);
		oos_obj.writeObject(obj4);
		oos_obj.writeObject(obj5);
		oos_obj.writeObject(obj6);
		oos_obj.close();
		fos_obj.close();
		
		
		FileInputStream fis_obj = new FileInputStream(f);
		ObjectInputStream ois_obj = new ObjectInputStream(fis_obj);
		int i = 1;
		
		System.out.println();
		System.out.println("---------------------------------------------------------------------");
		System.out.println("            		  WELCOME TO E_MARKET							 ");
		System.out.println("---------------------------------------------------------------------");
		System.out.println();
		
		System.out.println("		"+"Sr."+"	"+" Mobile" + "	 " + "   Rate"+ " "+"  Price");
		System.out.println();
		
		File f_1 = new File("obj.txt");
			FileInputStream fis_obj_1 = new FileInputStream(f_1);
			ObjectInputStream ois_obj_1 = new ObjectInputStream(fis_obj_1);
			int m=1;
			
		try
		{
		while(true)
		{
			E_Shop s = ((E_Shop)ois_obj.readObject());
			System.out.print("		"+s.getID() + "       ");
			System.out.print(s.getName() + "     ");
			System.out.print(s.getRate() + "     ");
			System.out.println(s.getPrice() + "     ");
			//E_Shop s = ((E_Shop)ois_obj.readObject());	
		}
		}
		
		catch(Exception e)
		{
		
			System.out.println();
			Scanner sc = new Scanner(System.in);
			System.out.println("<------------------CHOOSE YOUR PRODUCT----------------------------->");
			System.out.println("");
			System.out.print("		"+"Select a Product : ");
			int n=sc.nextInt();
			System.out.println("");
			System.out.println("<-----------------------QUANTITY----------------------------------->");
			System.out.println();
			System.out.print("		"+"Enter the Quantity : ");
			x=sc.nextInt();
			
			for(int var=0;var<10;var++)
			{
				System.out.println("");
			}
			
			System.out.println("--------------------------------------------------------------------");
			System.out.println("			       BILL  						");
			System.out.println("--------------------------------------------------------------------");
			
			while(n!=m)
			{
				ois_obj_1.readObject();
				m++;
			}
		}
		E_Shop s = (E_Shop)ois_obj_1.readObject();
		pro = s.getName();
		//System.out.println(pro);
		fis_obj_1.close();	

		//bill file
		
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
		Bill b = (Bill)ois_obj1.readObject();
		int j = 1; 
		System.out.println();
		System.out.println();
		System.out.println("	"+"E_SHOP NAME : Invoice Tel Pvt. Ltd.");
		System.out.println("	"+"ADDRESS     : SCO 315, SECOND FLOOR, SECTOR 40 D, CHANDIGARH ");
		System.out.println("	"+"WARRANTY    : 1 YEAR");
		System.out.println("	"+"CONTACT NO. : 9564712354");
		System.out.println("	"+"EMAIL_ID    : invoicetel@gmail.com");
		System.out.println();
		System.out.println();
		
		System.out.println("	"+"Dealer"+"      "+"Product" + "     " + "Price"+ "   " + "Quantity"+"    "+"Total");
		System.out.println("---------------------------------------------------------------------");
		
		String d;
		try
		{
		while(true)
		{
			d = b.getProd();
			//System.out.println(d+"    "+pro);
			if(d.equals(pro))
			{
			
			System.out.print("	"+b.getDeal() + "    ");
			System.out.print(b.getProd() + "    ");
			System.out.print(b.getCost() + "    ");
			System.out.print(x + "          ");
			System.out.println(x*b.getCost() + "    ");
			
			System.out.println("---------------------------------------------------------------------");
			System.out.println();
			System.out.println("				      "+"GRAND TOTAL : "+ x*b.getCost());
			System.out.println();


			}
			b = ((Bill)ois_obj1.readObject());

		}
		
		}
		catch(Exception e)
		{}
	
	}
	
}



