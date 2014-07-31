public class ArkOfCovenant extends HouseDecorator {
	HouseOfWorship houseOfWorship;

	public ArkOfCovenant(HouseOfWorship houseOfWorship) {
		this.houseOfWorship = houseOfWorship;
	}

	public String getDescription() {
		return houseOfWorship.getDescription() + "The Ark of the Covenant\n" + "(Ex. 25: 10-22)\n" + "The ark was most sacred of all the funiture in the tabernacle. " +
				"Here the Hebrews kept a copy of the Ten Commandment. " +
				"Which summarized the whole covenant.\n\n";
	}
}