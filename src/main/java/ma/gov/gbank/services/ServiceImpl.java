package ma.gov.gbank.services;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.gbank.dao.IDao;
import ma.gov.gbank.entities.Compte;

@Service
public class ServiceImpl implements IService {
	
	@Autowired
	IDao dao;
	
	@Override
	public boolean ajouterCompte(Compte c) {
		try {
			return dao.insert(c);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateCompte(Compte c) {
		try {
			return dao.update(c);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteCompte(Compte c) {
		try {
			return dao.delete(c);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public List<Compte> selectAll() {
		return dao.selectAll();
	}
	
	@Override
	public Compte selectById(Long id) {
		return dao.selectById(id);
	}


}
