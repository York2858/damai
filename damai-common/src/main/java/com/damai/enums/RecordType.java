package com.damai.enums;

import java.util.Objects;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 记录类型
 * @author: 阿星不是程序员
 **/
public enum RecordType {
    /**
     * 记录类型
     * */
    REDUCE(-1,"reduce","扣减余票"),

    CHANGE_STATUS(0,"changeStatus","改变状态"),

    INCREASE(1,"increase","增加余票"),
    
    ;

    private Integer code;
    
    private String value;

    private String msg;

    RecordType(Integer code, String value, String msg) {
        this.code = code;
        this.value = value;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg == null ? "" : this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public String getValue() {
        return value;
    }
    
    public void setValue(final String value) {
        this.value = value;
    }
    
    public static String getMsg(Integer code) {
        for (RecordType re : RecordType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re.msg;
            }
        }
        return "";
    }

    public static RecordType getRecordType(Integer code) {
        for (RecordType re : RecordType.values()) {
            if (re.code.intValue() == code.intValue()) {
                return re;
            }
        }
        return null;
    }

    public static Integer getCodeByValue(String value) {
        for (RecordType re : RecordType.values()) {
            if (Objects.equals(re.value, value)) {
                return re.code;
            }
        }
        return Integer.MIN_VALUE;
    }
}
