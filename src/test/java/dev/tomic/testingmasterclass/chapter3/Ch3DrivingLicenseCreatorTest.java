package dev.tomic.testingmasterclass.chapter3;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class Ch3DrivingLicenseCreatorTest {
    private Ch3DrivingLicenseCreator licenseCreator;

    @BeforeEach
    void setUp() {
        licenseCreator = new Ch3DrivingLicenseCreator();
    }

    @ParameterizedTest
    @CsvSource({
            "18,true",
            "19,true",
            "17,false"
    })
    @Order(1)
    void should_verify_if_user_can_create_license(Integer age, Boolean result) {
        assertEquals(result, licenseCreator.canCreateLicense(age));
    }

    @Test
    @Order(2)
    void should_create_license() {
        String name = "Ivan";
        Ch3License licenseToCreate = new Ch3License(name, 19);
        licenseCreator.createLicense(licenseToCreate);

        assertEquals(licenseToCreate, licenseCreator.getLicensesByName(name).getFirst());
    }

    @Test
    void should_not_create_license_because_of_insufficient_age() {
        String name = "Ivan";
        Ch3License licenseToCreate = new Ch3License(name, 17);
        assertThrows(IllegalArgumentException.class, () -> licenseCreator.createLicense(licenseToCreate));
    }
}