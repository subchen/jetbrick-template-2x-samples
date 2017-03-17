package demo;

import java.io.StringWriter;
import java.util.*;
import jetbrick.template.*;

public class Main {

    public static void main(String args[]) {
        List<User> users = Arrays.asList(
            new User("张三", "zhangsan@qq.com"),
            new User("李四", "lisi@qq.com"),
            new User("王五", "wangwu@qq.com")
        );

        JetEngine engine = JetEngine.create();
        JetTemplate template = engine.getTemplate("/users.jetx");

        Map<String, Object> context = new HashMap<String, Object>();
        context.put("users", users);

        StringWriter writer = new StringWriter();
        template.render(context, writer);

        System.out.println(writer.toString());
    }
}