

package java_oops;
import java.util.*;

public class AddressUC2 {
	
	static List<Data1> AddressBook = new ArrayList<Data1>();
	
	
	public static void Add() {
		
		String firstName,lastName,address,city,pincode,phoneNumber,eMail;
		
		Scanner sc = new Scanner(System.in);
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
		
		
		Data1 data = new Data1(firstName,lastName,address,city,pincode,phoneNumber,eMail);
		
		AddressBook.add(data);
		
		
	}
	
	public static void Display() {
		
		Data1 data;
		data=AddressBook.get(0);
		data.display(data);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		int in=0;
		while(in != 3) {
		
			System.out.println("Menu : \n1) for adding data \n2) display \n3) exit");
		
			in=sc.nextInt();
		
				switch(in) {
				
					case 1:
						Add();
						break;
					
					case 2:
						Display();
						break;
				}
		}

		sc.close();
	
	}

}


class Data1{
	
	String firstName,lastName,address,city,pincode,phoneNumber,eMail;
	
	Data1(String firstName,String lastName,String address,String city,String pincode,String phoneNumber,String eMail){
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.pincode=pincode;
		this.phoneNumber=phoneNumber;
		this.eMail=eMail;
		
	}
	
	public void display(Data1 Data) {
		

		System.out.println("First Name : "+Data.firstName);
		System.out.println("Last Name : "+Data.lastName);
		System.out.println("Address : "+Data.address);
		System.out.println("City : "+Data.city);
		System.out.println("Enter Pincode : "+Data.pincode);
		System.out.println("Phone Number : "+Data.phoneNumber);
		System.out.println("Email ID : "+Data.eMail);
		
		
	}
	
}
