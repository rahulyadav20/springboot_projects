package learn.ry.springdemo.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.core.io.ResourceLoader;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jmx.export.notification.NotificationPublisher;
import org.springframework.jmx.export.notification.NotificationPublisherAware;
import org.springframework.stereotype.Component;

/*
 * Spring Bean Life Cycle Callback Methods
 * 
 * @PostConstruct annotated method will be invoked after the bean has been constructed using default constructor 
 * and just before it’s instance is returned to requesting object.
 * 
 * @PreDestroy annotated method is called just before the bean is about be destroyed inside bean container.
 */
@Component
public class BeanLifeCycle implements ApplicationContextAware, ApplicationEventPublisherAware, BeanClassLoaderAware,
		BeanFactoryAware, BeanNameAware, LoadTimeWeaverAware, MessageSourceAware, NotificationPublisherAware,
		ResourceLoaderAware, InitializingBean, DisposableBean {
	
    private static final Logger logger = LogManager.getLogger(BeanLifeCycle.class);


	@PostConstruct
	public void customInit() {
		System.out.println("Method customInit() invoked...");
		logger.info("*****Method customInit() invoked****");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("Method customDestroy() invoked...");
	}

	public void setResourceLoader(ResourceLoader resourceLoader) {
		// TODO Auto-generated method stub
		logger.info("*****setResourceLoader method****");

	}

	public void setNotificationPublisher(NotificationPublisher notificationPublisher) {
		logger.debug("*****setNotificationPublisher method****");
		logger.info("*****info setNotificationPublisher method****");

	}

	public void setMessageSource(MessageSource messageSource) {
		logger.debug("*****debug setMessageSource method****");
		logger.info("*****info setMessageSource method****");

	}

	public void setLoadTimeWeaver(LoadTimeWeaver loadTimeWeaver) {
		// TODO Auto-generated method stub

	}

	public void setBeanName(String arg0) {
		// TODO Auto-generated method stub

	}

	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub

	}

	public void setBeanClassLoader(ClassLoader arg0) {
		// TODO Auto-generated method stub

	}

	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub

	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub

	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub

	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub

	}

	/*
	 * @Override public void setResourceLoader(ResourceLoader arg0) { // TODO
	 * Auto-generated method stub }
	 * 
	 * @Override public void setNotificationPublisher(NotificationPublisher
	 * arg0) { // TODO Auto-generated method stub
	 * 
	 * }
	 * 
	 * @Override public void setMessageSource(MessageSource arg0) { // TODO
	 * Auto-generated method stub }
	 * 
	 * @Override public void setLoadTimeWeaver(LoadTimeWeaver arg0) { // TODO
	 * Auto-generated method stub }
	 * 
	 * @Override public void setBeanName(String arg0) { // TODO Auto-generated
	 * method stub }
	 * 
	 * @Override public void setBeanFactory(BeanFactory arg0) throws
	 * BeansException { // TODO Auto-generated method stub }
	 * 
	 * @Override public void setBeanClassLoader(ClassLoader arg0) { // TODO
	 * Auto-generated method stub }
	 * 
	 * @Override public void
	 * setApplicationEventPublisher(ApplicationEventPublisher arg0) { // TODO
	 * Auto-generated method stub }
	 * 
	 * @Override public void setApplicationContext(ApplicationContext arg0)
	 * throws BeansException { // TODO Auto-generated method stub }
	 */
}
