
public class TableOfShowbread extends HouseDecorator {
	HouseOfWorship houseOfWorship;
	
	public TableOfShowbread(HouseOfWorship houseOfWorship) {
		this.houseOfWorship = houseOfWorship;
	}
	
	public String getDescription() {
		return houseOfWorship.getDescription() + "The Table of Showbread\n" + "(Ex. 25:23-30)\n" + "The table of showbread was a stand on which the offerings were placed. " +
				"Always in God's presence on the table were the 12 loaves of bread representing the 12 tribes.\n\n";
	}
}
