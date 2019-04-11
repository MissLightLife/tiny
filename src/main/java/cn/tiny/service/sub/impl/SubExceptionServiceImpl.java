package cn.tiny.service.sub.impl;

import cn.tiny.aspect.CheckRoot;
import cn.tiny.service.sub.SubExceptionService;
import org.springframework.stereotype.Service;

/**
 * @author tiny
 * date 2018/12/29 14:11
 */
@Service
public class SubExceptionServiceImpl implements SubExceptionService {

    @CheckRoot
    @Override
    public void logFor() throws NumberFormatException {
        System.out.println("log from SubExceptionServiceImpl");
        Integer integer = Integer.valueOf("wan");
    }
}
