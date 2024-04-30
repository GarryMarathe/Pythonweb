package CalculatorModule;


/**
* CalculatorModule/CalculatorPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CalculatorModule.idl
* Sunday, 28 April, 2024 9:54:46 PM IST
*/

public abstract class CalculatorPOA extends org.omg.PortableServer.Servant
 implements CalculatorModule.CalculatorOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("addition", new java.lang.Integer (0));
    _methods.put ("subtraction", new java.lang.Integer (1));
    _methods.put ("multiplication", new java.lang.Integer (2));
    _methods.put ("division", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // CalculatorModule/Calculator/addition
       {
         double num1 = in.read_double ();
         double num2 = in.read_double ();
         double $result = (double)0;
         $result = this.addition (num1, num2);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 1:  // CalculatorModule/Calculator/subtraction
       {
         double num1 = in.read_double ();
         double num2 = in.read_double ();
         double $result = (double)0;
         $result = this.subtraction (num1, num2);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 2:  // CalculatorModule/Calculator/multiplication
       {
         double num1 = in.read_double ();
         double num2 = in.read_double ();
         double $result = (double)0;
         $result = this.multiplication (num1, num2);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       case 3:  // CalculatorModule/Calculator/division
       {
         double num1 = in.read_double ();
         double num2 = in.read_double ();
         double $result = (double)0;
         $result = this.division (num1, num2);
         out = $rh.createReply();
         out.write_double ($result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CalculatorModule/Calculator:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Calculator _this() 
  {
    return CalculatorHelper.narrow(
    super._this_object());
  }

  public Calculator _this(org.omg.CORBA.ORB orb) 
  {
    return CalculatorHelper.narrow(
    super._this_object(orb));
  }


} // class CalculatorPOA