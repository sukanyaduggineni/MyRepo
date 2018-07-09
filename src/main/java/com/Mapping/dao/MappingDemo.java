package com.Mapping.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Mapping.Model.Address;
import com.Mapping.Model.Employee;
import com.Mapping.Util.SessionUtil;

public class MappingDemo {

	public static void main(String[] args) {
		

	Session session=SessionUtil.getSession();
	Address address=new Address();
	address.setAddressLine("telecomnagar");
	address.setCity("khammam");
	address.setState("telangana");
	address.setPincode(507001);
	Employee emp=new Employee();
	emp.setEmpname("sukanya");
	emp.setEmpdesg("java");
	emp.setAddress(address);
	session.save(emp);
	session.beginTransaction().commit();
	Query query=session.createQuery("from Employee");
	List<Employee> emp1=query.list();
	
	Iterator<Employee> itr=emp1.iterator();  
    while(itr.hasNext()){  
     Employee emp2=itr.next();  
     System.out.println(emp.getEmpname()+" "+emp.getEmpdesg()+" "+emp.getAddress());  
   
    }  

	
	}
}
