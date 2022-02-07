

package java_oops;
import java.util.*;

public class AddressUC3 {
	
	static List<Data2> AddressBook = new ArrayList<Data2>();
	static Scanner sc = new Scanner(System.in);
	
	public static void add() {
		
		String firstName,lastName,address,city,pincode,phoneNumber,eMail;
		
		
		System.out.println("Enter First Name");
		firstName=sc.next();
		System.out.println("Enter Last Name");
		lastName=sc.next();
		System.out.println("Enter Address ");
		address=sc.next();
		System.out.println("Enter City you Live");
		city=sc.next();
		System.out.println("Enter Pincode of the City");
		pincode=sc.next();
		System.out.println("Enter Phone Number");
		phoneNumber=sc.next();
		System.out.println("Enter Email Id");
		eMail=sc.next();
		
		
		Data2 data = new Data2(firstName,lastName,address,city,pincode,phoneNumber,eMail);
		
		AddressBook.add(data);
		
		
	}
	
	public static void display() {
		
		Data2 data;
		data=AddressBook.get(0);
		data.display(data);
		
	}
	
	
	
	public static void editContact() {
		
		String firstName;
		System.out.println("enter the first name of the person u want to edit ");
		firstName=sc.next();
		
		for(Data2 data : AddressBook ) {
			
			if(data.firstName.equals(firstName)) {
				System.out.println("Contact found Enter new Mobile Number : ");
				data.phoneNumber=sc.next();
				System.out.println("phone number succesfully changed to :"+data.phoneNumber);
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		int in=0;
		while(in != 4) {
		
			System.out.println("Menu : \n1) for adding data \n2) display \n3) edit phone Number \n4) exit");
		
			in=sc.nextInt();
		
				switch(in) {
				
					case 1:
						add();
						break;
					
					case 2:
						display();
						break;
					
					case 3:
						editContact();
				
				}
		}

		sc.close();
	
	}

}


class Data2{
	
	String firstName,lastName,address,city,pincode,phoneNumber,eMail;
	
	Data2(String firstName,String lastName,String address,String city,String pincode,String phoneNumber,String eMail){
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.pincode=pincode;
		this.phoneNumber=phoneNumber;
		this.eMail=eMail;
		
	}
	
	public void display(Data2 Data) {
		

		System.out.println("First Name : "+Data.firstName);
		System.out.println("Last Name : "+Data.lastName);
		System.out.println("Address : "+Data.address);
		System.out.println("City : "+Data.city);
		System.out.println("Enter Pincode : "+Data.pincode);
		System.out.println("Phone Number : "+Data.phoneNumber);
		System.out.println("Email ID : "+Data.eMail);
		
		
	}
	
}
