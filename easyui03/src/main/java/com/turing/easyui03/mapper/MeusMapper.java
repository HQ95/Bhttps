package com.turing.easyui06.mapper;

import com.turing.easyui06.entity.Meus;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MeusMapper {
    /**
     * 查询所有的根节点
     * @return
     */
    @Select("select * from meus where pid=0")
    public List<Meus> findRoot();

    /**
     * 根据父节点的id查询所有菜单
     * @param id
     * @return
     */
    @Select("select * from meus where pid=#{id}")
    public List<Meus> findById(Integer id);
  }
