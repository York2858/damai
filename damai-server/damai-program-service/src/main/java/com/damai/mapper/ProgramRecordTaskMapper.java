package com.damai.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.damai.entity.ProgramRecordTask;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目对账记录任务 mapper
 * @author: 阿星不是程序员
 **/
public interface ProgramRecordTaskMapper extends BaseMapper<ProgramRecordTask> {
    /**
     * 真实删除节目对账记录任务数据
     * @return 结果
     * */
    Integer relDelProgramRecordTask();
}
