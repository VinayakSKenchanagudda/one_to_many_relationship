package com.ty_onetomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty_one_to_many_uni.dao.CompanyDao;
import com.ty_one_to_many_uni.dto.Company;
import com.ty_one_to_many_uni.dto.Employee;

public class CompanyMain {
public static void main(String[] args) {
	
//	Employee employee1=new Employee();
//	employee1.setName("smith");
//	employee1.setAddress("banglore");
//	employee1.setPhone(3769485231l);
//	
//	Employee employee2=new Employee();
//	employee2.setName("martin");
//	employee2.setAddress("goa");
//	employee2.setPhone(89356178294l);
//	
//	Employee employee3=new Employee();
//	employee3.setName("john");
//	employee3.setAddress("chenni");
//	employee3.setPhone(89264064918l);
//	
//	Company company=new Company();
//	company.setName("TestYantra");
//	company.setGst("fewdiskgaj");
//	
//	List<Employee> list=new ArrayList<Employee>();
//	list.add(employee1);
//	list.add(employee2);
//	list.add(employee3);
//	
//	company.setList(list);
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(employee1);
//	entityManager.persist(employee2);
//	entityManager.persist(employee3);
//	entityManager.persist(company);
//	entityTransaction.commit();
	System.out.println("hi");
	Company company=new Company();
	company.setName("TestYantra PVT");
	company.setGst("fid585");
	CompanyDao dao=new CompanyDao();
	dao.updateCompany(1, company);
	System.out.println("hi");
}
}
