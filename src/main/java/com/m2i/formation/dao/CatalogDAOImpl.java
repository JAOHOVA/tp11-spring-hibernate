package com.m2i.formation.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.m2i.formation.dao.entity.Product;

@Repository("catalogDAO")
public class CatalogDAOImpl implements ICatalogDAO {

	@Resource(name = "hibernate4AnnotatedSessionFactory")
	private SessionFactory sessionFactory;

	public void addProduct(Product p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(p);
		tx.commit();
		session.close();
	}

	public void updateProduct(Product p) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(p);
		tx.commit();
		session.close();
	}

	public void removeProduct(Product p) {

		int id = findProductByRef(p.getReference()).getId();

		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Product tempP = (Product) session.load(Product.class, id);
		System.out.println("tempP.getPrice() : " + tempP.getPrice());
		if (null != tempP) {
			session.delete(tempP);
		}
		tx.commit();
		session.close();
	}

	public Product findProductByRef(String ref) {
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from Product where reference like :param ");
		query.setParameter("param", ref);
		Product p = (Product) query.getResultList().get(0);
		session.close();
		return p;
	}

	public List<Product> findAllProducts() {
		List<Product> productsList = null;
		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from Product ");
		productsList = query.getResultList();
		session.close();
		return productsList;
	}

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	// public Session init()
	// {
	// session = (this.session!=null &&
	// this.session.isOpen())?session:this.sessionFactory.openSession();
	// return session;
	// }

}
