class Bank
{
    int bal;
    public Bank(int bal)
    {
        this.bal=bal;
    }
    public synchronized  void withdraw(int amount)
    {
        if(amount>bal){
            System.out.println("Insufficient Balance, waiting for deposit...");
            try{
                wait();
            }
            catch(InterruptedException e){}
        }
        bal-=amount;
        System.out.println("Withdrawn: "+amount);
        System.out.println("Balance after withdrawal: "+bal);
        System.out.println("-----------------------------");
    }
    public synchronized void deposit(int amount)
    {
        System.out.println("Going to deposite................");
        bal+=amount;
        notify();
        System.out.println("Deposited: "+amount);
        System.out.println("Balance after deposit: "+bal);
        System.out.println("-----------------------------");
    }
}

public class InterThreadComm {
    public static void main(String[] args) {
        Bank b=new Bank(1000);
        new Thread(){
            public void run()
            {
                b.withdraw(2500);
            }
        }.start();
        new Thread(){
            public void run()
            {
                b.deposit(500);
            }
        }.start();
        
    }
}
