
public class BronzeLaver extends HouseDecorator {

	HouseOfWorship houseOfWorship;


	public BronzeLaver(HouseOfWorship houseOfWorship) {
		this.houseOfWorship = houseOfWorship;
	}

	public String getDescription() {
		return houseOfWorship.getDescription() + "Bronze Laver\n" + "(Ex. 30:17-21)\n" + "It was to the laver of bronze " +
				"that the priests would come for cleansing. They must be pure to enter the presence of God.\n \n";
	}
	
	
	
	

}
