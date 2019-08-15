package com.webank.webase.vo;

import lombok.Data;

@Data
public class SendTranscationVo {

    private String url;
    private String user;
    private int groupId;
    private Boolean useAes;
    private String contractName;
    private String contractAddress;
    private String funcName;
    private String funcParam;


}
