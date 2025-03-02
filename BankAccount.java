

class BankAccount
{
    static String bankName;
    static float interestRate;

    public BankAccount()
    {
    }
    public BankAccount(String Name,Float Rate) {
        bankName=Name;
        interestRate=Rate;
    }

    static void setBankName(String Name)
    {
        BankAccount.bankName=Name;
    }

    static String getBankName()
    {
        return bankName;
    }

    static void setInterestRate(float rate)
    {
        BankAccount.interestRate=rate;
    }

    static float getInterestRate()
    {
        return interestRate;
    }

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        BankAccount A1=new BankAccount("AXIS Bank",12.5f);
        BankAccount A2=new BankAccount("SBI Bank",7.5f);
        BankAccount A3=new BankAccount("BOI Bank",0f);
        BankAccount A4=new BankAccount("HDFC Bank",10.5f);

        System.out.println("Bank A1 name: "+A1.getBankName());
        System.out.println("Interest rate of A1: "+A1.getInterestRate());
        System.out.println("\nBank A1 name: "+A2.getBankName());
        System.out.println("Interest rate of A1: "+A2.getInterestRate());
        System.out.println("\nBank A1 name: "+A3.getBankName());
        System.out.println("Interest rate of A1: "+A3.getInterestRate());
        System.out.println("\nBank A1 name: "+A4.getBankName());
        System.out.println("Interest rate of A1: "+A4.getInterestRate()+"\n");
    }

}
