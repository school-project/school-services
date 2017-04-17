package com.school.service;

import com.school.db.domain.Role;

/**
 * Created by Ivan.Luo
 * Date: 4/17/2017 10:04 AM
 */
public interface RoleService
{
	long saveRole(Role role);

	void deleteRole(long id);
}
