package com.scaler.vinay.sstmid1.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;
@Getter
@Setter
public class fakestore {
    String id;
    String userId;
    Date date;
    List<product> products;
    int M;
}
