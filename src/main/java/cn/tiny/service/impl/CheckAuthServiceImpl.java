package cn.tiny.service.impl;

import cn.tiny.aspect.LocalUserManager;
import cn.tiny.service.CheckAuthService;
import org.springframework.stereotype.Service;

/**
 * @author tiny
 * date 2018/12/29 11:10
 */
@Service
public class CheckAuthServiceImpl implements CheckAuthService {

    @Override
    public void checkAccess() {
        String name = LocalUserManager.get();
        if(!"admin".equals(name)){
            System.out.println(111);
            throw new RuntimeException("check your root!");
        }
    }
}
