/*
 * @author duong
 * @date Jul 12, 2021
 * @version 1.0

*/

package exercise2;

public class EastAsiaContries extends Contry {
	private String contryTerrain;

	public EastAsiaContries(String contryCode, String contryName, float totalArea,String contryTerrain) {
		super(contryCode, contryName, totalArea);
		this.contryTerrain = contryTerrain;
	}
	
	

	public String getContryTerrain() {
		return contryTerrain;
	}



	public void setContryTerrain(String contryTerrain) {
		this.contryTerrain = contryTerrain;
	}



	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Terrain : "  + contryTerrain);
	}
	
	
	
}
