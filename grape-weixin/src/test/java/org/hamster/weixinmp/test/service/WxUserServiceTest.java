package org.hamster.weixinmp.test.service;

import org.hamster.weixinmp.exception.WxException;
import org.hamster.weixinmp.model.user.WxUserGetJson;
import org.hamster.weixinmp.service.WxAuthService;
import org.hamster.weixinmp.service.WxUserService;
import org.hamster.weixinmp.test.base.AbstractWxServiceTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 * @author Liubao
 * @2015年7月9日
 * 
 */
public class WxUserServiceTest extends AbstractWxServiceTest {

    @Autowired
    private WxAuthService authService;
    
    @Autowired
    private WxUserService userService;

    @Test
    public void testAll() throws WxException {
        WxUserGetJson userGet = userService.remoteUserGet(accessToken);
        System.out.println(userGet);
    }
}
