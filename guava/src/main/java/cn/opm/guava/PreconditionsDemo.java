package cn.opm.guava;

import com.google.common.base.Preconditions;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;


/**
 * @ClassName PreconditionsDemo
 * @Description 描述这个类干嘛用的
 * @Author OPM
 * @Date 2020/1/15 14:46
 * @Version 1.0
 * @Blame OPM Team
 */
public class PreconditionsDemo {
    public static void main(String[] args) {
        checkArgument(3 > 2, "this is false%s skdf %s!", 1, 3);
        String tmp = null;
        checkNotNull(tmp, "this is null %s !", "skdjfalsd");
    }
}
