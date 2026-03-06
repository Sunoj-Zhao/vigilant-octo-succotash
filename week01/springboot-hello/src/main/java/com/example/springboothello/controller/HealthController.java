package com.example.springboothello.controller;

import com.example.springboothello.vo.HealthVO;
import com.example.springboothello.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    public ResultVO<HealthVO> health() {
        return ResultVO.success(new HealthVO());
    }
}