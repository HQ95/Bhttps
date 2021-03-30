package com.turing.easyui06.service.impl;

import com.turing.easyui06.entity.Meus;
import com.turing.easyui06.mapper.MeusMapper;
import com.turing.easyui06.service.MeusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MeusServiceImpl implements MeusService {
    @Autowired
    private MeusMapper meusMapper;
    @Override
    public List<Meus> findMeus() {
        //根节点
        List<Meus> root = meusMapper.findRoot();
        recursion(root);
        return root;
    }

    /**
     * 递归获取节点
     * @param meus
     */
    public void recursion(List<Meus> meus){
        for (Meus m:meus){
            List<Meus> byId = meusMapper.findById(m.getId());
            if(byId.size()>0){
                m.setMeuses(byId);
                //递归
                recursion(byId);
            }
        }
    }
}
