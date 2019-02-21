package com.pankajg.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class LuckyWordController {

    @RequestMapping("/lucky-word")
    public String getLuckyWord(){
        String line = "The lucky word is: "+luckyWord;
        return line;
    }

    @Value("${message:pankaj}") //@Value("${message:Hello default}")
            String luckyWord;


}
