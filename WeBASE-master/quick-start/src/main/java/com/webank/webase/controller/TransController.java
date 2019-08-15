package com.webank.webase.controller;

import com.webank.webase.domain.User;
import com.webank.webase.result.Result;
import com.webank.webase.service.TransactionService;
import com.webank.webase.vo.SendTranscationVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@RequestMapping("/transcation")
public class TransController {

    @Autowired
    TransactionService  transactionService;

    @RequestMapping("/send")
    @ResponseBody
    public Result send(Model model, User user, SendTranscationVo sendTranscationVo){
        transactionService.sendTransaction(user,sendTranscationVo);
    }

    @RequestMapping("/query")
    @ResponseBody
    public Result send(Model model, User user){
        // To Do

        return Result.success("");
    }


}
