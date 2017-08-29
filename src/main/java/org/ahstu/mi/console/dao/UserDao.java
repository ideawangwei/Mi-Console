package org.ahstu.mi.console.dao;

import org.ahstu.mi.console.entity.UserEntity;

/**
 * Created by xiezg@317hu.com on 2017/8/29 0029.
 */
public interface UserDao {

    /**
     * @param userEntity
     */
    void saveUser(UserEntity userEntity);
}
