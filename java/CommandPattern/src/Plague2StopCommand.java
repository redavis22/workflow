
public class Plague2StopCommand implements Command {
	Plague2 plague2;
	@Override
	public void execute() {
		plague2.stop();
		
	}

}

