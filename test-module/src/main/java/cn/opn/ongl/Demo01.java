package cn.opn.ongl;

import lombok.AllArgsConstructor;
import lombok.Data;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import java.util.HashMap;
import java.util.Map;

/**
 * 包 名 称：cn.opn.ongl
 * 类 名 称：Demo01
 * 类 描 述：TODO ...
 * 创建时间：2020/3/11 11:38
 * 创 建 人：OPM
 */
public class Demo01 {

    @Data
    @AllArgsConstructor
    public static class User {
        private String username;
        private Integer age;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static void main(String[] args) throws OgnlException {
        Map<String, Object> root = new HashMap<>();
        root.put("jack", new User("jack", 19));
        root.put("lucy", new User("lucy1", 18));

        Map context = Ognl.createDefaultContext(root);
        context.put("lucy", new User("lucy2", 18));

        Object expression = Ognl.parseExpression("lucy.username");
        Object value = Ognl.getValue(expression, context, root);
        System.out.println(value);

        Object expression2 = Ognl.parseExpression("jack.age");
        Object value2 = Ognl.getValue(expression2, context, root);
        System.out.println(value2);

        Object value3 = Ognl.getValue("jack.username", context, root);
        System.out.println(value3);

        OgnlContext ognlContext = new OgnlContext();
        Object tmp = ognlContext.getRoot();
        ognlContext.put("test", "hello");
        Object value4 = Ognl.getValue("#test", ognlContext, tmp);
        System.out.println(value4);
    }
}
