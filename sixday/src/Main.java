public class Main {
    public static void main(String[] args) {

        Account myaccount=new Account("983983","SHAIMA");
        Account another=new Account("4679287","reem",5000);

        myaccount.setBalance(300);
        myaccount.debit(400);

        myaccount.transferTo(another,100,myaccount);

        myaccount.toString();
        System.out.println(another.toString());

        Employee newemployee=new Employee("11233","shahad",231);

        System.out.println("your annual salary is: "+newemployee.getAnnualsalary());

        System.out.println("your salary after raise: "+ newemployee.raisedSalary(0.5));

        System.out.println(newemployee.toString());









    }
}