package spring_aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService =
                annotationConfigApplicationContext.getBean(AwareService.class);
        awareService.outputResult();
        annotationConfigApplicationContext.close();
    }
}
