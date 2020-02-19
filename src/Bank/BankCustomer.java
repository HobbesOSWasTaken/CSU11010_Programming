package Bank;

import java.util.ArrayList;

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

        BankCustomer customer2 = new BankCustomer();
        customer1.setAccountNumber(888856904);
        customer1.setCustomerAddress("41 Burger Drive");
        customer1.setCustomerName("Bill");
        customer1.setDateOfBirth("28/6/2000");

        BankCustomer[] customers = new BankCustomer[1];
        customers[0] = customer1;

        ArrayList<BankCustomer> customersArrayList = new ArrayList<BankCustomer>();
        customersArrayList.add(customer2);

    }

    public String findCustomer(int accountNumber, BankCustomer[] customers) {
        for(int index = 0; index < customers.length; index++) {
            if(customers[index].getAccountNumber() == accountNumber) {
                return customers[index].getCustomerName();
            }
        }
        return null;
    }

    public String findCustomer(String dob, String customerAddress, BankCustomer[] customers) {
        for(int index = 0; index < customers.length; index++) {
            if(customers[index].getDateOfBirth() == dob && customers[index].getCustomerAddress() == customerAddress) {
                return customers[index].getCustomerName();
            }
        }
        return null;
    }

    public String findCustomer(int accountNumber, ArrayList<BankCustomer> customers) {
        for(int index = 0; index < customers.size(); index++) {
            if(customers.get(index).getAccountNumber() == accountNumber) {
                return customers.get(index).getCustomerName();
            }
        }
        return null;
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
