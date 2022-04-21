package za.co.smartcall;

import java.util.ArrayList;

public record ProductType(int id,String code,String description,boolean fixedAmount,ArrayList<Product> products) {

}
