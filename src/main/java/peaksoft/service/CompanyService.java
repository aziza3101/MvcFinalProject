package peaksoft.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import peaksoft.entity.Company;

import java.util.List;
@Service
public interface CompanyService {
    void saveCompany(Company company);
    List<Company> getAllCompanies();
    Company getCompanyById(Long id);
    void updateCompany(Long id,Company company);
    void deleteCompanyById(Long id);

}
