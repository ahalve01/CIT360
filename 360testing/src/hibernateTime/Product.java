package hibernateTime;

public class Product {
	private String productCode;
	private String productName;
	private int listPrice;
	private int productID;
	
	public Product(){}
	public Product(String productCode, String productName, int listPrice, int productID){
		
	}
	/**
	 * @return the productCode
	 */
	public String getProductCode() {
		return productCode;
	}
	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the listPrice
	 */
	public int getListPrice() {
		return listPrice;
	}
	/**
	 * @param listPrice the listPrice to set
	 */
	public void setListPrice(int listPrice) {
		this.listPrice = listPrice;
	}
	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

}
	
