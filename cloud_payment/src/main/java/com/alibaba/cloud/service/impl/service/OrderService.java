package com.alibaba.cloud.service.impl.service;

import com.alibaba.cloud.entity.UserAddress;

import java.util.List;

public interface OrderService {

    public List<UserAddress> initOrder(String userID);

}