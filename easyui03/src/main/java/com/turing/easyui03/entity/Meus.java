package com.turing.easyui06.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
@Data
public class Meus {
    private Integer id;
    @JsonProperty("text")
    private String name;
    private Integer pid;
    @JsonProperty("children")
    private List<Meus> meuses;
}
