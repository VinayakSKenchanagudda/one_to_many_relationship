package com.ty_one_to_many_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty_one_to_many_uni.dto.Company;
import com.ty_one_to_many_uni.dto.Employee;

public class CompanyDao {
public EntityManager getEntityManager()
{
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	return entityManagerFactory.createEntityManager();
}

public void saveCompany(Company company)
{
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	List<Employee> employees=company.getList();
	for(Employee employee:employees)
	{
		entityManager.persist(employee);
	}
	entityManager.persist(company);
	entityTransaction.commit();
}

public void updateCompany(int companyId,Company company )
{
	EntityManager entityManager=getEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	Company recivedCompany=entityManager.find(Company.class, companyId);
	if(recivedCompany !=null)
	{
		company.setId(companyId);
		company.setList(recivedCompany.getList());
		entityTransaction.begin();
		entityManager.merge(company);
		entityTransaction.commit();
	}
	else {
		System.out.println("company not exist");
	}
}

public void deleteCompany(int companyId)
{
	EntityManager entityManager = getEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	Company company=entityManager.find(Company.class, companyId);
	if (company != null) {
		entityTransaction.begin();
		entityManager.remove(company);
		entityTransaction.commit();
	}
	
}
public Company getCompanyId(int companyId) {
	EntityManager entityManager = getEntityManager();
	Company company=entityManager.find(Company.class, companyId);
	return company;
	 
}

public List<Company> getAll() {
	EntityManager entityManager = getEntityManager();
	Query query = entityManager.createQuery("Select C From Company p");
	return query.getResultList();
}

}
