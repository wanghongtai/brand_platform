package com.gqgx.common.service;

import com.gqgx.common.entity.BrandGnSmalltypeItem;
import com.gqgx.common.entity.BrandLargeType;
import com.gqgx.common.entity.vo.BrandGnSmalltypeItemVo;
import com.gqgx.common.paging.LayuiPage;
import com.gqgx.common.paging.PagingResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Hunter on 2020-06-23.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class BrandLargeTypeServiceImplTest {
    @Autowired
    private BrandLargeTypeService brandLargeTypeService;

    @Test
    public void test() throws Exception {
        BrandGnSmalltypeItemVo vo = new BrandGnSmalltypeItemVo();
        vo.setSmallTypeId(1L);


        BrandLargeType brandLargeType = new BrandLargeType();
        List<BrandLargeType> brandLargeTypeList
                = brandLargeTypeService.findBrandLargeTypeList(brandLargeType);

        System.out.println("总条数："+brandLargeTypeList.size());
        for(BrandLargeType item:brandLargeTypeList){
            System.out.println(item);
        }
    }
}
