package mybatis;

import mode.ProxyTest;
import org.apache.ibatis.annotations.Select;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class mybatisTest {
  public static void main(String[] args) {
    selectUser selectUser = (selectUser)Proxy.newProxyInstance(mybatisTest.class.getClassLoader(), new Class<?>[]{selectUser.class}, new InvocationHandler() {

      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //获取参数
        Select annotation = method.getAnnotation(Select.class);
        if(Objects.isNull(annotation)) return null;
        //参数解析
        Map<String,Object> sqlArgsMap = new HashMap<>();
        analysArgs(args,sqlArgsMap);
        //sql解析
        String[] sql = annotation.value();
        if(Objects.isNull(sql[0]))return  null;
        String s = analysSql(sql[0], sqlArgsMap);
        System.out.println(s);
        return null;
      }

    });
    selectUser.selectProxyList(2,"zhangsan");
  }

  private static String analysSql(String sql, Map<String, Object> sqlArgsMap) {
    StringBuilder sqlStr = new StringBuilder();
    int argIndex = 0;
    for (int i = 0; i < sql.length(); i++) {
      if("#".equals(String.valueOf(sql.charAt(i)))&&"{".equals(String.valueOf(sql.charAt(i+1)))){
        for (int j = i+1; j <sql.length() ; j++) {
            if("}".equals(String.valueOf(sql.charAt(j)))){
              sqlStr.append(sqlArgsMap.get(String.valueOf(argIndex)));
              argIndex++;
              i = j;
              break;
            }
        }
      }
      if(!"}".equals(String.valueOf(sql.charAt(i)))){
        sqlStr.append(sql.charAt(i));
      }
    }
    return sqlStr.toString();
  }



  private static void analysArgs(Object[] args ,Map<String,Object> sqlArgsMap) {
    for (int i = 0; i < args.length; i++) {
      sqlArgsMap.put(String.valueOf(i),args[i]);
    }
  }
}


interface selectUser{
  @Select("select *from user wherer id=#{id} and name=#{name}")
  List<ProxyTest> selectProxyList(int id ,String name);
}
