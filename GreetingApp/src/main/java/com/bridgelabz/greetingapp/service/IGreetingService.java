package com.bridgelabz.greetingapp.service;

import com.bridgelabz.greetingapp.entity.Greeting;
import com.bridgelabz.greetingapp.entity.User;

import java.util.List;


public interface IGreetingService {
    String getGreetingMessage();

    String getGreetingMessage(User user);

    Greeting addGreetingMessage(User user);

    Greeting getGreetingMsgById(long id);

    List<Greeting> getAllGreetingMsg();

    Greeting deleteGreetingMsg(long id);

    Greeting updateGreetingMsg(long id, User user);

}
