package com.vandai.doan3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vandai.doan3.entity.Can;
import com.vandai.doan3.entity.Chi;
import com.vandai.doan3.entity.Electricity;
import com.vandai.doan3.entity.Program;
import com.vandai.doan3.entity.Tax;
import com.vandai.doan3.entity.TaxComputeDegree;
import com.vandai.doan3.entity.TaxTable;
import com.vandai.doan3.respository.CanResponsitory;
import com.vandai.doan3.respository.ChiResponsitory;
import com.vandai.doan3.respository.ElectricityResponsitory;
import com.vandai.doan3.respository.ProgramRespository;
import com.vandai.doan3.respository.TaxComputeDegreeResponsitory;
import com.vandai.doan3.respository.TaxResponsitory;
import com.vandai.doan3.respository.TaxTableResponsitory;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ProgramController {
	@Autowired
	 ProgramRespository programRespository ; 
	@Autowired
	CanResponsitory canResponsitory;
	@Autowired
	ChiResponsitory chiResponsitory;
	@Autowired
	ElectricityResponsitory electricityResponsitory;
	@Autowired
	TaxResponsitory taxResponsitory;
	@Autowired
	TaxTableResponsitory taxTableResponsitory;
	@Autowired
	TaxComputeDegreeResponsitory taxComputeDegreeResponsitory;
	 @GetMapping("/program")
	 public ResponseEntity<List<Program>> getAllProductCategory(@RequestParam(required = false) String title) {
	    try {
	      List<Program> productCategory = new ArrayList<Program>();
	      if (title == null)
	    	  programRespository.findAll().forEach(productCategory::add);	  
	      if (productCategory.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      System.out.println(productCategory.get(1).getName());	
	      return new ResponseEntity<>(productCategory, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @GetMapping("/can")
	 public ResponseEntity<List<Can>> getAllCan(@RequestParam(required = false) String title) {
	    try {
	      List<Can> cans = new ArrayList<Can>();
	      if (title == null)
	    	  canResponsitory.findAll().forEach(cans::add);	  
	      if (cans.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      System.out.println(cans.get(1).getName());	
	      return new ResponseEntity<>(cans, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @GetMapping("/chi")
	 public ResponseEntity<List<Chi>> getAllChi(@RequestParam(required = false) String title) {
	    try {
	      List<Chi> chis = new ArrayList<Chi>();
	      if (title == null)
	    	  chiResponsitory.findAll().forEach(chis::add);	  
	      if (chis.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      System.out.println(chis.get(1).getName());	
	      return new ResponseEntity<>(chis, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @GetMapping("/electricity")
	 public ResponseEntity<List<Electricity>> getAllElectricity(@RequestParam(required = false) String title) {
	    try {
	      List<Electricity> electricitys = new ArrayList<Electricity>();
	      if (title == null)
	    	  electricityResponsitory.findAll().forEach(electricitys::add);	  
	      if (electricitys.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      System.out.println(electricitys.get(1).getUnitPrice());	
	      return new ResponseEntity<>(electricitys, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @GetMapping("/tax")
	 public ResponseEntity<List<Tax>> getAllTax(@RequestParam(required = false) String title) {
	    try {
	      List<Tax> taxs = new ArrayList<Tax>();
	      if (title == null)
	    	  taxResponsitory.findAll().forEach(taxs::add);	  
	      if (taxs.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      System.out.println(taxs.get(1).getMoney());	
	      return new ResponseEntity<>(taxs, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @GetMapping("/tax/table")
	 public ResponseEntity<List<TaxTable>> getAllTaxTable(@RequestParam(required = false) String title) {
	    try {
	      List<TaxTable> taxTables = new ArrayList<TaxTable>();
	      if (title == null)
	    	  taxTableResponsitory.findAll().forEach(taxTables::add);	  
	      if (taxTables.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      System.out.println(taxTables.get(1).getSalaryMonth());	
	      return new ResponseEntity<>(taxTables, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 @GetMapping("/tax/computedegree")
	 public ResponseEntity<List<TaxComputeDegree>> getAllTaxComputeDegree(@RequestParam(required = false) String title) {
	    try {
	      List<TaxComputeDegree> taxComputeDegrees = new ArrayList<TaxComputeDegree>();
	      if (title == null)
	    	  taxComputeDegreeResponsitory.findAll().forEach(taxComputeDegrees::add);	  
	      if (taxComputeDegrees.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      System.out.println(taxComputeDegrees.get(1).getContent());	
	      return new ResponseEntity<>(taxComputeDegrees, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	 
}
