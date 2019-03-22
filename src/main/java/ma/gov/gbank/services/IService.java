package ma.gov.gbank.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.gov.gbank.entities.Compte;

@Service
public interface IService {
	boolean ajouterCompte(Compte c);
	boolean updateCompte(Compte c);
	boolean deleteCompte(Compte c);
	List<Compte> selectAll();
	Compte selectById(Long id);
	List<Compte> selectAllByUserId(Long id);
}
