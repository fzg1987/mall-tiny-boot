package com.example.malltinyboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
class MallTinyBootApplicationTests {

    @Autowired
    private PmsBrandService pmsBrandService;

    @Test
    public void testMethod() {
        List <PmsBrand> brandList = pmsBrandService.listAllBrand();
        log.info("testMethod:{}",brandList);
    }

}
