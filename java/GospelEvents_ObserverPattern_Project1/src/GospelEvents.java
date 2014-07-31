import java.util.ArrayList;


public class GospelEvents implements Subject {
	private ArrayList observers;
	private String event;
	
	public GospelEvents() {
		observers = new ArrayList();
	}
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(event);
		}
	}
	
	public void newEvent() {
		notifyObservers();
	}
	
	public void setEvent(String event) {
		this.event = event;
		newEvent();
	}
	
	public String getEvent() {
		return event;
	}
	
	//additional methods here

}
