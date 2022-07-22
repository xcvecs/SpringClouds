package com.example.cdboot.config;

import com.example.cdboot.domain.DaoOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigTwo implements Configs{
    private DaoOne daoOne;

    @Autowired
    public void setDaoOne(DaoOne daoOne) {
        this.daoOne = daoOne;
    }
}
