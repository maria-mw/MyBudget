package com.javaProjects.myBudget.controller;

import com.javaProjects.myBudget.entity.*;
import com.javaProjects.myBudget.repository.StatusRepository;
import com.javaProjects.myBudget.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MyBudgetController {

    @Autowired
    private CategoryRepositoryService categoryRepositoryService;
    @Autowired
    private SubCategoryRepositoryService subCategoryRepositoryService;
    @Autowired
    private TypeRepositoryService typeRepositoryService;
    @Autowired
    private CurrencyRepositoryService currencyRepositoryService;
    @Autowired
    private StatusRepositoryService statusRepositoryService;
    @Autowired
    private TransactionRepositoryService transactionRepositoryService;
    @Autowired
    private StatusRepository statusRepository;

    private Integer statusId;

    @GetMapping({"/","/start","/index"})    //Goto index Page.
    public String view(){
        return "index";
    }

    @GetMapping("/transactionForm")      //Goto Transaction Form Page.
    public String transactionForm(Transaction transaction, Model model){
        List<Currency> currencyList = currencyRepositoryService.findAll();
        model.addAttribute("currencyList", currencyList);
        List<SubCategory> subCategoryList = subCategoryRepositoryService.findAll();
        model.addAttribute("subCategoryList", subCategoryList);
        List<Status> statusList = statusRepositoryService.findAll();
        model.addAttribute("statusList", statusList);
        return "transactionFormPage";
    }

    @PostMapping("/addTransaction")
    public String saveTransaction(Transaction transaction, Model model) {
        transactionRepositoryService.save(transaction);
        model.addAttribute("message","Record insert successfully...");
        return "index";
    }

    @GetMapping("/listTransactions")
    public String listTransactions(Model model) {
        List<Transaction> list = transactionRepositoryService.findAll();
        model.addAttribute("data",list);
        return "listTransactionsPage";
    }

    @GetMapping("/categoryForm")      //Goto Category Form Page.
    public String categoryForm(Category category, Model model){
        List<Type> typeList = typeRepositoryService.findAll();
        model.addAttribute("typeList", typeList);
        return "categoryFormPage";
    }

    @PostMapping("/addCategory")
    public String saveCurrency (Category category, Model model) {
        categoryRepositoryService.save(category);
        model.addAttribute("message","Record insert successfully...");
        return "index";
    }

    @GetMapping("/listCategories")
    public String listCategories(Model model) {
        List<Category> list = categoryRepositoryService.findAll();
        model.addAttribute("data",list);
        return "listCategoriesPage";
    }

    @GetMapping("/subCategoryForm")      //Goto SubCategory Form Page.
    public String subCategoryForm(SubCategory subCategory, Model model){
        List<Category> categoryList = categoryRepositoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        return "subCategoryFormPage";
    }

    @PostMapping("/addSubCategory")
    public String saveCurrency (SubCategory subCategory, Model model) {
        subCategoryRepositoryService.save(subCategory);
        model.addAttribute("message","Record insert successfully...");
        return "index";
    }

    @GetMapping("/listSubCategories")
    public String listSubCategories(Model model) {
        List<SubCategory> list = subCategoryRepositoryService.findAll();
        model.addAttribute("data",list);
        return "listSubCategoriesPage";
    }
    @GetMapping("/statusForm")      //Goto Status Form Page.
    public String statusForm(Status status){
        return "statusFormPage";
    }

    @PostMapping("/addStatus")
    public String saveStatus (Status status, Model model) {
        statusRepositoryService.save(status);
        model.addAttribute("message","Record insert successfully...");
        return "index";
    }

    @GetMapping("/listStatuses")
    public String listStatuses(Model model) {
        List<Status> list = statusRepositoryService.findAll();
        model.addAttribute("data",list);
        return "listStatusesPage";
    }
    @GetMapping("/typeForm")      //Goto Type Form Page.
    public String typeForm(Type type){
        return "typeFormPage";
    }

    @PostMapping("/addSType")
    public String saveType (Type type, Model model) {
        typeRepositoryService.save(type);
        model.addAttribute("message","Record insert successfully...");
        return "index";
    }

    @GetMapping("/listTypes")
    public String listTypes(Model model) {
        List<Type> list = typeRepositoryService.findAll();
        model.addAttribute("data",list);
        return "listTypesPage";
    }

    @GetMapping("/currencyForm")      //Goto Currency Form Page.
    public String view2(Currency currency){
        return "currencyFormPage";
    }

    @PostMapping("/addCurrency")
    public String saveCurrency (Currency currency, Model model) {
        currencyRepositoryService.save(currency);
        model.addAttribute("message","Record insert successfully...");
        return "index";
    }

    @GetMapping("/listCurrencies")
    public String listCurrencies(Model model) {
        List<Currency> list = currencyRepositoryService.findAll();
        model.addAttribute("data",list);
        return "listCurrenciesPage";
    }

    @GetMapping("/transactionsFilter")
    public String allTransactionsListSort(Model model){
        statusId = -1;
        List<Status> statusList = statusRepositoryService.findAll();
        model.addAttribute("statusList", statusList);
        List<Category> categoryList = categoryRepositoryService.findAll();
        model.addAttribute("categoryList", categoryList);
        List<Type> typeList = typeRepositoryService.findAll();
        model.addAttribute("typeList", typeList);
        List<SubCategory> subCategoryList = subCategoryRepositoryService.findAll();
        model.addAttribute("subCategoryList", subCategoryList);
        List<Transaction> list = transactionRepositoryService.findAll();
        model.addAttribute("transactions",list);
        model.addAttribute("sum", transactionRepositoryService.transactionsSum(list));
        return "transactionsFilter";
    }

    @PostMapping("/chooseStatus")
    public String chooseStatus(@RequestParam String status, Model model){
        statusId = Integer.parseInt(status);
        List<Transaction> transactions = transactionRepositoryService.filterTransactionsByStatus(statusId);
        model.addAttribute("statusList", statusRepositoryService.getById(statusId));
        model.addAttribute("typeList", typeRepositoryService.findAll());
        model.addAttribute("categoryList",categoryRepositoryService.findAll());
        model.addAttribute("subCategoryList", subCategoryRepositoryService.findAll());
        model.addAttribute("transactions",transactions);
        model.addAttribute("sum", transactionRepositoryService.transactionsSum(transactions));
        return "transactionsFilter";
    }
    @PostMapping("/chooseType")
    public String chooseType(@RequestParam String type, Model model){
        Integer typeId = Integer.parseInt(type);
        List<Transaction> transactions = transactionRepositoryService.filterTransactionsByTypeAndStatus(typeId, statusId);
        model.addAttribute("statusList", statusRepositoryService.getById(statusId));
        model.addAttribute("typeList", typeRepositoryService.getById(typeId));
        model.addAttribute("categoryList",categoryRepositoryService.listCategoriesFilteredByTypeId(typeId));
        model.addAttribute("subCategoryList", subCategoryRepositoryService.findAll());
        model.addAttribute("transactions",transactions);
        model.addAttribute("sum", transactionRepositoryService.transactionsSum(transactions));
        return "transactionsFilter";
    }

    @PostMapping("/chooseCategory")
    public String chooseCategory(@RequestParam String category, Model model){
        Integer categoryId = Integer.parseInt(category);
        Integer typeId = categoryRepositoryService.getTypeIdByCategoryId(categoryId);
        List<Transaction> transactions = transactionRepositoryService.filterTransactionsByCategoryAndTypeAndStatus(categoryId, typeId, statusId);
        model.addAttribute("statusList", statusRepositoryService.getById(statusId));
        model.addAttribute("typeList", typeRepositoryService.getById(typeId));
        model.addAttribute("categoryList",categoryRepositoryService.getById(categoryId));
        model.addAttribute("subCategoryList", subCategoryRepositoryService.listSubCategoriesFilteredByCategoryId(categoryId));
        model.addAttribute("transactions",transactions);
        model.addAttribute("sum", transactionRepositoryService.transactionsSum(transactions));
        return "transactionsFilter";
    }

    @PostMapping("/chooseSubCategory")
    public String chooseSubCategory(@RequestParam String subCategory, Model model){
        Integer subCategoryId = Integer.parseInt(subCategory);
        Integer categoryId = subCategoryRepositoryService.getCategoryIdBySubCategoryId(subCategoryId);
        Integer typeId = subCategoryRepositoryService.getTypeIdBySubCategoryId(subCategoryId);
        List<Transaction> transactions = transactionRepositoryService.filterTransactionsBySubCategoryAndCategoryAndTypeAndStatus(subCategoryId, categoryId, typeId, statusId);
        model.addAttribute("statusList", statusRepositoryService.getById(statusId));
        model.addAttribute("typeList", typeRepositoryService.getById(typeId));
        model.addAttribute("categoryList",categoryRepositoryService.getById(categoryId));
        model.addAttribute("subCategoryList", subCategoryRepositoryService.getById(subCategoryId));;
        model.addAttribute("transactions", transactions);
        model.addAttribute("sum", transactionRepositoryService.transactionsSum(transactions));
        return "transactionsFilter";
    }

    @PostMapping({"/test1"})    //Goto index Page.
    public String test1() {
        return "transactionsFilter";
    }

    @GetMapping("/test")
    public String test (@RequestParam String transactionId, Model model){
        Integer transactionIdInt = Integer.parseInt(transactionId);
        Transaction transact = transactionRepositoryService.getById(transactionIdInt);
        model.addAttribute("transact", transact);
        List<Status> statusList = statusRepositoryService.findAll();
        model.addAttribute("statusList", statusList);
        return "test";
    }






















//    @GetMapping("/catalogsForm")
//    public String catalogsForm(){
//        return "Catalog/catalog_menu";
//    }
//
//    @GetMapping("/addAccountForm")
//    public String addAccountForm(Model model){
//        Iterable<AccountType> accountTypes = accountTypeRepository.findAll();
//        model.addAttribute("accountTypes", accountTypes);
//        Iterable<CurrencyType> currencyTypes = currencyTypeRepository.findAll();
//        model.addAttribute("currencyTypes", currencyTypes);
//        Iterable<FinancialInstitute> financialInstitutes = financialInstituteRepository.findAll();
//        model.addAttribute("financialInstitutes", financialInstitutes);
////        Iterable<Account> accounts = accountRepository.findAll();
////        model.addAttribute("accounts", accounts);
//
//        return "Catalog/add_account";
//    }
//
//    @GetMapping("/addCurrencyForm")
//    public String addCurrencyForm(){
//        return "Catalog/add_currency";
//    }
//
//    @GetMapping("/addFinancialInstituteForm")
//    public String addFinancialInstituteForm(){
//        return "Catalog/add_financialInstitute";
//    }
//
//    @GetMapping("/addAccountTypeForm")
//    public String addAccountTypeForm(){
//        return "Catalog/add_accountType";
//    }
//    @PostMapping("/addAccount")
//    public String addAccount(@RequestParam FinancialInstitute financialInstitute, @RequestParam AccountType accountType,
//                             @RequestParam CurrencyType currencyType, @RequestParam String comments) {
//
//        Account account = new Account();
//        account.setFinancialInstitute(financialInstitute);
//        account.setAccountType(accountType);
//        account.setCurrencyType(currencyType);
//        account.setComments(comments);
//        accountRepository.save(account);
//        return "Catalog/catalog_menu";
//    }
//
//    @PostMapping("/addAccountType")
//    public String addAccountType(@RequestParam String accType, @RequestParam String comments) {
//
//        AccountType accountType = new AccountType();
//        accountType.setTitle(accType);
//        accountType.setActual(true);
//        accountType.setComments(comments);
//        accountTypeRepository.save(accountType);
//        return "Catalog/catalog_menu";
//    }
//    @PostMapping("/addCurrency")
//    public String addCurrency(@RequestParam String currency, @RequestParam String comments) {
//
//        CurrencyType currencyType = new CurrencyType();
//        currencyType.setTitle(currency);
//        currencyType.setActual(true);
//        currencyType.setComments(comments);
//        currencyTypeRepository.save(currencyType);
//        return "Catalog/catalog_menu";
//    }
//
//    @PostMapping("/addFinancialInstitute")
//    public String addFinancialInstitute(@RequestParam String finInstitute, @RequestParam Integer bic, @RequestParam String comments) {
//        FinancialInstitute financialInstitute = new FinancialInstitute();
//        financialInstitute.setTitle(finInstitute);
//        financialInstitute.setBic(bic);
//        financialInstitute.setActual(true);
//        financialInstitute.setComments(comments);
//        financialInstituteRepository.save(financialInstitute);
//        return "Catalog/catalog_menu";
//    }
//
//
//
//
//
//
//
//
























    //    @Autowired
//    private BudgetRepository budgetRepository;
//    @Autowired
//    private TransactionRepository transactionRepository;
//    @Autowired
//    private TransactionCategoryRepository transactionCategoryRepository;
//    @Autowired
//    private TransactionTypeRepository transactionTypeRepository;

//    @GetMapping("/transactionMenu")
//    public String transactionMenu(){
//        return "Transaction/transaction_menu";
//    }
//
//    @GetMapping("/addTransactionForm")
//    public String addTransactionForm(){
//        return "Transaction/add_transaction";
//    }
//
//    @GetMapping("/selectTransactionForm")
//    public String selectTransactionForm(){
//        return "Transaction/select_transaction";
//    }


//    @GetMapping("/addTransactionCategoryForm")
//    public String addCategoryForm(){
//        return "Catalog/add_category";
//    }
//    @GetMapping("/addTransactionSubcategoryForm")
//    public String addSubCategoryForm(){
//        return "Catalog/add_subcategory";
//    }
//
//    @GetMapping("/diagramMenu")
//    public String diagramMenu(){
//        return "Diagram/diagram_menu";
//    }
//
//    @GetMapping("/budgetMenu")
//    public String budgetMenu(){
//        return "Budget/budget_menu";
//    }
//    @GetMapping("/addPaymentForm")
//    public String addPaymentForm(){
//        return "Budget/add_payment";
//    }
//
//    @GetMapping("/selectPaymentForm")
//    public String selectPaymentForm(){
//        return "Budget/select_payment";
//    }
//
//    @GetMapping("/start")
//    public String openStartPage(){
//        return "start";
//    }

//    @GetMapping("/123")
//    public String aaa (){
//        return "Transaction/add_transaction";
//    }
//    @PostMapping("/addTransaction")
//    public String addTransaction(@RequestParam Date date, @RequestParam Double sum,@RequestParam Account sourceAccount,
//                                 @RequestParam Account targetAccount,
//                                 @RequestParam TransactionCategory transactionCategory, @RequestParam Double currencyRate,
//                                 @RequestParam String description, @RequestParam String comments) {
//
//        Transaction transaction = new Transaction();
//        transaction.setDate(date);
//        transaction.setSum(sum);
//        transaction.setSourceAccount(sourceAccount);
//        transaction.setTargetAccount(targetAccount);
//        transaction.setTransactionType(null);
//        transaction.setTransactionCategory(transactionCategory);
//        transaction.setCurrencyRate(currencyRate);
//        transaction.setDescription(description);
//        transaction.setComments(comments);
//        transactionRepository.save(transaction);
//        return "Transaction/transaction_menu";
//    }

//    @PostMapping("/addAccount")
//    public String addAccount(@RequestParam FinancialInstitute financialInstitute, @RequestParam AccountType accountType,
//                             @RequestParam CurrencyType currencyType, @RequestParam String comments) {
//
//        Account account = new Account();
//        account.setFinancialInstitute(financialInstitute);
//        account.setAccountType(accountType);
//        account.setCurrencyType(currencyType);
//        account.setComments(comments);
//        accountRepository.save(account);
//        return "Catalog/catalog_menu";
//    }



//    @PostMapping("/addCategory")
//    public String addCategory(@RequestParam String category, @RequestParam String comments) {
//
//        TransactionCategory transactionCategory = new TransactionCategory();
//        transactionCategory.setTitle(category);
//        transactionCategory.setActual(true);
//        transactionCategory.setSuperCategory(null);
//        transactionCategory.setComments(comments);
//        transactionCategoryRepository.save(transactionCategory);
//        return "Catalog/catalog_menu";
//    }

//    @PostMapping("/addSubcategory")
//    public String addSubcategory(@RequestParam String subcategory, @RequestParam TransactionCategory superCategory, @RequestParam String comments) {
//        TransactionCategory transactionCategory = new TransactionCategory();
//        transactionCategory.setTitle(subcategory);
//        transactionCategory.setActual(true);
//        transactionCategory.setSuperCategory(superCategory);
////        transactionCategory.setSuperCategory(null); //TEMPORARY - FOR TESTS!
//        transactionCategory.setComments(comments);
//        transactionCategoryRepository.save(transactionCategory);
//        return "Catalog/catalog_menu";
//    }
//    @GetMapping("/transactionsList")
//    public String listTransactions(Model model) {
//        Iterable<Transaction> transactions = transactionRepository.findAll();
//        model.addAttribute("transactions", transactions);
//        return "Transaction/list_transaction";
//    }
//
//    @GetMapping(path = "/subcategory")
//    @Transactional(readOnly = false)
//    public String getSubcategoriesByCategoryId(@RequestParam("categoryId") String categoryId, Model model) {
//        Map<String, String> listCategories = new HashMap<>();
//        for (String[] s: transactionCategoryRepository.getSubcategoriesByCategoryId("-1")) {
//                listCategories.put(s[0],s[1]);
//        }
//        model.addAttribute("categories",listCategories);
//        model.addAttribute("categoryId",categoryId);
//
//        Map<String, String> listSubcategories = new HashMap<>();
//        for (String[] s: transactionCategoryRepository.getSubcategoriesByCategoryId(categoryId)) {
//            listSubcategories.put(s[0],s[1]);
//        }
//        model.addAttribute("subcategories",listSubcategories);
//

//        for (String[] s : transactionCategoryRepository.getSubcategoriesByCategoryId(categoryId)) {
//            for (String s1 : s) {
//                System.out.println(s1);
//            }
//            System.out.println();
//        }

//        return "Transaction/list_subcategory";
//    }


//    @GetMapping("/addSubcat")
//    @Transactional(readOnly = false)
//    public String addSubcat(TransactionCategory transactionCategory,Model model){
//        model.addAttribute("categories",transactionCategoryRepository.getSubcategoriesByCategoryId("-1"));
//        return "Transaction/list_subcategory";
//    }

//    @PostMapping("/expense/category")
//    public String createExpense( @RequestParam(name = "category.id") Long categoryid,@Valid  Expense expense, BindingResult result) {
//
//        categoryRepo.findById(categoryid).map(expense1 -> {
//            expense.setCategory(expense1);
//            return expenseRepo.save(expense);
//        });
//        return "redirect:expenses";
//
//    }



//    @GetMapping(path = "/subcategory")
//    public List<String> getSubcategoriesByCategoryId(@RequestParam("categoryId") int categoryId) {
//        return transactionCategoryRepository.getSubcategoriesByCategoryId(categoryId);
//    }
//    public Iterable<Transaction> getTransactions() {
//        return transactionRepository.findAll();
//    }
//    public String getTransactions() {
//        StringBuilder page = new StringBuilder("<html><head><style>#transactions {\n" +
//                "  font-family: Arial, Helvetica, sans-serif;\n" +
//                "  border-collapse: collapse;\n" +
//                "  width: 100%;\n" +
//                "}\n" +
//                "\n" +
//                "#transactions td, #transactions th {\n" +
//                "  border: 1px solid #ddd;\n" +
//                "  padding: 8px;\n" +
//                "}\n" +
//                "\n" +
//                "#transactions tr:nth-child(even){background-color: #f2f2f2;}\n" +
//                "\n" +
//                "#transactions tr:hover {background-color: #ddd;}\n" +
//                "\n" +
//                "#transactions th {\n" +
//                "  padding-top: 12px;\n" +
//                "  padding-bottom: 12px;\n" +
//                "  text-align: left;\n" +
//                "  background-color: #04AA6D;\n" +
//                "  color: white;\n" +
//                "}</style><title>List of Transactions</title></head>" +
//                "<body><table id=\"transactions\"><tr><th>Date</th><th>Sum</th><th>Type</th><th>Category</th>" +
//                "<th>Source Account</th><th>Target Account</th><th>CurrencyRate</th><th>Description</th><th>Comments</th></tr>");
//
//
//        for (Transaction transaction: transactionRepository.findAll()) {
//            page.append("<tr><td>" +  transaction.getDate() + "</td><td>" + transaction.getSum()+ "</td><td>"
//                        +  transaction.getTransactionType() + "</td><td>" + transaction.getTransactionCategory()+ "</td><td>"
//                        +  transaction.getSourceAccount() + "</td><td>" + transaction.getTargetAccount()+ "</td><td>"
//                        +  transaction.getCurrencyRate() + "</td><td>" + transaction.getDescription()+ "</td><td>"
//                        +  transaction.getComments() + "</td></tr>");
//        }
//        page.append("</table></body></html>");
//        return page.toString();
//    }

//    @PostMapping("/addAccount")
//    public String addAccount(@RequestParam FinancialInstitute financialInstitute,
//                             @RequestParam AccountType accountType, @RequestParam CurrencyType currencyType,
//                             @RequestParam String comments) {
//
//        Account account = new Account();
//        account.setFinancialInstitute(financialInstitute);
//        account.setAccountType(accountType);
//        account.setCurrencyType(currencyType);
//        account.setComments(comments);
//        accountRepository.save(account);
//        return "Catalog/catalog_menu";
//    }
//
//    @GetMapping("/accountsList")
//
//    public String getAccounts() {
//        StringBuilder page = new StringBuilder("<html><head><style>#accounts {\n" +
//                "  font-family: Arial, Helvetica, sans-serif;\n" +
//                "  border-collapse: collapse;\n" +
//                "  width: 100%;\n" +
//                "}\n" +
//                "\n" +
//                "#accounts td, #accounts th {\n" +
//                "  border: 1px solid #ddd;\n" +
//                "  padding: 8px;\n" +
//                "}\n" +
//                "\n" +
//                "#accounts tr:nth-child(even){background-color: #f2f2f2;}\n" +
//                "\n" +
//                "#accounts tr:hover {background-color: #ddd;}\n" +
//                "\n" +
//                "#accounts th {\n" +
//                "  padding-top: 12px;\n" +
//                "  padding-bottom: 12px;\n" +
//                "  text-align: left;\n" +
//                "  background-color: #04AA6D;\n" +
//                "  color: white;\n" +
//                "}</style><title>List of Accounts</title></head>" +
//                "<body><table id=\"accounts\"><tr><th>FinancialInstitute</th><th>AccountType</th><th>CurrencyType</th><th>Comments</th></tr>");
//
//        for (Account account: accountRepository.findAll()) {
//            page.append("<tr><td>" +  account.getFinancialInstitute() + "</td><td>" + account.getAccountType()+ "</td><td>"
//                    +  account.getCurrencyType() + "</td><td>" + account.getComments() + "</td></tr>");
//        }
//        page.append("</table></body></html>");
//        return page.toString();
//    }
//    @GetMapping("/find/{id}")
//    public Transaction findTransactionById(@PathVariable Integer id) {
//        return transactionRepository.findTransactionById(id);
//    }

//    @RequestMapping(value = "/transactionTypeList", method = RequestMethod.GET)
//    public String transactionTypeList(Model model) {
//        List<String> options = new ArrayList<String>();
//        for (TransactionType transactionType: transactionTypeRepository.findAll()) {
//            options.add(transactionType.getTitle());
//        }
//        Iterable<TransactionType> types = transactionTypeRepository.findAll();
//        model.addAttribute("types", types);
//        model.addAttribute("options", transactionTypeRepository.findAll());
//        return "transactionTypeList/index_old.html";
//    }


//    @GetMapping("/")
//    public String selectAccountType(Model model) {
//        Iterable<AccountType> accountTypes = accountTypeRepository.findAll();
//        model.addAttribute("accountTypes", accountTypes);
//        return "index";
//    }

//    @GetMapping("/")
//    public String index(Model model) {
//        Iterable<AccountType> accountTypes = accountTypeRepository.findAll();
//        model.addAttribute("accountTypes", accountTypes);
//        Iterable<CurrencyType> currencyTypes = currencyTypeRepository.findAll();
//        model.addAttribute("currencyTypes", currencyTypes);
//        Iterable<FinancialInstitute> financialInstitutes = financialInstituteRepository.findAll();
//        model.addAttribute("financialInstitutes", financialInstitutes);
//        Iterable<TransactionCategory> transactionCategories = transactionCategoryRepository.findAll();
//        model.addAttribute("transactionCategories", transactionCategories);
//        Iterable<Account> accounts = accountRepository.findAll();
//        model.addAttribute("accounts", accounts);


//        TransactionCategory mainCategory = null;
//        List<TransactionCategory> subcategories = null;
//        Map<TransactionCategory, List<TransactionCategory>> transactionCategoryMap = new HashMap<>();
//
//        for (TransactionCategory transactionCategory: transactionCategoryRepository.findAll()) {
//            if (transactionCategory.getSuperCategory() == null) {
//                mainCategory = transactionCategory;
//            } else {
//              subcategories = new ArrayList<>();
//                for (TransactionCategory category : transactionCategoryRepository.findAll()) {
//                    if (Objects.equals(transactionCategory.getId(), transactionCategory.getSuperCategory())){
//                        subcategories.add(category);
//                    }
//                }
//            }
//            transactionCategoryMap.put(mainCategory, subcategories);
//        }
//        model.addAttribute("transactionCategoryMap", transactionCategoryMap);

//        Iterable<TransactionType> transactionTypes = transactionTypeRepository.findAll();
//        model.addAttribute("transactionTypes", transactionTypes);
//        return "index";
//    }

//    @GetMapping("/1")
//   public List<TransactionCategory> subcategoryList (){
//        return transactionCategoryRepository.getSubcategories(1);
//    }

//    @GetMapping("/2")
//   public List<AccountType> accountTypesList (){
//        return accountTypeRepository.getAccountTypes(1);
//    }

}
