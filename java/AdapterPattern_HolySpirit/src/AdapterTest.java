
public class AdapterTest {
	public static void main(String[] args) {
	
	Samson samson = new Samson();
	HolySpirit holySpirit = new HolySpirit();
	Human spiritOfGodAdapter = new SpiritOfGodAdapter(holySpirit);
	System.out.println("Without adapter applied\n");
	samson.humanAction1();
	samson.humanAction2();
	System.out.println("Now with adapter applied\n");
	testHuman(spiritOfGodAdapter);
	}
	static void testHuman(Human human) {
		human.humanAction1();
		human.humanAction2();
	}
}
