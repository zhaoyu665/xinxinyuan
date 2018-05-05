package com.xinxinyuan.gongyu.service;

import com.xinxinyuan.gongyu.dao.entity.Flats;
import com.xinxinyuan.gongyu.dao.mapper.FlatsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FlatsService {

    @Autowired
    private FlatsMapper flatsMapper;

    /**
     * 查询多有flats
     *
     * @param flats
     * @return
     */
    public List<Flats> selectAll(Flats flats){
        Map<String,Object> map=new HashMap<>();
        map.put("",flats.getName());
        map.put("age",flats.getAge());
        map.put("high",flats.getHigh());
        map.put("id",flats.getId());
        List<Flats> flatsList= flatsMapper.selectFlats(map);
        for(Flats flats1:flatsList){
            flats1.setAge("0");
        }
        return flatsList;
    }
}
