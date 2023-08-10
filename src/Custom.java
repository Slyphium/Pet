
public class Custom {
	private String CarBrand;
	private String BrandModel;
	private String CarTrim;
	private int EngineDisplacement;
	
	public Custom (String CarBrand, String BrandModel) {
		
	}
	
	public String getCarBrand() {
		return CarBrand;
	}

	public void setCarBrand(String carBrand) {
		CarBrand = carBrand;
	}

	public String getBrandModel() {
		return BrandModel;
	}

	public void setBrandModel(String brandModel) {
		BrandModel = brandModel;
	}

	public String getCarTrim() {
		return CarTrim;
	}

	public void setCarTrim(String carTrim) {
		CarTrim = carTrim;
	}

	public int getEngineDisplacement() {
		return EngineDisplacement;
	}

	public void setEngineDisplacement(int engineDisplacement) {
		EngineDisplacement = engineDisplacement;
	}

	public Custom () {
		
	}
	
	public Custom (String CarBrand, String BrandModel, String CarTrim, int EngineDisplacement) {
		
	}
	
	public boolean CarBroken() {
		return true;
	}
	
	public String Drive() {
		return "car is driving";
	}
}
