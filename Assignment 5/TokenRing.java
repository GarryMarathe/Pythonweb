import java.util.*;

public class TokenRing{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter the number of nodes you want to form a ring: ");
			int n = sc.nextInt();
			
			System.out.println("Followin Ring is Formed: ");
			for(int i=0;i<n;i++)
				System.out.print(i + " ");
			System.out.println("0");
			int token = 0;
			int choice = 0;
			do{
				System.out.println("Enter Sender: ");
				int sender = sc.nextInt();
				
				System.out.println("Enter Receiver: ");
				int receiver = sc.nextInt();
				
				System.out.println("Enter Data to be Sent: ");
				int data = sc.nextInt();
				
				System.out.println("Token Passing: ");
				for(int i=token;i!=sender;i=(i + 1)%n){
					System.out.print(" " + i + "->");
				}
				System.out.println(" " + sender);
				System.out.println("Sender " + sender + " Sending data: " + data);
				for(int i=sender;i!=receiver;i=(i + 1)%n){
					System.out.println("Data: " + data +" Forwarded by: " + i);
				}
				System.out.println("Receiver: " + receiver + " Received the data: " + data);
				token = sender;
				System.out.println("Do you want send data again? If yes Press 1, If no Press 0");
				choice = sc.nextInt();
			}while(choice ==1);
		}catch(Exception e){
			System.out.println("An Exception Occurred");
		}
	}
}
