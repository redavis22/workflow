public class LukeDisplay implements Observer, DisplayElement {
	private String event;
	private Subject gospelEvents;
	
	public LukeDisplay(Subject gospelEvents) {
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
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 3:21, 22)" + "");
		} else if (event == "galilee" ) {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 4:14, 15)" + "");	
		} else if (event == "fiveThousand") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 9:10-17)" + "");
		} else if (event == "gethsemane") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 22:40-46)" + "");
		} else if (event == "soliders") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 23:36,37)" + "");
		} else if (event == "theCross") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 23:26-34 )" + "");
		} else if (event == "death") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 23:46 )" + "");
		} else if (event == "burial") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 23:50-56)" + "");
		} else if (event == "resurrection") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 24:1-12)" + "");
		} else if (event== "ascension") {
			System.out.println("The " + event + " Observed from Luke's perspective: " + "(Luke 24:50-53)" + "");
		}
		
		
	}

}