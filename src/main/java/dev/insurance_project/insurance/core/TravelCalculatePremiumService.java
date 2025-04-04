package dev.insurance_project.insurance.core;


import dev.insurance_project.insurance.rest.TravelCalculatePremiumRequest;
import dev.insurance_project.insurance.rest.TravelCalculatePremiumResponse;

public interface TravelCalculatePremiumService {

    TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request);

}
