package org.xworkz.mvc.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xworkz.mvc.dto.MatrimonyDTO;

@Component
public class MatrimonyDAOImpl implements MatrimonyDAO {

	public MatrimonyDAOImpl() {
		System.out.println("Created \t" + this.getClass().getPackage());
	}

	private SessionFactory factory;
	
	@Autowired
	public MatrimonyDAOImpl(SessionFactory factor){
		System.out.println("Create \t"+this.getClass().getTypeName());
		this.factory= factor;
	}
	@Override
	public void save(MatrimonyDTO dto) {
		System.out.println("Saving "+dto);
		
		Session session = null;
		try {
			
			session = factory.openSession();
			System.out.println("transaction begins");
			 session.beginTransaction();
			Serializable serializable = session.save(dto);
			System.out.println("saving dto" + dto);
			System.out.println(serializable);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("exceptio found"+e.getMessage());
		}
		finally {
			System.out.println("data saved into data base");
			if(session!=null)session.close();
			
		}

	}

}
