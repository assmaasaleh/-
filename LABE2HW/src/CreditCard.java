public class CreditCard {
    private String customer;
    private String BANK;
    private String account;
    private int limit;
    private double balance;
    public CreditCard(String customer,String BANK,String account,int limit,double balance){
        this.customer=customer;
        this. BANK= BANK;
        this.account=account;
        this.limit=limit;
        this.balance=balance;

    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getBANK() {
        return BANK;
    }

    public void setBANK(String BANK) {
        this.BANK = BANK;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        System.out.println("john doe");
        System.out.println("bank of america");
        System.out.println("1234567899");
        System.out.println("customer");
        System.out.println("BANK");
        System.out.println("account");
    }
}
