public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount){
        balance+=amount;

        return balance;
    }
     public int debit(int amount){
        if(balance<amount){
            System.out.println("inefficients amount");
        }else balance-=amount;

        return balance;

     }

     public int transferTo(Account another,int amount,Account myaccount){
        if(myaccount.balance>=amount){
            myaccount.balance-=amount;
            another.balance+=amount;
            System.out.println("the amount "+amount+" has been transfer successfully your new balance is: "+balance);

        }else  System.out.println("inefficients amount");
        return balance;

     }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
