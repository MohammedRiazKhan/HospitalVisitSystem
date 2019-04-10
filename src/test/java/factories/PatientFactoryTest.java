package factories;

import domain.Patient;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatientFactoryTest {


    @Test
    public void getPatient() {

        String name = "Riaz";

        Patient patient = PatientFactory.getPatient(name);

        Assert.assertEquals(patient.getFirstName(), name);

    }
}