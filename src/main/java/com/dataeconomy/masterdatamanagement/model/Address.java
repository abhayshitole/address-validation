package com.dataeconomy.masterdatamanagement.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Address {
    private String address1;
    private String address2;
    private String locality;
    private String administrativeArea;
    private String postalCode;
    private String country;


}
