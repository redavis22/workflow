
public class TestDrive {
	

		public static void main(String[] args) {
			HouseOfWorship house1 = new Tabernacle();
			System.out.println("****Using the Decorator Pattern to decorate" +
					" the Tabernacle with the following items:****\n");
			house1 = new ArkOfCovenant(house1);
			house1 = new BronzeLaver(house1);
			house1 = new AltarOfBurntOffering(house1);
			house1 = new GoldenLampstand(house1);
			house1 = new TableOfShowbread(house1);
			house1 = new AlterOfIncense(house1);
			System.out.println(house1.getDescription());
		}
}
