package com.xinxinyuan.gongyu.controller;

import com.xinxinyuan.gongyu.dao.entity.Flats;
import com.xinxinyuan.gongyu.service.FlatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/xinxinyuan")
public class FlatsController {

    @Autowired
    private FlatsService flatsService;

    @RequestMapping(value = "/insertFlats")
    public Long addFlats(@RequestBody Flats flats){
         flatsService.selectAll(flats);
         return null;
    }
}
