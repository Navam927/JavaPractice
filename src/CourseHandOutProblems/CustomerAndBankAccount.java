package CourseHandOutProblems;

public class CustomerAndBankAccount {
    public static class Customer {
        private final int id;
        private final String name;
        private String email;
        private String phoneNumber;

        Customer(int id, String name, String email, String phoneNumber) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        int getId() {
            return id;
        }

        String getName() {
            return name;
        }

        String getEmail() {
            return email;
        }

        String getPhoneNumber() {
            return phoneNumber;
        }

        void setEmail(String email) {
            this.email = email;
        }

        void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        @Override
        public String toString() {
            return "Customer[id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
        }

    }

    public static class BankAccount {
        private int accountNumber;
        private double balance;
        private Customer customer;

        public BankAccount(int accountNumber, double balance, Customer customer) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customer = customer;
        }
        public int getAccountNumber() {
            return accountNumber;
        }

        public Customer getCustomer() {
            return customer;
        }

        public double getBalance() {
            return balance;
        }
        public void deposit(double amount) {
            if(amount <= 0) {
                System.out.println("Invalid amount");
                return;
            }
            balance += amount;
        }
        public void withdraw(double amount) {
            if(amount >= 0 && amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds or balance");
            }
        }
        @Override
        public String toString() {
            return "BankAccount[accountNumber="+accountNumber+", customer=Customer[id="+ customer.id+", name="+customer.name+", email="+customer.email+", phoneNumber="+customer.phoneNumber+"], balance="+balance+"]";
        }

    }

    public static void main(String[] args) {
        Customer cust1 = new Customer(1961,"Navam","navamsharma142@gmail.com","9041511476");
        BankAccount acc1 = new BankAccount(1000,500,cust1);
        System.out.println(acc1.getBalance());   // Output: 500.0
        acc1.deposit(200.00);
        System.out.println(acc1.getBalance());   // Output: 700.0
        acc1.withdraw(100.00);
        System.out.println(acc1.getBalance());   // Output: 600.0
        System.out.println(acc1.toString());
        cust1.setEmail("navam1961.be22@chitkara.edu.in");
        System.out.println(cust1.getEmail());
    }

}
