public class Account {
    private String number;
    private String name;
    private String email;
    private double balance;
    private String phoneNumber;
    public Account(String number, String name, String email, String phoneNumber, double balance){
        this.balance = balance;
        this.email = email;
        this.name = name;
        this.number = number;
        this.phoneNumber = phoneNumber;
    }
    public Account(){

    }

    public double getBalance() {
        return balance;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getNumber() {
        return number;
    }
    public void depositMoney(double depositMoney){

        this.balance += depositMoney;
        System.out.println("Deposit is Successful\n" + "Balance: " + balance);

    }
    public void withdrawMoney(double withdrawMoney){

        if(this.balance - withdrawMoney < 0 ){
            System.out.println("Insufficient Balance\n" + "Balance:" + balance);
        }else{
        this.balance -= withdrawMoney;
        System.out.println("Withdraw is Successful\n" + "Remaining Balance: " + balance);

        }
    }
}

