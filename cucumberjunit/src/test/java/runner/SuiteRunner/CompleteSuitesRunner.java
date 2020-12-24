package runner.SuiteRunner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Suite01.class, Suite02.class, Suite03.class, Suite04.class })

public class CompleteSuitesRunner {

}
