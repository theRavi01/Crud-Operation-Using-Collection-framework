import java.util.*;

class Employee {
private int empno;
private String empname;
private double salary;

Employee(int empno,String empname,double salary){
 this.empno=empno;
 this.empname=empname;
 this.salary=salary;
}

public int getEmpno(){
return empno;
}

public String  getEmpname(){
return empname;
}

public double getSalary(){
return salary;
}

public String toString(){
return empno+" "+empname+" "+salary;
}
}

class EmpManage {
public static void main(String args[]){
List<Employee> c = new ArrayList<Employee>();
Scanner s = new Scanner(System.in);
Scanner s1 = new Scanner(System.in);
Scanner s2 = new Scanner(System.in);
int ch;
do{
System.out.println("1 INSERT");
System.out.println("2 DISPLAY");
System.out.println("3 SEARCH");
System.out.println("4 DELETE");
System.out.println("5 UPDATE");
System.out.print("Enter your choice: ");
ch = s.nextInt();
switch(ch){
case 1:
System.out.print("Enter employee no: ");
int eno = s.nextInt();
System.out.print("Enter employee name: ");
String ename = s1.nextLine();
System.out.print("Enter employee salary: ");
double esalary = s2.nextDouble();
c.add(new Employee(eno,ename,esalary));
System.out.println("-----------------------");
System.out.println("Employee Inserted successfully");
System.out.println("-----------------------");
break;

case 2:
System.out.println("-----------------------");
Iterator<Employee> i = c.iterator();
while(i.hasNext()){
Employee e = i.next();
System.out.println(e);
}
System.out.println("-----------------------");
break;

case 3:
boolean search = false;
System.out.print("Enter employee no: ");
 eno = s.nextInt();
i = c.iterator();
while(i.hasNext()){
Employee e = i.next();
if(e.getEmpno()==eno){
search = true;
System.out.println("-----------------------");
System.out.println(e);
}
}
if(!search){
System.out.println("-----------------------");
System.out.println("Employee not found");
}
System.out.println("-----------------------");
break;

case 4:
search = false;
System.out.print("Enter Employee no which you want delete: ");
eno = s.nextInt();
i = c.iterator();
while(i.hasNext()){
Employee e = i.next();
if(e.getEmpno()==eno){
i.remove();
search = true;
}
}
if(!search){
System.out.println("-----------------------");
System.out.println("Employee not found");
}
else {
System.out.println("-----------------------");
System.out.println("Employee Deleted successfully ");
}
System.out.println("-----------------------");
break;

case 5:
search = false;
System.out.print("Enter Employee no which you want update : ");
eno = s.nextInt();
ListIterator<Employee> li = c.listIterator();
while(li.hasNext()){
Employee e = li.next();
if(e.getEmpno()==eno){
System.out.print("Enter employee name: ");
 ename = s1.nextLine();
System.out.print("Enter employee salary: ");
 esalary = s2.nextDouble();
li.set(new Employee(eno,ename,esalary));
search = true;
}
}
if(!search){
System.out.println("-----------------------");
System.out.println("Employee not found");
}
else {
System.out.println("Employee Updated successfully ");
}
System.out.println("-----------------------");
break;
}
}
while(ch!=0);
}
}





