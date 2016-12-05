package com.tangqijiayou.calla.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tangqijiayou.calla.model.one.Account;


/**
 * @author merry
 *
 */
public interface IAccountRepository extends JpaRepository<Account, Long>{
	/**
	 * 根据手机号查询用户表
	 * 
	 * @param phone
	 * @return
	 */
	public Account findByPhone(String phone);
	
	/**
	 * 新增用户
	 * 
	 * @param phone
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public Account save(Account account);
	
}
