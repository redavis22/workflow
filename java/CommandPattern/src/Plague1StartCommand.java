
public class Plague1StartCommand implements Command {
	Plague1 plague1;
	@Override
	public void execute() {
		plague1.start();
		
	}

}
