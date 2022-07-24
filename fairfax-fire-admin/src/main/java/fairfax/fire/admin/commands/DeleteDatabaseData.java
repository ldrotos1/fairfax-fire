package fairfax.fire.admin.commands;

import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

import org.springframework.stereotype.Component;

@Component
@Command(
  name = "DeleteDatabaseData", 
  description = "Deletes data in the RDS database in AWS",
  mixinStandardHelpOptions = true
)
public class DeleteDatabaseData implements Callable<Integer>  {

  @Override
  public Integer call() throws Exception {
    System.out.println("--- Delete Database Data ---");
    return 0;
  }  
}