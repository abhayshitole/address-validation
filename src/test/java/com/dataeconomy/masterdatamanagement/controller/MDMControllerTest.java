package com.dataeconomy.masterdatamanagement.controller;

import com.dataeconomy.masterdatamanagement.model.Address;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

public class MDMControllerTest {

    @Test
    public void testValidateAddressWithInvalidInput(){
        MDMController controller = new MDMController();
        Address address = new Address();
        address.setAddress1("1012");
        address.setAddress2("Backer street");
        address.setCountry("USA");
        address.setLocality("Locality");
        address.setAdministrativeArea("SA");
        ResponseEntity<String> response =  controller.validateAddress(address);
        Assertions.assertEquals(HttpStatus.NOT_ACCEPTABLE,response.getStatusCode());
    }

    @Test
    public void testValidateAddressWithValidInput(){
        MDMController controller = new MDMController();
        Address address = new Address();
        address.setAddress1("1012");
        address.setAddress2("Backer street");
        address.setCountry("USA");
        address.setLocality("Locality");
        address.setAdministrativeArea("SA");
        address.setPostalCode("705112");
        ResponseEntity<String> response =  controller.validateAddress(address);
        Assertions.assertEquals(HttpStatus.OK,response.getStatusCode());
    }
}