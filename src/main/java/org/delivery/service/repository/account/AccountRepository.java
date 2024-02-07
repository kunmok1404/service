package org.delivery.service.repository.account;

import org.delivery.service.dto.account.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<AccountEntity, Long> {
}
