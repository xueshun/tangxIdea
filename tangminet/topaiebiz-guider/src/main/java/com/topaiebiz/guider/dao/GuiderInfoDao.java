package com.topaiebiz.guider.dao;

import com.nebulapaas.data.mybatis.common.BaseDao;
import com.topaiebiz.guider.entity.GuiderAuditInfoEntity;
import com.topaiebiz.guider.entity.GuiderInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by admin on 2018/5/31.
 */
@Mapper
public interface GuiderInfoDao extends BaseDao<GuiderInfoEntity> {
}
