package info.kinhho.karaoke.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import info.kinhho.karaoke.entity.AccountEntity;
import info.kinhho.karaoke.repository.AccountRepository;


@Service
public class AccountPrincipalDetailsService implements UserDetailsService {
	
	private info.kinhho.karaoke.repository.AccountRepository accountRepository;
	
	public AccountPrincipalDetailsService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		AccountEntity account = this.accountRepository.findByUsername(username);
		
		account = account != null ? account : new AccountEntity();
		AccountPrincipal userPrincipal = new AccountPrincipal(account);
		
		return userPrincipal;
	}
}