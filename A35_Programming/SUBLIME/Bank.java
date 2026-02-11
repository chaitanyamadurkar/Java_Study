import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;
class Bank{
	static String name;
	static String address;
	static long contact;
	static long adhar;
	static String pancard;
	static double balence;
	static int pin;
	static LocalDateTime a; 
	static ArrayList<String> transcation = new ArrayList<String>(); // 
	public static void main(String[] args) {         // main method
	Scanner sc = new Scanner(System.in);
	welcomeLoop:                                    
	for (; ; ) {                                         // welcome loop starts here (infinite)
		System.out.println("\n            **** WELCOME ****           ");
		System.out.println("           *-* LAXMI CHIT FUND *-*        ");
		System.out.println("1. Create new account \n2. Login ");   // options to pick
		System.out.println("Enter your Responce : ");
		int resp = sc.nextInt();

		switch(resp)                                                // Switch starts here
		{
			case 1: {                                              // case 1 execution
				if (name != null) {
					System.out.println("Account already exist!");
					continue;
				}
				System.out.println("account creation page");
				System.out.println("Name : ");
				name = new Scanner(System.in).nextLine();
				System.out.println("Address : ");
				address = new Scanner(System.in).nextLine();
				System.out.println("Contact No. : ");
				contact = new Scanner(System.in).nextLong();
				System.out.println("AADHAR : ");
				adhar = new Scanner(System.in).nextLong();
				System.out.println("PanCard : ");
				pancard = new Scanner(System.in).nextLine();
				System.out.println("Enter the amount : ");
				balence = new Scanner(System.in).nextDouble();
				a = LocalDateTime.now();
				transcation.add("DEPOSITE (Creation):"+balence +"rs.  "+ (a.getHour())%12+ ":"+a.getMinute()+":"+a.getSecond());
				System.out.println("pin : ");
				pin = new Scanner(System.in).nextInt();
				System.out.println("\n ** ACCOUNT CREATED SUCCSESFULLY **");
				break;
		    } // case 1 end here
			case 2: {                                               // case 2 starts
				if (name == null) {
					System.out.println("CREATE YOUR ACCOUNT FIRST!\n");
					continue;	
				}
				System.out.println("Login Module");
				System.out.println("Enter your Contact no. : ");
				long userCont = new Scanner(System.in).nextLong();
				System.out.println("enter the pin : ");
				int userPin = new Scanner(System.in).nextInt();

				if (contact==userCont && pin ==userPin) {
					System.out.println("Accounnt Login Succesfull\n");

					features:
					for (; ; ) {
						System.out.println("** FEATURE MODULE **");
						System.out.println("1.DIPOSITE \n2.WITHDROW \n3.CHECK BALENCE \n4.TRANSCATION \n5.UPDATE ACCOUNT \n6.LOGOUT");
						System.out.println("enter your option : ");
						int opt = sc.nextInt();

						switch(opt)                        // inner switch of case 2
						{
							case 1:{
								System.out.println("\n DEPOSITE ACOUNT MODULE");
								System.out.println("Enter the amount : ");
								double dept = new Scanner(System.in).nextDouble();
								balence += dept;
								a = LocalDateTime.now();
				                transcation.add("DEPOSITE :"+dept +"rs.  "+ (a.getHour())%12+ ":"+a.getMinute()+":"+a.getSecond());
								System.out.println("\n AMOUNT IS DEBITED SUCCESFULLY");
								break;
						    }
							case 2:{
								System.out.println("\n WITHDROW AMOUNT MODULE");
								System.out.println("Enter the amount :");
								double wdramt = new Scanner(System.in).nextDouble();
								System.out.println("Enter the pin");
								int pin2 = new Scanner(System.in).nextInt();
								if (pin == pin2) {
									if (wdramt<= balence) {
										balence -= wdramt;
										a = LocalDateTime.now();
				                        transcation.add("WITHDROW:"+wdramt +"rs.  "+ (a.getHour())%12 + ":"+a.getMinute()+":"+a.getSecond());
										System.out.println("AMOUNT DEBITED SUCCESFULLY");		
									}
									else{
										System.out.println("INSUFFICIANT BALENCE");
									}
									}
									else{
										System.out.println("INVALID PIN");
									}

								break;
							}//c2 end
						    case 3:{
						    	System.out.println("CHECK BALENCE MODULE");
						    	System.out.println("Enter the pin: ");
						    	int pin2 = new Scanner(System.in).nextInt();
						    	if (pin == pin2) {
						    		System.out.println("your balence is :"+ balence);	
						    	}
						    	else{
						    		System.out.println("INVALID PIN ENTERD!");
						    	}
						    	
						    	break;
						    }
						    case 4:{
						    	System.out.println("** TRANSCATION **");
						    	for (String ele : transcation ) {
						    		System.out.println(ele);	
						    	}
						    	System.out.println( );
						    	break;
						    }	
						    case 5:{
						    	System.out.println("Enter the pin :");
						    	int pin2 = sc.nextInt();
						    	if(pin2 == pin){
						    		System.out.println("What you want to update?");
						    		System.out.println("1.update name \n2.update address \n3.update contact  \n4.update pin");
						    		int upres = sc.nextInt();
						    		switch(upres){                    //switch block start
						    		    case 1:{
						    		    	System.out.println("enter new name:");
						    		    	String name2 = new Scanner(System.in).nextLine();
						    		    	name = name2;
						    		    	System.out.println("updated successfully");
						    		    	break;

						    		}  
						    	        case 2:{
						    	        	System.out.println("enter new address:");
						    		    	String address2 = new Scanner(System.in).nextLine();
						    		    	address = address2 ;
						    		    	System.out.println("updated successfully");
						    		    	break;

						    	    }
						    	        case 3:{
						    	        	System.out.println("enter new contact:");
						    		    	long contact2 = new Scanner(System.in).nextLong();
						    		    	contact = contact2;
						    		    	System.out.println("updated successfully");
						    		    	break;
						    	    }
						    	    	case 4:{
						    	    		System.out.println("enter new pin:");
						    		    	int pin3 = new Scanner(System.in).nextInt();
						    		    	System.out.println("conform the pin:");
						    		    	int pin4 = new Scanner(System.in).nextInt();
						    		    	if(pin3 ==pin4){
						    		    		pin = pin4;
						    		    		System.out.println("updated successfully");
						    		    	}
						    		    	break;
						    		    	
						    	    }

						    		}                   // switch block ends

						    	}// if block close
						    	break;
						    }
						    	
						    case 6:{
						    	System.out.println("Thank You ! Visit Again");
						    	continue welcomeLoop;
						    }
						    default:{
						    	System.out.println("INVALID RESPONSE!");
						    	break;

						    }
						}// swith close block
					}// for close 
				} //if close
					else{
		            System.out.println("INVALID CRED");
					}
		            break;	
			}//main case 2 /
	                
	                default:{

                 	System.out.println("INVALID RESPONCE");
                 		break;
		            }

	            } //switch resp end here
		
	      }
    }
}