package com.school.db.dao;

import com.school.db.domain.AccountCustomerLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 4:15 PM
 */
@Repository
@Transactional
public class AccountCustomerLinkDaoImpl extends AbstractHibernateDao implements AccountCustomerLinkDao
{
	private static final Logger LOGGER = LoggerFactory.getLogger(AccountCustomerLinkDaoImpl.class);

	public long save(AccountCustomerLink accountCustomerLink)
	{
		LOGGER.debug("saving accountCustomerLink to DB");
		Long id = (Long) getSession().save(accountCustomerLink);
		LOGGER.debug("accountCustomerLink is saved to DB with id=" + id);

		return id;
	}
}
