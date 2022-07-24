package fairfax.fire.admin.commands;

import org.springframework.stereotype.Component;

import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Component
@Command(
  name = "CreateDatabase", 
  description = "Creates the RDS database in AWS",
  mixinStandardHelpOptions = true
)
public class CreateDatabase implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    System.out.println("--- Creating Database ---");
    return 0;
  }
}
