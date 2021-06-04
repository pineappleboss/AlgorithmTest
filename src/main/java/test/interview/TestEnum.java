package test.interview;



public enum  TestEnum {
    VIVO(1,"VIVO"),
    OPPO(2,"OPPO"),
    XIAOMI(3,"XIAOMI"),
    HUAWEI(4,"HUAWEI"),
    APPLE(5,"APPLE");

    private Integer retCode;
    private String retName;
    public static TestEnum searchPhone(int integer){
        for (TestEnum testEnum :
                TestEnum.values()) {
            if(testEnum.retCode == integer){
                return testEnum;
            }
        }
        return null;
    }
    TestEnum(Integer retCode, String retName) {
        this.retCode = retCode;
        this.retName = retName;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getRetName() {
        return retName;
    }

    public void setRetName(String retName) {
        this.retName = retName;
    }
}
