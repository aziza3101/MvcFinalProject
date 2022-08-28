package peaksoft.repository;

import org.springframework.stereotype.Repository;
import peaksoft.entity.Company;

import java.util.List;
@Repository
public interface CompanyRepository {
    void saveCompany(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    void deleteCompanyById(Long id);
    void updateCompany(Company company);
}
