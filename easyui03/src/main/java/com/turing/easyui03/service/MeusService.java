package com.turing.easyui06.service;

import com.turing.easyui06.entity.Meus;

import java.util.List;

public interface MeusService {
    /**
     * 查询所有菜单
     * @return
     */
    public List<Meus> findMeus();
}
