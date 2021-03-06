package demo;

import cn.psychology.PsychologyApplication;
import cn.psychology.PsychologyApplicationTests;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = PsychologyApplication.class)
@WebAppConfiguration
@SpringBootTest
public class AbstractDefs
{
}