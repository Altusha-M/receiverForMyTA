package com.assignment.reciever.repository;

import com.assignment.reciever.entity.MyMessage;
import org.springframework.data.repository.CrudRepository;

public interface MyMessageRepository extends CrudRepository<MyMessage, Integer> {

}