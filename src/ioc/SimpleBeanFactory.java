package ioc;

/**
 * @author Zexho
 * @date 2021/7/31 11:18 上午
 */
public class SimpleBeanFactory implements BeanFactory {

    protected final BeanDefinitionRegistry registry;

    public SimpleBeanFactory(BeanDefinitionRegistry registry) {
        this.registry = registry;
    }

    @Override
    public BeanDefinition getBeanInstance(String beanName) {
        return this.registry.getBeanDefinition(beanName);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getBeanInstance(String beanName, Class<T> requiredType) {
        BeanDefinition beanDefinition = this.registry.getBeanDefinition(beanName, requiredType);
        return (T) beanDefinition.getBeanInstance();
    }
}
