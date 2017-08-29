package org.ahstu.mi.console.dao.impl;

import org.ahstu.mi.console.dao.UserDao;
import org.ahstu.mi.console.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by xiezg@317hu.com on 2017/8/29 0029.
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveUser(UserEntity userEntity) {
        mongoTemplate.save(userEntity);
    }
}
