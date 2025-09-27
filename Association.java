class DEPARTMENT
{
   String DEPTID;
   String DEPTNAME;
    
   DEPARTMENT(String id, String name) {
         this.DEPTID = id;
         this.DEPTNAME = name;
    } 
}
class EMPLOYEE
{
   String EMPID;
   String EMPNAME;
   DEPARTMENT dept;
    
   EMPLOYEE(String id, String name, DEPARTMENT d) {
         this.EMPID = id;
         this.EMPNAME = name;
         this.dept = d;
    } 
}
public class Association {
    public static void main(String[] args) {
      DEPARTMENT dept1 = new DEPARTMENT("D001", "Human Resources");
      EMPLOYEE emp1 = new EMPLOYEE("E001", "Alice", dept1);

System.out.println(emp1.dept.DEPTID);
        
    }
}
