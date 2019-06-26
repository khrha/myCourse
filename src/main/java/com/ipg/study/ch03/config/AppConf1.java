package com.ipg.study.ch03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ipg.study.ch03.spring.MemberDao;
import com.ipg.study.ch03.spring.MemberPrinter;

@Configuration
public class AppConf1 {
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberPrinter memberPrint() {
		return new MemberPrinter();
	}
}
