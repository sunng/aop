package self.sunng.aop.dynaproxy;

import self.sunng.aop.common.IBiz1;
import self.sunng.aop.common.IBiz2;
import self.sunng.aop.common.Impl;

import java.lang.reflect.Proxy;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 *
 * @author sunxiaodong
 */
public class Tester {
    public static void main(String[] args) {
        Class[] proxyInterface = new Class[]{IBiz1.class, IBiz2.class};

        LogInvocationHandler handler = new LogInvocationHandler(new Impl());

        ClassLoader classLoader = Tester.class.getClassLoader();

        IBiz1 proxyBiz1 = (IBiz1) Proxy.newProxyInstance(classLoader, proxyInterface, handler);

        proxyBiz1.doBiz1();

        IBiz2 proxyBiz2 = (IBiz2) Proxy.newProxyInstance(classLoader, proxyInterface, handler);

        proxyBiz2.doBiz2();
    }
}
