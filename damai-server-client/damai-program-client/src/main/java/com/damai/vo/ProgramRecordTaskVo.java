package com.damai.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

/**
 * @program: 极度真实还原大麦网高并发实战项目。 添加 阿星不是程序员 微信，添加时备注 大麦 来获取项目的完整资料 
 * @description: 节目对账记录任务 vo
 * @author: 阿星不是程序员
 **/
@Data
@Schema(title="ProgramRecordTaskVo", description ="节目对账记录任务")
public class ProgramRecordTaskVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @Schema(name ="id", type ="Long", description ="区域id")
    private Long id;

    /**
     * 节目表id
     */
    @Schema(name ="programId", type ="Long", description ="节目表id")
    private Long programId;

    /**
     * 处理状态 1:未处理 1:已处理
     */
    @Schema(name ="handleStatus", type ="Integer", description ="处理状态 1:未处理 1:已处理")
    private Integer handleStatus;
    
    /**
     * 创建时间
     */
    @Schema(name ="createTime", type ="Date", description ="创建时间")
    private Date createTime;
}
