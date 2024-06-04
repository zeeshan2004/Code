package emailapp;
import java.util.*;

public class Email {

        private String firstName;
        private String lastName;
        private String password;
        private String department;
        private String mailboxCapacity;
        private  String  alternateEmail;

        // Making Constructor
        public Email (String firstName,String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
            System.out.println("Email CREATED: "+this.firstName + " " + this.lastName);


        this.department = setDepartment();
            System.out.println("Department:"+this.department);

        }
private String setDepartment(){
    System.out.println("Department Codes \n1 for Sales \n2 Development  \n3 for Accounting\n0 for none\n Enter department code:");
Scanner sc = new Scanner(System.in);
int depChoice  = sc.nextInt();
if(depChoice == 1){return "sales";}
    else if(depChoice == 2){return "dev";}
    else if(depChoice == 3){return "acct";}
else {return "";}
        }

    }



