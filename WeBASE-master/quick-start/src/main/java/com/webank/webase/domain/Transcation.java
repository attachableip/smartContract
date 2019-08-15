package com.webank.webase.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class Transcation {
    private Integer groupId;
    private String user;
    private String contractName;
    private String funcName;
    private String contractAddress;
    private Boolean useAes;
    private List<Object> funcParam;


}
