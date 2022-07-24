package fairfax.fire.admin.commands;

import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

import org.springframework.stereotype.Component;

@Component
@Command(
  name = "DeleteDatabase", 
  description = "Deletes the RDS database in AWS",
  mixinStandardHelpOptions = true
)
public class DeleteDatabase implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    System.out.println("--- Delete Database ---");
    return 0;
  }  
}
