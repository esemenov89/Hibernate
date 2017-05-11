package main.services;

import main.model.dao.UserDao;
import main.model.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by Aleksei Lysov on 20.04.2017.
 */
@Component
public class UserServiceImpl implements UserService{

    private static final Logger LOGGER = Logger.getLogger(UserServiceImpl.class);
    private UserDao userDao;

    @Override
    public User auth(String login, String password) {
        User user = userDao.findLoginAndPassword(login, password);
        LOGGER.debug(user);

        if ((user != null) && (!user.isBlocked()))
                return user;
        return null;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserDao getUserDao() {
        return userDao;
    }
}
