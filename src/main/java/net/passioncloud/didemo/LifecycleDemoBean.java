package net.passioncloud.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifecycleDemoBean() {
        System.out.println("##1. I am the lifecycle demo bean constructor");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("#2. The name has been set for the bean and it is " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("#3. The bean factory has been set and it is " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("#4. Application context has been set and it is " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("#5. Lifecycle demo bean has had its properties set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("#6. The life cycle demo bean has been destroyed");
    }


}
