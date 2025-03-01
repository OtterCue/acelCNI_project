package com.aselcni.main.service;

import java.util.List;

import com.aselcni.main.model.Common;
import com.aselcni.main.model.UserMst;

public interface AdminService {

	List<Common> getAuthorityList();

	int userAdd(UserMst user);

	int totalUserCountByKeyword(UserMst user);

	List<UserMst> userListByKeyword(UserMst user);

	void userDelete(UserMst user);

	int isUserExist(UserMst user);

	void userUpdate(UserMst user);

}
