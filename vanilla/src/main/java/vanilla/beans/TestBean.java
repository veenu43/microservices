package vanilla.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean implements InitializingBean, DisposableBean {


    public TestBean() {
        System.out.println("==========Constructore===============");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("===============Destroy Method===============");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===============afterPropertiesSet Method===============");
    }

    @PostConstruct
    public void customInit()
    {
        System.out.println("===============Method customInit() invoked...===============");
    }

    @PreDestroy
    public void customDestroy()
    {
        System.out.println("===============Method customDestroy() invoked...===============");
    }
}
