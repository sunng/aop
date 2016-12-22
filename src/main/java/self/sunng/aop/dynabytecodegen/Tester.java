package self.sunng.aop.dynabytecodegen;

import self.sunng.aop.common.Impl;
import net.sf.cglib.proxy.Enhancer;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 * 
 * @author sunxiaodong
 */
public class Tester {
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(Impl.class);

		enhancer.setCallback(new LogIntercept());

		Impl impl = (Impl) enhancer.create();
		impl.doBiz1();
        impl.doBiz2();
	}
}
