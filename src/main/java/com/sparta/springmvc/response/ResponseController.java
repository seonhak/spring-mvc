package com.sparta.springmvc.response;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/response")
public class ResponseController {
    // [Response header]
    //   Content-Type: text/html
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/string")
    @ResponseBody
    public String helloStringJson() {
        return "{\"name\":\"Robbie\",\"age\":95}";
    }

    // [Response header]
    //   Content-Type: application/json
    // [Response body]
    //   {"name":"Robbie","age":95}
    @GetMapping("/json/class")
    @ResponseBody// html이 아니라 데이터를 전달한다는 뜻
    public Star helloClassJson() {
        return new Star("Robbie", 95);
    }
}