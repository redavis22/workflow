
public class GoldenLampstand extends HouseDecorator{
	HouseOfWorship houseOfWorship;
	
	public GoldenLampstand(HouseOfWorship houseOfWorship){
		this.houseOfWorship = houseOfWorship;
	}
	
	public String getDescription() {
		return houseOfWorship.getDescription() + "Golden Lampstand\n" + "(Ex. 25:31-40)\n" + "The gold lampstand stood in the holy place," +
				" opposite the table of showbread. It held seven lamps, flat bowls in which a wich " +
				"lay with one end in the oil of the bowl\n " +
				"and the lighted end hanged out.\n\n" ;
	}
}
