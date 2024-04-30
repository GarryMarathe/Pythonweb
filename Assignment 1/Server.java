import java.rmi.*;

public class Server{
	public static void main(String[] args){
		try{
			ServerImpl serverimpl = new ServerImpl();
			Naming.rebind("Server", serverimpl);
			System.out.println("Server Started...");
		}catch(Exception e){
			System.out.println("An Exception Occurred " + e.getMessage());
		}
	}
}
