 public interface BankIntf extends java.rmi.Remote
{ 
public int withdraw(int a,int amt)throws java.rmi.RemoteException; 
public int deposit(int b,int amt)throws java.rmi.RemoteException; 
public int balance(int amt)throws java.rmi.RemoteException; 
} 
