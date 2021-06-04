package test.GOF;
/**
* @Description: 适配器模式
* @Param:
* @Author: Tiankaiqiang
* @Return:
* @Date: 2021/6/3 - 14:22
*/
public class TargetInterface {

}
interface user{
  //此方式在后续更新中可能改变，需要适配后面的变化
  public void sayHello();
  public void makeIt();
}
class Man{
  //此方法可看作改变的结果，之前的方法 为 sayHello（）
  public void eat(){

  };

  public void makeIt(){

  };
}
//接口方式实现
class People extends Man implements user{
  //这里是进行适配的方式
  @Override
  public void sayHello() {

  }
}
//***********************************************************
//委派方式实现
class peoples implements user{
  private Man man;

  public peoples(Man man) {
    this.man = man;
  }

  @Override
  public void sayHello() {

  }

  @Override
  public void makeIt() {

  }
}
