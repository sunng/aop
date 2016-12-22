package self.sunng.aopinspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sunxiaodong on 2016/11/7.
 */
public class Tester {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        TestTarget testTarget = (TestTarget) context.getBean("testTarget");
        testTarget.test();

        TestInterface testTargetWithInterface = (TestInterface) context.getBean("testTargetWithInterface");
        testTargetWithInterface.test();
    }
}
