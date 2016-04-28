package com.app.spring.service.income;

import com.app.spring.dao.income.IncomeDAO;
import com.app.spring.dao.incomeCategory.IncomeCategoryDAO;
import com.app.spring.entity.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by scelac on 4/11/16.
 */
@Service("IncomeServiceImpl")
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    IncomeDAO incomeDAO;

    @Override
    @Transactional
    public void addIncome(Income income) {
        incomeDAO.addIncome(income);
    }

    @Override
    @Transactional
    public Income getByID(Integer id) {
        return incomeDAO.getByID(id);
    }

    @Override
    @Transactional
    public List<Income> getAllIncome() {
        return incomeDAO.getAllIncome();
    }
}
