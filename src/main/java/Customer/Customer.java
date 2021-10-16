package Customer;

import java.util.Date;

public class Customer {
    Long id;
    String first_name;
    String last_name;
    Long IMEI;
    String notes;
    Date date_of_transaction;

    public Customer(Long id, String first_name, String last_name, Long IMEI, String notes, Date date_of_transaction) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.IMEI = IMEI;
        this.notes = notes;
        this.date_of_transaction = date_of_transaction;
    }
}
