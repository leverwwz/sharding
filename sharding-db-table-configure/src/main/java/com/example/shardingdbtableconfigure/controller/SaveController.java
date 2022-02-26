package com.example.shardingdbtableconfigure.controller;

import com.example.shardingdbtableconfigure.entity.Save;
import com.example.shardingdbtableconfigure.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SaveController {

    @Autowired
    private SaveService saveService;

    //http://localhost:9112/save
    @GetMapping("save")
    public String save(){
        long time = System.currentTimeMillis();
        for(int i= 1 ; i <= 40 ; i ++){
            Save save = new Save();
            save.setId((long) i);
            save.setUsername( "shangpin" + i);
            save.setApplyno(i+1+"");
            save.setType((long) (i+1));
            Save save1= saveService.save(save);
            System.out.println(save1);
        }
        return "success";
    }

    //http://localhost:9112/selectAll
    @GetMapping("selectAll")
    public List<Save> select(){
        return saveService.findAll();
    }

    //http://localhost:9112/select
    @GetMapping("select")
    public List<Save> select(String id){
        return saveService.findAllByIdBetween(21L,39L);
    }

    //http://localhost:9112/find?id=1
    @GetMapping("find")
    public Object find(@RequestParam("id") Long id){
        System.out.println(id);
        List<Long> list = new ArrayList<>();
        list.add(id);
        return saveService.findAllByIdIn(list);
    }

    //http://localhost:9112/delete
    @GetMapping("delete")
    public void delete(String id){
        saveService.deleteAll();
    }
}
