
public class SpiritOfGodAdapter implements Human {
	SpiritOfGod spiritOfGod;
	
	public SpiritOfGodAdapter(SpiritOfGod spiritOfGod) {
		this.spiritOfGod = spiritOfGod;
	}
	
	
	@Override
	public void humanAction1() {
		spiritOfGod.action1();
		
	}

	@Override
	public void humanAction2() {
		spiritOfGod.action2();
		
	}
}





