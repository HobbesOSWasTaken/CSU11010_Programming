// Tutorial 12
public class BankCustomer {
    private int accountNumber;
    private String customerName;
    private String customerAddress;
    private String dateOfBirth;

    public void main(String[] args) {
        BankCustomer customer1 = new BankCustomer();
        customer1.setAccountNumber(124812959);
        customer1.setCustomerAddress("11 Burger Drive");
        customer1.setCustomerName("Hill");
        customer1.setDateOfBirth("28/8/2000");

        BankCustomer[] customers = new BankCustomer[1];
        customers[0] = customer1;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
