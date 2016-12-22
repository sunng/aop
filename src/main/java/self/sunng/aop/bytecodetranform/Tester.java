package self.sunng.aop.bytecodetranform;

import self.sunng.aop.common.Impl;

/**
 * Created by sunxiaodong on 16/10/10.
 */
public class Tester {
    public static void main(String[] args) {
        Impl impl = new Impl();
        impl.doBiz1();
        impl.doBiz2();
    }
}
