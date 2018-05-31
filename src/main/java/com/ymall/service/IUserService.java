package com.ymall.service;

import com.ymall.common.ServerResponse;
import com.ymall.pojo.User;

public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str,String type);

    ServerResponse selectQuestion(String username);

    ServerResponse<String> checkAnswer(String username, String question, String answer);

    ServerResponse<String> forgetResetPassword(String username, String passwordNew, String forgetToken);

    ServerResponse<String> resetPassword(String passwordOld,String passwordNew, User user);

    ServerResponse<User> updateInfomation(User user);

    ServerResponse<User> getInformation(Integer userId);
}
