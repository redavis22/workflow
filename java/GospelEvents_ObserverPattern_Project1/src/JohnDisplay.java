
public class JohnDisplay implements Observer, DisplayElement {
	private String event;
	private Subject gospelEvents;
	
	public JohnDisplay(Subject gospelEvents) {
		this.gospelEvents = gospelEvents;
		gospelEvents.registerObserver(this);
		//gospelEvents.removeObserver(this);
	}
		

	@Override
	public void update(String event) {
		this.event = event;
		display();
		
	}


	@Override
	public void display() {
		if (event == "baptism") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 1:32-34)" + "");
		} else if (event == "galilee" ) {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 4:43-45)" + "");	
		} else if (event == "fiveThousand") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 6:1-15)" + "");
		} else if (event == "gethsemane") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 18:1)" + "");
		} else if (event == "soliders") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 19:1-3)" + "");
		} else if (event == "theCross") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 19:17-24)" + "");
		} else if (event == "death") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 19:28-30)" + "");
		} else if (event == "burial") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 19:38-42)" + "");
		} else if (event == "resurrection") {
			System.out.println("The " + event + " Observed from John's perspective: " + "(John 20:1-18)" + "");
		} else if (event== "ascension") {
			System.out.println("The " + event + " was not recorded in John's gospel.");
		}
		
		
	}

}