import java.io.*; 
import java.rmi.*; 
public class BankClient 
{ 
public static void main(String args[]) 
{ 
int a; 
try 
{ 
BankIntf bankintf=(BankIntf)Naming.lookup("rmi://localhost/BankService"); 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("\nEnter the UserName:"); 
String name=br.readLine(); 
System.out.println("\nEnter the Account Number:"); 
int acc=Integer.parseInt(br.readLine()); 
System.out.println("\nEnter the Initial Amount:"); 
int amt=Integer.parseInt(br.readLine()); 
do 
{ 
System.out.println("\n\t1.Withdraw\n\t2.Deposit\n\t3.Balance\n\t4.Exit");	
System.out.println("\nEnter your choice:"); 
a=Integer.parseInt(br.readLine()); 
switch(a) 
{ 
case 1: 
System.out.println("\nEnter amount of Withdraw:"); 
int wd=Integer.parseInt(br.readLine()); 
System.out.println("\nUserName:"+name); 
System.out.println("Account Number:"+acc); 
if(wd>amt) 
System.out.println("Balance less unable to proceed withdraw"); 
else 
{ 
amt=bankintf.withdraw(wd,amt); 
System.out.println("Balance:"+amt); 
} 
break; 
case 2: 
System.out.println("\nEnter amount of deposit:"); 
int dp=Integer.parseInt(br.readLine()); 
System.out.println("\nUserName:"+name); 
System.out.println("Account Number:"+acc); 
amt=bankintf.deposit(dp,amt); 
System.out.println("Balance:"+amt); 
break; 
case 3: 
System.out.println("\nUserName:"+name); 
System.out.println("Account Number:"+acc); 
amt=bankintf.balance(amt); 
System.out.println("Balance:"+amt); 
break; 
} 
}while(ch<4); 
} 
catch(Exception e) 
{ 
System.out.println("Exception :"+e); 
} 
} 
} 