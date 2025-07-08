package dev.insurance_project.insurance.rest;

import java.time.LocalDate;
import java.util.Date;

public class TravelCalculatePremiumResponse {

    private String personFirstName;
    private String personLastName;
    private LocalDate agreementDateFrom;
    private LocalDate agreementDateTo;

    public TravelCalculatePremiumResponse() {
        super();
    }

    public TravelCalculatePremiumResponse(String personFirstName, String personLastName,
                                          LocalDate agreementDateFrom, LocalDate agreementDateTo) {
        super();
        this.personFirstName = personFirstName;
        this.personLastName = personLastName;
        this.agreementDateFrom = agreementDateFrom;
        this.agreementDateTo = agreementDateTo;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public void setPersonFirstName(String personFirstName) {
        this.personFirstName = personFirstName;
    }

    public String getPersonLastName() {
        return personLastName;
    }

    public void setPersonLastName(String personLastName) {
        this.personLastName = personLastName;
    }

    public LocalDate getAgreementDateFrom() {
        return agreementDateFrom;
    }

    public void setAgreementDateFrom(LocalDate agreementDateFrom) {
        this.agreementDateFrom = agreementDateFrom;
    }

    public LocalDate getAgreementDateTo() {
        return agreementDateTo;
    }

    public void setAgreementDateTo(LocalDate agreementDateTo) {
        this.agreementDateTo = agreementDateTo;
    }

    @Override
    public String toString() {
        return "TravelCalculatePremiumResponse{" +
                "personFirstName='" + personFirstName + '\'' +
                ", personLastName='" + personLastName + '\'' +
                ", agreementDateFrom=" + agreementDateFrom +
                ", agreementDateTo=" + agreementDateTo +
                '}';
    }
}
