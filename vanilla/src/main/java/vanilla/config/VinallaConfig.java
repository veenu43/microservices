package vanilla.config;

import org.mapstruct.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import vanilla.beans.TestBean;
import vanilla.beans.TestBean2;

@Configuration
public class VinallaConfig {


    @Bean
    public TestBean getDemoBean() {
        System.out.println("==========getDemoBean===============");
        return new TestBean();
    }

    @Bean
    public TestBean2 getAnotherDemoBean(TestBean testBean) {
        System.out.println("==========getAnotherDemoBean===============");
        return new TestBean2(testBean);
    }

    @Bean
    public TestBean2 getAnotherDemoBean3() {
        System.out.println("==========getAnotherDemoBean 3===============");
        TestBean testBean = getDemoBean();
        return new TestBean2(testBean);
    }

    //@Bean
    //@Primary
    public TestBean getAnotherDemoBean2() {
        System.out.println("==========getAnotherDemoBean2===============");
        return getDemoBean();
    }

}
