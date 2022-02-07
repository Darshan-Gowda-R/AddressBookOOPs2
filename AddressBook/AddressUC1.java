package java_oops;
import java.util.*;

public class AddressUC1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName,lastName,address,city,pincode,phoneNumber,eMail;

		Scanner sc = new Scanner(System.in);
		
		List<Data> AddressBook = new ArrayList<Data>();
		
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

		System.out.println("First Name : "+firstName);
		System.out.println("Last Name : "+lastName);
		System.out.println("Address : "+address);
		System.out.println("City : "+city);
		System.out.println("Enter Pincode : "+pincode);
		System.out.println("Phone Number : "+phoneNumber);
		System.out.println("Email ID : "+eMail);
		
		sc.close();
	
	}

}


class Data{
	
	String firstName,lastName,address,city,pincode,phoneNumber,eMail;
	
	Data(String firstName,String lastName,String address,String city,String pincode,String phoneNumber,String eMail){
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.pincode=pincode;
		this.phoneNumber=phoneNumber;
		this.eMail=eMail;
		
	}
	
}
