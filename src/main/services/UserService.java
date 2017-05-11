package main.services;

import main.model.entity.User;

/**
 * Created by Aleksei Lysov on 20.04.2017.
 */
public interface UserService {
    User auth(String login, String password);
}
