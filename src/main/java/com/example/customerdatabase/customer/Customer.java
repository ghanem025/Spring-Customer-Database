package com.example.customerdatabase.customer;


import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false)
    String first_name;
    @Column(nullable = false)
    String last_name;
    @Column()
    String phone_model;
    @Column()
    Long IMEI;
    @Column(nullable = true)
    String notes;
    @Column(nullable = false)
    Date date_of_transaction;

    protected Customer(){
        // protected constructor since it shouldn't be used directly
    }
    public Customer(Long id, String first_name, String last_name, String phone_model, Long IMEI, String notes, Date date_of_transaction) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_model = phone_model;
        this.IMEI = IMEI;
        this.notes = notes;
        this.date_of_transaction = date_of_transaction;
    }
    public Customer( String first_name, String last_name, String phone_model, Long IMEI, String notes, Date date_of_transaction){
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_model = phone_model;
        this.IMEI = IMEI;
        this.notes = notes;
        this.date_of_transaction = date_of_transaction;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Long getIMEI() {
        return IMEI;
    }

    public void setIMEI(Long IMEI) {
        this.IMEI = IMEI;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDate_of_transaction() {
        return date_of_transaction;
    }

    public void setDate_of_transaction(Date date_of_transaction) {
        this.date_of_transaction = date_of_transaction;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", phone_model='" + phone_model + '\'' +
                ", IMEI=" + IMEI +
                ", notes='" + notes + '\'' +
                ", date_of_transaction=" + date_of_transaction +
                '}';
    }

}
