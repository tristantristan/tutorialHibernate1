package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "AccountsTable",
  uniqueConstraints = { @UniqueConstraint(columnNames = { "DEPT_NO" }) })
public class AccountEntity {
	
	Integer accountId;
	String username;
	String password;
	
}
