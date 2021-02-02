package info.kinhho.karaoke.repository;

import org.springframework.data.repository.CrudRepository;

import info.kinhho.karaoke.entity.AccountEntity;

public interface AccountRepository extends CrudRepository<AccountEntity, Integer> {
	
	AccountEntity findByUsername(String username);
	
}
