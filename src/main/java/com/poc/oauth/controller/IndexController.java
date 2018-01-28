package com.poc.oauth.controller;

import java.security.Principal;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class IndexController {

	@RequestMapping("/")
	public String hello(Principal user) {
		return "Hello" + user.getName();
	}

}
