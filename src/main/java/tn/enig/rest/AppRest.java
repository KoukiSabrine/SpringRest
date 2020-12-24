package tn.enig.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enig.dao.IProduitDao;
import tn.enig.model.Produit;
@CrossOrigin("*") 
@RestController
public class AppRest {
@Autowired
IProduitDao daop;

public void setDao(IProduitDao daop) {this.daop=daop;}


@GetMapping("/produits")
	public List<Produit>fnct1(){
		return (List<Produit>) daop.findAll();
	}


@PostMapping("/addProduit")
public Produit fnct2(@RequestBody Produit p1) {
	return daop.save(p1);
}


@DeleteMapping("/delProduit/{id}")
public void fnct3(@PathVariable("id") int id) {
	daop.deleteById(id);
}










}
