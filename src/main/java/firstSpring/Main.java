package firstSpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by deft on 19.10.2016.
 */
public class Main {
    public static void main(String []args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
        LabRat rat = (LabRat) ac.getBean("rat");
        LabRat rat2 = (LabRat) ac.getBean("rat2");
        rat.sayHi();
        System.out.println(rat.getName());
        rat2.sayHi();
        System.out.println(rat2.getName());

    }
}
