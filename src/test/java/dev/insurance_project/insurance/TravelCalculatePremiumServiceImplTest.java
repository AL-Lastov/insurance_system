package dev.insurance_project.insurance;


import dev.insurance_project.insurance.core.TravelCalculatePremiumServiceImpl;
import dev.insurance_project.insurance.rest.TravelCalculatePremiumRequest;
import dev.insurance_project.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TravelCalculatePremiumServiceImplTest {
private TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl();
@Test
    public void response(){
    TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest();
    request.setPersonFirstName("Alex");
    request.setPersonLastName("Last");
    request.setAgreementDateFrom(LocalDate.of(1200,1,2));
    request.setAgreementDateTo(LocalDate.of(1200,1,4));

    TravelCalculatePremiumResponse response = service.calculatePremium(request);

    assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    assertEquals(response.getPersonLastName(), request.getPersonLastName());
    assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());


}



}