package common.service;

import com.gqgx.common.entity.SysUser;
import com.gqgx.common.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Hunter on 2020-06-29.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SysUserServiceImplTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void test() throws Exception {
        SysUser admin = sysUserService.findUserByAccountName("admin");
        System.out.println(admin);

        System.out.println(admin.getSysMenus());
    }
}
