package fairfax.fire.admin.commands;

import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

import org.springframework.stereotype.Component;

@Component
@Command(
  name = "LoadDatabaseData", 
  description = "Loads data into the RDS database in AWS",
  mixinStandardHelpOptions = true
)
public class LoadDatabaseData implements Callable<Integer>  {

  @Override
  public Integer call() throws Exception {
    System.out.println("--- Load Database Data ---");
    return 0;
  }  
}
