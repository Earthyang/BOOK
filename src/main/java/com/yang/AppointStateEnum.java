package com.yang;

/**
 * 使用枚举表述常量数据字典
 * 向enum类添加方法与自定义构造函数
 * @author yang
 */
public enum AppointStateEnum {
    /**
     * 不同数字代表不同的预约状态
     */
    SUCCESS(1,"预约成功"),
    NO_NUMBER(0, "库存不足"),
    REPEAT_APPOINT(-1, "重复预约"),
    INNER_ERROR(-2, "系统异常");

    private int state;
    private String stateinfo;

    /**
     * 私有构造，防止被外部类调用
     * @param state
     * @param stateinfo
     */
    private AppointStateEnum(int state,String stateinfo){
        this.state=state;
        this.stateinfo=stateinfo;
    }

    public int getState() {
        return state;
    }

    public String getStateInfo() {
        return stateinfo;
    }

    public static AppointStateEnum stateOf(int index) {
        for (AppointStateEnum state : values()) {
            if (state.getState() == index) {
                return state;
            }
        }
        return null;
    }
}
