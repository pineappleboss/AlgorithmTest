package mode;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class ReflectTest {
  public static void main(String[] args) {
    Class user = user.class;

    System.out.println(user.getName());
  }
}
@userRelct
class user{
  private int size;
}
@Target({TYPE, FIELD, METHOD})
@Retention(RUNTIME)
@interface userRelct{

}
