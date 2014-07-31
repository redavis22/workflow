
public class BagExample {
	void processMessage(String msg) {
		Bag bag = new Bag() {
			Object o;
			public Object get() {
				return o;
			}
			public void set(Object o) {
				this.o = o;
			}
		};
		
		bag.set(msg);
		MessagePipe pipe = new MessagePipe();
		pipe.send(bag);
	}

}
