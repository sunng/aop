package self.sunng.aop.common;

/**
 * <B>功能简述</B><br>
 * 功能详细描述
 *
 * @author sunxiaodong
 */
public class Impl implements IBiz1, IBiz2 {

    @Override
    public void doBiz1() {
        System.out.println("Impl - doBiz1.");
    }

    @Override
    public void doBiz2() {
        System.out.println("Impl - doBiz2.");
    }

}
