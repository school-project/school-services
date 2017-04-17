package com.school.service;

import com.school.db.dao.RoleDao;
import com.school.db.domain.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:04 AM
 */
@Service
public class RoleServiceImpl implements RoleService
{
	private static final Logger LOGGER = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Autowired
	RoleDao roleDao;
	public long saveRole(Role role)
	{
		return roleDao.save(role);
	}

	public void deleteRole(long id)
	{
		roleDao.delete(id);
	}
}
