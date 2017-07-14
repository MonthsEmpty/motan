package quickstart;

/**
 *
 * Created by renwu on 2017/7/10.
 */
public class FooServiceImpl implements FooService {
    public String hello(String name) {
        System.out.println(name + " invoked rpc service");
        return "hello " + name;
    }
}
