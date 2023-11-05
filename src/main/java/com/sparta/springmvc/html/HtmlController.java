package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    private static long visitCount = 0;

    @GetMapping("/static-hello")
    public String hello(){
        return "hello.html";
    }

    @GetMapping("/html/redirect")
    public String htmlStatic(){
        return "redirect:/hello.html";
    }

    @GetMapping("/html/templates")
    public String htmlTemplates(){
        //templates에 있는 파일은 확장자명을 안붙여도 알아서 html파일을 찾아준다.
        return "hello";
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model){
        visitCount ++;
        model.addAttribute("visits", visitCount);
        return "hello-visit";
    }
}
