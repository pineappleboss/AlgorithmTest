package mode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
* @Description: 动态代理
* @Param:
* @Author: Tiankaiqiang
* @Return:
* @Date: 2021/5/28 - 11:23
*/
public class ProxyTest {
  public static void main(String[] args) {
    HelloInterface hello = new Hello();
    Proxyhandle proxyhandle = new Proxyhandle(hello);
    /**
     * Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), proxyhandle)
     * 这个接口用来进行动态代理。hello.getClass().getClassLoader()为代理类的类加载器。
     * hello.getClass().getInterfaces()被代理类需要实现的接口。
     * proxyhandle 动态代理方法执行时，会调用proxyhandle中的invoke方法。
     */
    HelloInterface helloInterface = (HelloInterface) Proxy.newProxyInstance(hello.getClass().getClassLoader(), hello.getClass().getInterfaces(), proxyhandle);
    helloInterface.sayHello();

  }
}
class Proxyhandle implements InvocationHandler{
  private final Object object;
  public Proxyhandle(Object o){
    this.object = o;
  }

  @Override
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

    System.out.println("prefix");
    method.invoke(object, args);
    System.out.println("after");
    return null;
  }
}

interface HelloInterface{
  void sayHello();
}
class Hello implements HelloInterface{

  @Override
  public void sayHello() {
    System.out.println("hello!");
  }
}
