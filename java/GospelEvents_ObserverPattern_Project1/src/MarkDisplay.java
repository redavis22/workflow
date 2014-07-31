
public class MarkDisplay implements Observer, DisplayElement {
	private String event;
	private Subject gospelEvents;
	
	public MarkDisplay(Subject gospelEvents) {
		this.gospelEvents = gospelEvents;
		gospelEvents.registerObserver(this);
	}
		

	@Override
	public void update(String event) {
		this.event = event;
		display();
		
	}
	
	@Override
	public void display() {
		if (event == "baptism") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 1:9-11)" + "");
		} else if (event == "galilee" ) {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 1:14-15)" + "");	
		} else if (event == "fiveThousand") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 6:30-44)" + "");
		} else if (event == "gethsemane") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 14:32-42)" + "");
		} else if (event == "soliders") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 15:16-20)" + "");
		} else if (event == "theCross") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 15:21-28)" + "");
		} else if (event == "death") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 15:37)" + "");
		} else if (event == "burial") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 15:42-47)" + "");
		} else if (event == "resurrection") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 16:1-11)" + "");
		} else if (event== "ascension") {
			System.out.println("The " + event + " Observed from Mark's perspective: " + "(Mark 16:19-20)" + "");
		}
		
		
	}

}