package self.sunng.aop.customclassloader;

import javassist.*;
import self.sunng.aop.common.Impl;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 *
 * @author sunxiaodong
 */
public class CustomTranslator implements Translator {

    @Override
    public void onLoad(ClassPool classPool, String className) throws NotFoundException, CannotCompileException {
//		System.out.println(className);

        if (!"self.sunng.aop.common.Impl".equals(className)) {
            return;
        }

        try {
            CtClass cc = classPool.get(className);
            CtMethod m = cc.getDeclaredMethod("doBiz1");
            m.insertBefore("System.out.println(\"CustomTranslator - before doBiz1\");");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(ClassPool arg0) throws NotFoundException, CannotCompileException {
    }

    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.doBiz1();
        impl.doBiz2();
    }

}
