package com.dataeconomy.masterdatamanagement.controller;

import com.dataeconomy.masterdatamanagement.model.Address;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MDMController {

    @PostMapping("/validateAddress")
    public ResponseEntity<String> validateAddress(@RequestBody Address address){

       if(null==address || null==address.getAddress1() || address.getAddress1().isEmpty()){
           return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Address1 cannnot be null");
       }
        if(null==address.getAddress2() || address.getAddress2().isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Address2 cannnot be null");
        }
        if(null==address.getLocality() || address.getLocality().isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Locality cannnot be null");
        }
        if(null==address.getAdministrativeArea() || address.getAdministrativeArea().isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("AdministrativeArea cannnot be null");
        }
        if(null==address.getCountry() || address.getCountry().isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("Country cannnot be null");
        }
        if(null==address.getPostalCode() || address.getPostalCode().isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).body("PostalCode cannnot be null");
        }

        return ResponseEntity.status(HttpStatus.OK).body("Address validation is successfull");
    }
}
