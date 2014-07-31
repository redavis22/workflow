
public class AltarOfBurntOffering extends HouseDecorator {
	HouseOfWorship houseOfWorship;
	
	public AltarOfBurntOffering(HouseOfWorship houseOfWorship) {
		this.houseOfWorship = houseOfWorship;
	}
	
	public String getDescription() {
		return houseOfWorship.getDescription() + "Altar of Burnt Offering\n" + "(Ex. 27:1-8)\n" + "Animal sacrifices were offered on the altar, " +
				"located in the court in front of the tabernacle. " +
				"The blood of the sacrifice was sprinkled on the four hourns of the altar.\n\n";
	}
	
	
	/*
	 * public BronzeLaver(HouseOfWorship houseOfWorship) {
		this.houseOfWorship = houseOfWorship;
	}

	public String getDescription() {
		return houseOfWorship.getDescription() + "Bronze Laver: " + "(Ex. 30:17-21)\n" + "It was to the laver of bronze " +
				"that the priests would come for cleansing. They must be pure to enter the presence of God \n";
	}
	 */
	
	

}
