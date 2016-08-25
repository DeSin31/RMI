import java.rmi.Naming; 
public class BankServer 
{ 
public BankServer()
{
try
{
BankIntf b=new BankImpl();
Naming.rebind("rmi://localhost:1099/BankService",b);
}
catch(Exception e)
{
System.out.println("Error occured " +e);
}
}
public static void main(String [] args) 
{ 
new BankServer();
} 
}

