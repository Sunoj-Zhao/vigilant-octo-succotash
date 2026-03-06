package com.example.springboothello.controller; // 包名必须正确

import com.example.springboothello.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// 必须加@RestController，否则不会被识别为控制器
@RestController
// 类级别前缀，所有方法路径都要拼接这个
@RequestMapping("/api")
public class HelloController {

    // 方法级别路径，仅处理GET请求
    @GetMapping("/hello")
    public ResultVO<String> hello() {
        return ResultVO.success("Hello Spring Boot");
    }
}