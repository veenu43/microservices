package vanilla.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TestBean2 implements InitializingBean, DisposableBean {

    TestBean testBean;

    public TestBean2(TestBean testBean) {
        System.out.println("==========Constructor 2===============");
        this.testBean = testBean;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("===============Destroy Method 2===============");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("===============afterPropertiesSet Method 2===============");
    }

    @PostConstruct
    public void customInit()
    {
        System.out.println("===============Method customInit() invoked...2===============");
    }

    @PreDestroy
    public void customDestroy()
    {
        System.out.println("===============Method customDestroy() invoked...2===============");
    }
}
