package self.sunng.aopinspring;

import org.springframework.stereotype.Component;

/**
 * Created by sunxiaodong on 2016/11/7.
 */
@Component
public class TestTarget {

    public void test() {
        System.out.println("TestTarget - test");
    }
}
