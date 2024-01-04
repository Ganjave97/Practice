class Item
{
	int itemNum;
	String itemName;
	Item(int itemNum, String itemName)//parameterized constructor
	{
		this.itemNum=itemNum;
		this.itemName=itemName;
		
	}
	Item(){}//Default constructor
	void display()
	{
		System.out.print("Item Num= "+itemNum+" ");
		System.out.print("ItemName= "+itemName+" ");
	}
}
public class ConstructorDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item i=new Item (111,"Computer");
		i.display();
		Item i1=new Item ();
		i1.display();
		
		

	}

}
