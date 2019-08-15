package com.microdreams.modules.cms.server;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

  @RequestMapping("")
  public String getLoginInfo(){
    return "23";
  }

}
