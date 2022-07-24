package fairfax.fire.admin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fairfax.fire.admin.commands.FireAdminCommand;
import picocli.CommandLine;
import picocli.CommandLine.IFactory;

@SpringBootApplication
public class AdminApplication implements CommandLineRunner, ExitCodeGenerator  {

	private IFactory factory;        
	private FireAdminCommand fireAdminCommand; 
	private int exitCode;

	AdminApplication(IFactory factory, FireAdminCommand fireAdminCommand) {
		this.factory = factory;
		this.fireAdminCommand = fireAdminCommand;
	}

	@Override
	public int getExitCode() {
			return exitCode;
	}

	@Override
	public void run(String... args) throws Exception {
		exitCode = new CommandLine(fireAdminCommand, factory).execute(args);
	}

	public static void main(String[] args) {
		System.exit(SpringApplication.exit(SpringApplication.run(AdminApplication.class, args)));
	}
}