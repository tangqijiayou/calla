package com.tangqijiayou.calla.service;


import com.tangqijiayou.calla.model.one.Account;

/**
 * @author merry
 *
 */
public interface IAccountService{

	/**
	 * 根据手机号查询用户表
	 * 
	 * @param phone
	 * @return Account
	 */
	public Account findByPhone(String phone);
	
	/**
	 * 新增用户
	 * 
	 * @param account
	 * @return Account
	 */
	public Account save(Account account);
}
