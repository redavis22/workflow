
public class MatthewDisplay implements Observer, DisplayElement {
	private String event;
	private Subject gospelEvents;
	
	public MatthewDisplay(Subject gospelEvents) {
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
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 3:13-17)" + "");
		} else if (event == "galilee" ) {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 4:12)" + "");	
		} else if (event == "fiveThousand") {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 14:13-21)" + "");
		} else if (event == "gethsemane") {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 26:36-46)" + "");
		} else if (event == "soliders") {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 27:27-31)" + "");
		} else if (event == "theCross") {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 27:32-38)" + "");
		} else if (event == "death") {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 27:50)" + "");
		} else if (event == "burial") {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 27:57-61)" + "");
		} else if (event == "resurrection") {
			System.out.println("The " + event + " Observed from Matthew's perspective: " + "(Matt 28:1-10)" + "");
		} else if (event== "ascension") {
			System.out.println("Ascension not recorded in Matthew's Gospel.");
		}
		
		
	}

}
