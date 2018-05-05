package com.xinxinyuan.gongyu.dao.mapper;

import com.xinxinyuan.gongyu.dao.entity.Flats;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface FlatsMapper{

    List<Flats> selectFlats(Map<String,Object> map);
}
