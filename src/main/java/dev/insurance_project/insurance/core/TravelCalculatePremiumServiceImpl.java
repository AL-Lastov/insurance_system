package dev.insurance_project.insurance.core;


import dev.insurance_project.insurance.rest.TravelCalculatePremiumRequest;
import dev.insurance_project.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;
//почему мне сказали сделать его публичным?? в менторе нет.
//иначе не мог импортировать в тесты
@Component
public class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse();

        response.setAgreementDateFrom(request.getAgreementDateFrom());
        response.setAgreementDateTo(request.getAgreementDateTo());
        response.setPersonFirstName(request.getPersonFirstName());
        response.setPersonLastName(request.getPersonLastName());



        return response;

    }


}
