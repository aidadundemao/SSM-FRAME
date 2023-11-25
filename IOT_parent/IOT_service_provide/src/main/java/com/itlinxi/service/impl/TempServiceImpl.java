package com.itlinxi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itlinxi.dao.TempDao;
import com.itlinxi.pojo.Temp;
import com.itlinxi.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Service(interfaceClass = TempService.class)
@Transactional
public class TempServiceImpl implements TempService {

    @Autowired
    private TempDao tempDao;

    @Override
    public void add(Temp temp) {
        tempDao.add(temp);
    }

}
