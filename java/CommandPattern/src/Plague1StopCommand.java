
public class Plague1StopCommand implements Command {
	Plague1 plague1;
	@Override
	public void execute() {
		plague1.stop();
		
	}

}
