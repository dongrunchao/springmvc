package util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Create with IDEA 2020
 * Time : 2021-04-16
 * author : drc
 */
@Component("appcontext")
public class AppContext implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public Object getBean(String id){
        return applicationContext.getBean(id);
    }
}
