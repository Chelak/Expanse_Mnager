package com.app.spring.service.incomecategory;

import com.app.spring.dao.incomeCategory.IncomeCategoryDAO;
import com.app.spring.entity.IncomeCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
@Service("IncomeCategoryServiceImpl")
public class IncomeCategoryServiceImpl implements IncomeCategoryService {

    @Autowired
    IncomeCategoryDAO incomeCategoryDAO;

    @Override
    @Transactional
    public void addIncomeCategory(IncomeCategory incomeCategory) {
        incomeCategoryDAO.addIncomeCategory(incomeCategory);
    }

    @Override
    @Transactional
    public IncomeCategory getById(Integer id) {
        return incomeCategoryDAO.getById(id);
    }

    @Override
    @Transactional
    public List<IncomeCategory> getAll() {
        return incomeCategoryDAO.getAll();
    }

    @Override
    @Transactional
    public void editCategory(IncomeCategory incomeCategory, Integer id) {
        incomeCategoryDAO.editCategory(incomeCategory,id);
    }

    @Override
    @Transactional
    public void removeCategory(Integer Id) {
        incomeCategoryDAO.removeCategory(Id);
    }
}
