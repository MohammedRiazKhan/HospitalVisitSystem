package factories;

import domain.Patient;

import static utility.IDGenerator.genId;


public class PatientFactory {

    public static Patient getPatient(String firstName) {
        return new Patient.Builder().patientId(genId())
                .firstName(firstName)
                .build();
    }

}
