package za.co.smartcall;

import java.math.BigDecimal;

public record Product(int id,String network,String name, String description,String typeCode,BigDecimal minAmount,BigDecimal maxAmount,BigDecimal discountPercentage,BigDecimal retailValue,boolean pinIndicator,boolean smsIndicator,boolean recharge,boolean payment) {

}
