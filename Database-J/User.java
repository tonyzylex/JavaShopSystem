public class User {
    String name;
    private String Password;
    private int Balance = 1500;

    User(String name, String Password) {
        this.name = name;
        this.Password = Password;
    }

    public String GetPassword(){
        return Password;
    }

    public int GetBalance(){
        return Balance;
    }

    public void Transaction(int price,int salary) {
        if (price <= Balance) {
            Balance -= price;
            System.out.println("Transaction successful! New balance: " + Balance);
        } else {
            System.out.println("Insufficient balance for this transaction.");
        }
        if (salary > 0) {
            Balance += salary;
            System.out.println("Salary added! New balance: " + Balance);
        }
    }
}
