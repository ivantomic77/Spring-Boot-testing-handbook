package dev.tomic.testingmasterclass.chapter3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ch3DrivingLicenseCreator {
    List<Ch3License> licenses = new ArrayList<>();

    public Boolean canCreateLicense(Integer age) {
        return age >= 18;
    }

    public void createLicense(Ch3License license) {
        if (Boolean.FALSE.equals(canCreateLicense(license.getAge()))) {
            throw new IllegalArgumentException("Minimum driving age is 18.");
        }

        license.setCreatedAt(LocalDate.now());
        licenses.add(license);
    }

    public List<Ch3License> getLicensesByName(String name) {
        return licenses.stream()
                .filter(license -> Objects.equals(license.getName(), name))
                .toList();
    }
}
