package com.tangqijiayou.calla.service.impl;

import com.tangqijiayou.calla.model.one.Account;
import com.tangqijiayou.calla.repository.IAccountRepository;
import com.tangqijiayou.calla.service.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class AccountServiceImpl implements IAccountService {
	
	private @Resource IAccountRepository accountRepository;
	
	
	@Override
	public Account findByPhone(String phone) {
		
		return accountRepository.findByPhone(phone);
	}

	@Override
	public Account save(Account account) {
		
		return accountRepository.save(account);
	}


	
}
