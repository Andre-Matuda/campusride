package br.com.fiap.campusride.validation;

import br.com.fiap.campusride.dto.RideRequest;
import br.com.fiap.campusride.enums.VehicleType;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class VehicleCapacityValidator implements ConstraintValidator<VehicleCapacity, RideRequest> {

    @Override
    public boolean isValid(RideRequest request, ConstraintValidatorContext context) {
        if (request == null || request.vehicleType() == null || request.totalSeats() == null) {
            return true;
        }

        if (request.vehicleType() == VehicleType.MOTORCYCLE && request.totalSeats() > 1) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Uma moto só pode transportar no máximo 1 passageiro")
                    .addPropertyNode("totalSeats")
                    .addConstraintViolation();
            return false;
        }

        if (request.vehicleType() == VehicleType.CAR && request.totalSeats() > 4) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Um carro só pode oferecer até 4 vagas")
                    .addPropertyNode("totalSeats")
                    .addConstraintViolation();
            return false;
        }

        return true;
    }
}