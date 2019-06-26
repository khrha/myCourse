package com.ipg.study.ch03.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ipg.study.ch03.spring.ChangePasswordService;
import com.ipg.study.ch03.spring.MemberDao;
import com.ipg.study.ch03.spring.MemberInfoPrinter;
import com.ipg.study.ch03.spring.MemberListPrinter;
import com.ipg.study.ch03.spring.MemberPrinter;
import com.ipg.study.ch03.spring.MemberRegisterService;
import com.ipg.study.ch03.spring.VersionPrinter;

@Configuration
public class AppConf2 {
	@Autowired
	private MemberDao memberDao;
	@Autowired
	private MemberPrinter memberPrinter;
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao);
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		ChangePasswordService pwdSvc = new ChangePasswordService();
		pwdSvc.setMemberDao(memberDao);
		return pwdSvc;
	}
	
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter(memberDao, memberPrinter);
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		infoPrinter.setMemberDao(memberDao);
		infoPrinter.setPrinter(memberPrinter);
		return infoPrinter;
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
}
