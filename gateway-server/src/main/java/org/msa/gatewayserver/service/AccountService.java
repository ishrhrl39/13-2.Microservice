package org.msa.gatewayserver.service;

import org.msa.gatewayserver.repository.AccountRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {
	private final AccountRepository accountRepository;
	
	// 토큰과 사용자ID를 통해 row여부조회
	public boolean existsByAccountIdAndToken(String accountId, String token) {
		return accountRepository.existsByAccountIdAndToken(accountId, token);
	}
}