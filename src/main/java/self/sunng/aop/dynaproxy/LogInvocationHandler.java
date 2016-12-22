package self.sunng.aop.dynaproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 * 
 * @author    sunxiaodong
 */
public class LogInvocationHandler implements InvocationHandler {

	private Object target;
	
	public LogInvocationHandler(Object object) {
		this.target = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object returnValue = method.invoke(target, args);

        if(method.getName().equals("doBiz1")) {
            System.out.println("LogInvocationHandler - after doBiz1");
        }
		return returnValue;
	}

}
