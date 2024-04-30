import EvenModule.Even;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;

class EvenServer{
	public static void main(String[] args){
		try{
			org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
			
			POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootPOA.the_POAManager().activate();
			
			EvenImpl even = new EvenImpl();
			org.omg.CORBA.Object ref = rootPOA.servant_to_reference(even);
			
			System.out.println("Step 1");
			Even h_ref = EvenModule.EvenHelper.narrow(ref);
			
			System.out.println("Step 2");
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			
			System.out.println("Step 3");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			
			String name = "Even";
			NameComponent path[] = ncRef.to_name(name);
			ncRef.rebind(path,h_ref);
			
			System.out.println("Even Odd Prime Server is reading and Waiting...");
			orb.run();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
