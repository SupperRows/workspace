package com.open.capacity.user.dao;

import com.open.capacity.user.model.Classfiy;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author syf
 * @email 597926353@qq.com
 * @date 2020-10-20 14:04:51
 */
@Mapper
public interface ClassfiyDao {

    int save(Classfiy classfiyDetail);

    int update(Classfiy classfiyDetail);

    int delete(String classfiyId);

    List<Classfiy> findAll(Map<String, Object> params);

}
