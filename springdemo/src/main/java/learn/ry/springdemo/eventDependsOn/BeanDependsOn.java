package learn.ry.springdemo.eventDependsOn;

import org.springframework.context.annotation.*;


/**
 * https://www.logicbig.com/tutorials/spring-framework/spring-core/using-depends-on.html
 * @Lazy : That would cause  EventListenerBean not to load during start up but when it is used by some other bean.
 * 
 * Now put back @DependsOn and don't remove @Lazy as well, we will get the output we saw first time. 
 * Even though we are using @Lazy, eventListenerBean is still being loaded during start up because of 
 * @DependsOn referencing of EventPublisherBean.
 *
 */
@Configuration
@ComponentScan("learn.ry.springdemo.eventDependsOn")
public class BeanDependsOn {

	@Bean(initMethod = "initialize")
	@DependsOn("eventListener")
	public EventPublisherBean eventPublisherBean() {
		return new EventPublisherBean();
	}

	@Bean(name = "eventListener", initMethod = "initialize")
	// @Lazy
	public EventListenerBean eventListenerBean() {
		return new EventListenerBean();
	}

	public static void main(String... strings) {
		new AnnotationConfigApplicationContext(BeanDependsOn.class);
	}
}
