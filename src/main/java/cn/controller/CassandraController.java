package cn.controller;

import cn.service.CassandraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CassandraController {


    @Autowired
    private CassandraService CassandraService;

    @RequestMapping(value = "/getCassandraService", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public int getCassandraService() {
        System.out.println("getCassandraService..");
        return 1;
    }


}
