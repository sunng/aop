package self.sunng.aop.dynabytecodegen;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 * 
 * @author    sunxiaodong
 */
public class LogIntercept implements MethodInterceptor {

	@Override
	public Object intercept(Object target, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		Object returnValue = proxy.invokeSuper(target, args);

        if(method.getName().equals("doBiz1")) {
            System.out.println("LogIntercept - after doBiz1");
        }
		return returnValue;
	}

}
