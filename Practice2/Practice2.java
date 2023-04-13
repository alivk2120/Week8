import java.util.*;
public class EmployeeOprations {
Scanner sc=new Scanner(System.in);
List<EmployeeDetails> employeeDetails=new ArrayList<>();

public void addEmployee(){
EmployeeDetails empdetails=new EmployeeDetails();
System.out.println("Enter Employee id ");
empdetails.setId(sc.nextInt());
System.out.println("Enter Employee name ");
empdetails.setName(sc.next());
System.out.println("Enter Employee Profession ");
empdetails.setProfession(sc.next());
System.out.println("Enter Employee Addreess ");
sc.nextLine();
empdetails.setAddress(sc.nextLine());
System.out.println("Enter Employee Salary ");
empdetails.setSalary(sc.nextDouble());
employeeDetails.add(empdetails);
}

public void removeEmployee(){
boolean removed=false;
System.out.println("Enter Employee id to remove");
int id=sc.nextInt();
for (EmployeeDetails emplDtls:employeeDetails) {
if(emplDtls.getId()==id){
employeeDetails.remove(emplDtls);
removed=true;
break;
}
}
if(removed==false){
System.out.println("Employee not found");
}
}

public void updateEmployee(){
boolean updated=false;
System.out.println("Enter Employee id to update salary");
int id=sc.nextInt();
for (EmployeeDetails emplDtls:employeeDetails) {
if(emplDtls.getId()==id){
System.out.println("Enter salary");
emplDtls.setSalary(sc.nextDouble());
updated=true;
try {
searchEmployee(id);
} catch (NameNotFoundException e) {
throw new RuntimeException(e);
}
break;
}
}
if(updated){
System.out.println("Employee not found");
}
}

public void searchEmployee(int id) throws NameNotFoundException{
boolean got=false;
for (EmployeeDetails emplDtls:employeeDetails) {
if(emplDtls.getId()==id) {
System.out.println("id : " + emplDtls.getId());
System.out.println("name : " + emplDtls.getName());
System.out.println("Profession : " + emplDtls.getProfession());
System.out.println("address : " + emplDtls.getAddress());
System.out.println("salary : " + emplDtls.getSalary());
got=true;
break;
}
}if(got==false){
throw new NameNotFoundException("Employee not found");
}
}
}