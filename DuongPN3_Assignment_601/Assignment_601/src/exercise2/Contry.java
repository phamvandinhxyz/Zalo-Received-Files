/*
 * @author duong
 * @date Jul 12, 2021
 * @version 1.0

*/

package exercise2;

public class Contry {
	protected String contryCode;
	protected String contryName;
	protected float totalArea;
	
	
	public Contry() {
		// TODO Auto-generated constructor stub
	}
	
	public Contry(String contryCode, String contryName, float totalArea) {
		super();
		this.contryCode = contryCode;
		this.contryName = contryName;
		this.totalArea = totalArea;
	}
	
	
	public String getContryCode() {
		return contryCode;
	}
	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}
	public String getContryName() {
		return contryName;
	}
	public void setContryName(String contryName) {
		this.contryName = contryName;
	}
	public float getTotalArea() {
		return totalArea;
	}
	public void setTotalArea(float totalArea) {
		this.totalArea = totalArea;
	}
	
	public void display() {
		System.out.println("ID : " + contryCode + "\nName:" + contryName + "\nTotal Area" + totalArea);
	}
}
