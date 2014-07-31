
public class AlterOfIncense extends HouseDecorator {
	HouseOfWorship houseOfWorship;
	
	public AlterOfIncense(HouseOfWorship houseOfWorship) {
		this.houseOfWorship = houseOfWorship;
	}
	
	/*
	 * public String getDescription() {
		return houseOfWorship.getDescription() + "The Table of Showbread\n" + "(Ex. 25:23-30)\n" + "The table of showbread was a stand on which the offerings were placed. " +
				"Always in God's presence on the table were the 12 loaves of bread representing the 12 tribes.\n\n";
	}
	 */
	
	public String getDescription() {
		return houseOfWorship.getDescription() + "The Alter of Incense\n" + "(Ex. 30:1-10)\n" + "The altar of incense inside the tabernacle was much smaller " +
				"than the altar of burnt offering outside. The incense burned on the altar was a perfume of a sweet smelling aroma.\n\n";
	}

}
