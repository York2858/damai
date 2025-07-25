package com.damai.service.lua;

import com.damai.domain.PurchaseSeat;
import lombok.Data;

import java.util.List;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目缓存更新 实体
 * @author: 阿星不是程序员
 **/
@Data
public class ProgramCacheCreateOrderData {

    private Integer code;
    
    private List<PurchaseSeat> purchaseSeatList;
}
