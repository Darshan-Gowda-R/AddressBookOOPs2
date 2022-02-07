package java_oops;
import java.util.*;


public class AddressUC4 {
	
	static List<Data3> AddressBook = new ArrayList<Data3>();
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
		
		
		Data3 data = new Data3(firstName,lastName,address,city,pincode,phoneNumber,eMail);
		
		AddressBook.add(data);
		
		
	}
	
	public static void display() {
		
		int index=0;
		for( Data3 data: AddressBook) {
			data=AddressBook.get(index);
			data.display(data);
			index++;
		}
		
	}
	
	
	
	public static void editContact() {
		
		String firstName;
		System.out.println("enter the first name of the person u want to edit ");
		firstName=sc.next();
		
		for(Data3 data : AddressBook ) {
			
			if(data.firstName.equals(firstName)) {
				System.out.println("Contact found Enter new Mobile Number : ");
				data.phoneNumber=sc.next();
				System.out.println("phone number succesfully changed to :"+data.phoneNumber);
			}
		}
		
	}

	
	
	public static void delete() {
		
		String firstName;
		System.out.println("enter the first name of the person u want to Delete ");
		firstName=sc.next();
		int index=0,flag=0;
		for(Data3 data : AddressBook ) {
			
			if(data.firstName.equals(firstName)) {
				flag=1;
				AddressBook.remove(index);
				System.out.println("The Data is Deleted Perminently : ");
				break;
			}
			index++;
		}
		if(flag==0)
			System.out.println("the first name is wrong or name doesnot exist : "+firstName);
		
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		
		int in=0;
		while(in != 5) {
		
			System.out.println("Menu : \n1) for adding data \n2) display \n3) edit phone Number \n4)Delete Full Data of a Person \n5) exit");
		
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
						break;
					case 4:
						delete();
				
				}
		}

		sc.close();
	
	}

}


class Data3{
	
	String firstName,lastName,address,city,pincode,phoneNumber,eMail;
	
	Data3(String firstName,String lastName,String address,String city,String pincode,String phoneNumber,String eMail){
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.pincode=pincode;
		this.phoneNumber=phoneNumber;
		this.eMail=eMail;
		
	}
	
	public void display(Data3 Data) {
		System.out.println("\n\n");
		if(Data == null) {
			System.out.println("The Adress Book is empty ");
			System.out.println("\n\n");
			return;
		}
		
		System.out.println("First Name : "+Data.firstName);
		System.out.println("Last Name : "+Data.lastName);
		System.out.println("Address : "+Data.address);
		System.out.println("City : "+Data.city);
		System.out.println("Enter Pincode : "+Data.pincode);
		System.out.println("Phone Number : "+Data.phoneNumber);
		System.out.println("Email ID : "+Data.eMail);
		System.out.println("\n\n");
		
		
		
	}
	
}
