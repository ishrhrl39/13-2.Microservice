package org.msa.authentication.service;

import java.util.Optional;

import org.msa.authentication.domain.Account;
import org.msa.authentication.dto.AccountDTO;
import org.msa.authentication.repository.AccountRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountService {
	private final AccountRepository accountRepository;
	
	// 계정조회
	public Account selectAccount(AccountDTO accountDTO) {
		Optional<Account> optional = accountRepository.findById(accountDTO.getAccountId());
		if(optional.isPresent()) {
			Account account = optional.get();
			if(account.getPassword().equals(accountDTO.getPassword())) {
				return account;
			}
		}
		return null;
	}
	
	// 계정정보 저장
	public void saveAccount(AccountDTO accountDTO, String token) {
		accountRepository.save(Account.builder()
				.accountId(accountDTO.getAccountId())
				.password(accountDTO.getPassword())
				.token(token)
				.build());
	}
}