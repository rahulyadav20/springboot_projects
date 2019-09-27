package learn.ry.springdemo.eventDependsOn;

public class EventListenerBean {

	private void initialize() {
		System.out.println("EventListenerBean initializing");
		EventManager.getInstance().addListener(s -> System.out.println("event received in EventListenerBean : " + s));
	}
}
