package fairfax.fire.admin.commands;

import org.springframework.stereotype.Component;

import picocli.CommandLine.Command;
import java.util.concurrent.Callable;

@Component
@Command(
  name = "Fairfax County Fire Admin Tool", 
  description = "A CLI for executing administration tasks",
  subcommands = { 
    CreateDatabase.class,
    DeleteDatabase.class,
    LoadDatabaseData.class,
    DeleteDatabaseData.class
  },
  mixinStandardHelpOptions = true
)
public class FireAdminCommand implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    return 0;
  }
}
