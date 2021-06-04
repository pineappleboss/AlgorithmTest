package test.mybatis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperCached {

  static Map<Class<?>,Object> mapper = new HashMap<>();
  public static void main(String[] args) {
    MapperRegist mapperRegist = new MapperRegist("classpath:/mapper/*.xml");
    long start = System.currentTimeMillis();
    List<Class<?>> scanner = mapperRegist.scanner(new MapperCached());
    scanner.parallelStream().forEach(clazz->mapper.put(clazz,new Object()));
    long end = System.currentTimeMillis();
    System.out.println(scanner.toString());
    System.out.println(end-start);
  }
}
class MapperRegist{
  MapperRegist(String configLocation) {
  }
  public List<Class<?>> scanner(Object object){
    List<Class<?>> mapperList = new ArrayList<>();
    for (int i = 0; i < 1000000; i++) {
      mapperList.add(object.getClass());
    }
    return mapperList;
  }
}
