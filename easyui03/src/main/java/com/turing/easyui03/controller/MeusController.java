package com.turing.easyui06.controller;

import com.turing.easyui06.entity.Meus;
import com.turing.easyui06.service.MeusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/meus")
public class MeusController {
    @Autowired
    private MeusService meusService;

    /**
     * 得到树状图的json
     * @return
     */
    @GetMapping("/")
    @ResponseBody
    public List<Meus> findMeus(){
        return  meusService.findMeus();
    }
}
