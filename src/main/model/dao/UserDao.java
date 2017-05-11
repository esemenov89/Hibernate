package main.model.dao;

import main.model.entity.User;

/**
 * Created by Aleksei Lysov on 20.04.2017.
 */
public interface UserDao {
    User findLoginAndPassword(String login, String password);
}
