package ioc.bean_factory;

import ioc.bean_definition_registry.CustomBeanDefinitionRegistry;

/**
 * @author Zexho
 * @date 2021/7/31 1:11 下午
 */
public class ApplicationContext extends SimpleBeanFactory {

    public ApplicationContext(CustomBeanDefinitionRegistry registry) {
        super(registry);

        registry.loadBean();
    }

}