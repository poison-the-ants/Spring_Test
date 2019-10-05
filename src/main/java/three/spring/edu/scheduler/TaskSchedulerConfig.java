package three.spring.edu.scheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("three.spring.edu.scheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
