package self.sunng.aop.bytecodetranform;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 * 
 * @author    sunxiaodong
 */
public class CustomByteCodeTransformer implements ClassFileTransformer {

	@Override
	public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined,
			ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {

        if (!"self/sunng/aop/common/Impl".equals(className)) {
            return null;
        }

		if(className.contains("/")) {
			className = className.replaceAll("/", ".");
		}

		try {
			CtClass cc = ClassPool.getDefault().get(className);
			CtMethod m = cc.getDeclaredMethod("doBiz1");
			m.insertBefore("System.out.println(\"CustomByteCodeTransformer - before doBiz1\");");
            m.insertAfter("System.out.println(\"CustomByteCodeTransformer - after doBiz1\");");
			return cc.toBytecode();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void premain(String option, Instrumentation ins) {
		ins.addTransformer(new CustomByteCodeTransformer());
	}

}
