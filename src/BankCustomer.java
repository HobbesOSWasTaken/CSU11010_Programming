// Tutorial 12
public class BankCustomer {
    private int accountNumber;
    private String customerName;
    private String customerAddress;
    private String dateOfBirth;

    public void main(String[] args) {
        BankCustomer customer = new BankCustomer();
        customer.setAccountNumber(124812959);
        customer.setCustomerAddress("11 Burger Drive");
        customer.setCustomerName("Hill");
        customer.setDateOfBirth("28/8/2000");
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
