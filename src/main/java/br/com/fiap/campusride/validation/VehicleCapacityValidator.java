package br.com.fiap.campusride.validation;

import br.com.fiap.campusride.dto.RideRequest;
import br.com.fiap.campusride.enums.VehicleType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class VehicleCapacityValidator implements ConstraintValidator<VehicleCapacity, RideRequest> {

    @Override
    public boolean isValid(RideRequest request, ConstraintValidatorContext context) {
        if (request == null || request.vehicleType() == null || request.totalSeats() == null) {
            return true; // As anotações @NotNull individuais cuidam de campos nulos
        }

        // Regra do domínio: Moto aceita no máximo 1 vaga de passageiro
        if (request.vehicleType() == VehicleType.MOTO && request.totalSeats() > 1) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Uma moto só pode transportar no máximo 1 passageiro")
                    .addPropertyNode("totalSeats")
                    .addConstraintViolation();
            return false;
        }

        // Regra do domínio: Carro convencional aceita no máximo 4 passageiros
        if (request.vehicleType() == VehicleType.CARRO && request.totalSeats() > 4) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Um carro só pode oferecer até 4 vagas")
                    .addPropertyNode("totalSeats")
                    .addConstraintViolation();
            return false;
        }

        return true;
    }
}