import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		 System.out.println("Servlet Context is destroyed....");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("Servlet Context is initialized....");
	}

}
