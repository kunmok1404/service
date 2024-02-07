package org.delivery.service.dto.account;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.delivery.service.dto.BaseEntity;

@SuperBuilder
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="account")
public class AccountEntity extends BaseEntity {
}
