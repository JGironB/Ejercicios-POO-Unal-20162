package containers;

public class ProductContainer extends Container
{
	
	String productName;
	
	public ProductContainer(String productName, double capacity)
	{
		super(capacity);
		
		this.productName = productName;
	}
	
	public String getName()
	{
		return productName;
	}
	
	public void setName(String newName)
	{
		productName = newName;
	}
	
	public String toString()
	{
		
		return productName + ": " + super.toString();
	}
	
}
