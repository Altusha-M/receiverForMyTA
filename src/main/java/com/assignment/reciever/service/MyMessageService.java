package com.assignment.reciever.service;

import com.assignment.reciever.entity.MyMessage;

import java.util.Collection;

public interface MyMessageService {

    void createMessage(MyMessage message);
    void createMessage(String message);

    Collection<MyMessage> getMessages();

}
