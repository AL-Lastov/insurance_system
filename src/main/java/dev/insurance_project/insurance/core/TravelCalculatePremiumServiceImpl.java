package dev.insurance_project.insurance.core;


import dev.insurance_project.insurance.rest.TravelCalculatePremiumRequest;
import dev.insurance_project.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {

    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        return new TravelCalculatePremiumResponse();
    }

}
