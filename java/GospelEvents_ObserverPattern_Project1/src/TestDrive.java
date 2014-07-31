
public class TestDrive {
	public static void main(String[] args) {
		GospelEvents gospelEvents = new GospelEvents();
		
		
		MatthewDisplay 	matthewDispaly 	= new MatthewDisplay(gospelEvents);
		MarkDisplay 	markDisplay 	= new MarkDisplay(gospelEvents);
		LukeDisplay 	lukeDisplay 	= new LukeDisplay(gospelEvents);
		JohnDisplay 	johnDisplay 	= new JohnDisplay(gospelEvents);
		
		gospelEvents.setEvent("baptism");
		gospelEvents.setEvent("galilee");
		gospelEvents.setEvent("fiveThousand");
		gospelEvents.setEvent("gethsemane");
		gospelEvents.setEvent("soliders");
		gospelEvents.setEvent("theCross");
		gospelEvents.setEvent("death");
		gospelEvents.setEvent("burial");
		gospelEvents.setEvent("resurrection");
		gospelEvents.setEvent("ascension");
		
	
		
	}
}
