package peaksoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import peaksoft.entity.Company;
import peaksoft.service.CompanyService;

import java.util.List;
@Controller
@RequestMapping("/api/companies")
public class CompanyController {
    private final CompanyService companyService;

//    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @ModelAttribute("companyList")
    public List<Company> allCompanies(){
        return companyService.getAllCompanies();
    }
    @RequestMapping
    public String companyPage(){
        return "companyPage";
    }

//   @GetMapping("getCompany/{companyId}")
//   public String getCompanyById(@PathVariable("companyId") Long id, Model model){
//        model.addAttribute("company",companyService.getCompanyById(id));
//        return "/company/newPage";
//   }
//   @GetMapping("/save")
//   public String saveCompanyPage(Model model){
//        model.addAttribute("newCompany", new Company());
//        return "saveCompanyPage";
//   }
//
//   @PostMapping("/save")
//    public String saveCompany(Company company) {
//        companyService.saveCompany(company);
//        return "redirect:/api/companies";
//    }
}
