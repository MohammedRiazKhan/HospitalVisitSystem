package factories;

import domain.Doctor;

public class DoctorFactory {

    public static Doctor getDoctor(String firstName) {
        return new Doctor.Builder()
                .firstName(firstName)
                .build();
    }
}
