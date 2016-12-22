package self.sunng.aop.customclassloader;

import javassist.ClassPool;
import javassist.Loader;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 * 
 * @author    sunxiaodong
 */
public class Tester {
	public static void main(String[] args) throws Throwable {
		ClassPool cp = ClassPool.getDefault();
		Loader loader = new Loader();
		
		loader.addTranslator(cp, new CustomTranslator());
		
		loader.run("self.sunng.aop.customclassloader.CustomTranslator", args);
	}
}
