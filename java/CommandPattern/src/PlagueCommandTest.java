
public class PlagueCommandTest {
	public static void main(String[] agrs) {
		Plague1 plague1 = new Plague1();
		Plague2 plague2 = new Plague2();

		plague1.start();
		plague1.stop();
		plague2.start();
		plague2.stop();
	}
}
