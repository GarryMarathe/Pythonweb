package EvenModule;

/**
* EvenModule/EvenHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from EvenModule.idl
* Sunday, 28 April, 2024 10:38:16 PM IST
*/

public final class EvenHolder implements org.omg.CORBA.portable.Streamable
{
  public EvenModule.Even value = null;

  public EvenHolder ()
  {
  }

  public EvenHolder (EvenModule.Even initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = EvenModule.EvenHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    EvenModule.EvenHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return EvenModule.EvenHelper.type ();
  }

}
