package eventus.companylist;

import eventus.company.Company;

import java.util.ArrayList;

public class CompanyList {

    ArrayList<Company> companies = new ArrayList<>();

    /**
     * Deletes Company information at the specified index in the ArrayList of companies
     * @param index in ArrayList to be deleted
     */
    public void deleteCompanyInformation(int index) {
        companies.remove(index);
    }
}
