package self.sunng.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by sunxiaodong on 2016/12/14.
 */
// TODO: 2016/12/22 to be move
public class InitAndDestroySeqBean implements InitializingBean, DisposableBean {

    public InitAndDestroySeqBean() {
        System.out.println("执行InitAndDestroySeqBean: 构造方法");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("执行InitAndDestroySeqBean: postConstruct");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("执行InitAndDestroySeqBean: afterPropertiesSet");
    }

    public void initMethod() {
        System.out.println("执行InitAndDestroySeqBean: init-method");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("执行InitAndDestroySeqBean: preDestroy");
    }

    public void destroy() throws Exception {
        System.out.println("执行InitAndDestroySeqBean: destroy");
    }

    public void destroyMethod() {
        System.out.println("执行InitAndDestroySeqBean: destroy-method");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.close();
    }
}
