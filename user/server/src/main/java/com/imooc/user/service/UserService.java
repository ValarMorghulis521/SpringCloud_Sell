package com.imooc.user.service;

import com.imooc.user.dataobject.UserInfo;

public interface UserService {
    /**
     * 通过openid来查询
     * @param openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
