package ioc.test.circular_dependencies;

import ioc.bean_definition.Bean;
import ioc.bean_definition_registry.Autowired;

/**
 * @author Zexho
 * @date 2021/8/16 5:38 下午
 */
@Bean
public class ClassB {
    @Autowired
    public ClassA classA;

    public void print() {
        System.out.println("ClassB");
    }

    public void printA() {
        classA.print();
    }

}
