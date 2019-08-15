package com.webank.webase.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.webank.webase.domain.Transcation;
import com.webank.webase.domain.User;
import com.webank.webase.vo.SendTranscationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class TransactionService {

    @Autowired
    private RestTemplate rest;

    @Value("${transactionUrl}")
    private String url;
    private String user;
    private int groupId;
    @Value("${useAes}")
    private Boolean useAes;
    private String contractName;
    private String contractAddress;
    private String funcName;
    private String funcParam;



    public String sendTransaction(User user, SendTranscationVo sendTranscationVo) {
        this.user = user.getUser();
        this.groupId = user.getGroupId();

        this.contractName = sendTranscationVo.getContractName();
        this.contractAddress = sendTranscationVo.getContractAddress();
        this.funcName = sendTranscationVo.getFuncName();
        funcParam = sendTranscationVo.getFuncParam();


        try {
            Transcation transcation = new Transcation();
            transcation.setGroupId(groupId);
            transcation.setContractAddress(contractAddress);
            transcation.setUseAes(useAes);
            transcation.setUser(this.user);
            transcation.setContractName(contractName);
            transcation.setFuncName(funcName);
            transcation.setFuncParam(JSONArray.parseArray(funcParam));

            log.info("transaction param:{}", JSON.toJSONString(transcation));
            Object rsp = rest.postForObject(url, transcation, Object.class);
            String rspStr = "null";
            if (Objects.nonNull(rsp)) {
                rspStr = JSON.toJSONString(rsp);
            }
            log.info("transaction result:{}", rspStr);
            return rspStr;
        } catch (Exception ex) {
            log.error("fail sendTransaction", ex);
        }


    }

}



}

