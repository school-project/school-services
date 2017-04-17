package com.school.db.dao;

import com.school.db.domain.Role;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 9:49 AM
 */
public interface RoleDao
{
	long save(Role Role);

	int delete(long id);
}
