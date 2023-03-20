package seedu.duke.company;

import seedu.duke.exception.InputMismatchException;

public class Company {
    private String companyName;
    private int contactNumber;
    private String contactEmail;

    public Company(String companyName, int contactNumber, String contactEmail){
        this.companyName = companyName;
        this.contactNumber = contactNumber;
        this.contactEmail = contactEmail;
    }

    public String getCompanyName(){
        return companyName;
    }

    public int getContactNumber(){
        return contactNumber;
    }

    public String getContactEmail(){
        return contactEmail;
    }

    @Override
    public String toString() {
        return "Company name: " + companyName + "\nCompany contact number: " + contactNumber +
                "\nCompany contact email: "  + contactEmail;
    }
}
