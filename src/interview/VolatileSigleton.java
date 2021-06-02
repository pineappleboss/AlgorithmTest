package src.interview;

public class VolatileSigleton {
    private static volatile   VolatileSigleton volatileSigleton = null; //volatile 防止多线程情况下指令重排
    private VolatileSigleton(){};
    //DCL(double check lock)
    public  static VolatileSigleton  getVolatileSigleton(){
        if (volatileSigleton == null){
            synchronized (VolatileSigleton.class){ //防止在多线程进入此判断new之前返回new对象
                if (volatileSigleton == null)return new VolatileSigleton();
            }
        }
        return volatileSigleton;
    }
}
