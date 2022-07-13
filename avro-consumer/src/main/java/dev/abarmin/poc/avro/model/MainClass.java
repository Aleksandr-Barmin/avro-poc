package dev.abarmin.poc.avro.model;

import java.util.List;
import java.util.UUID;

public class MainClass {
    public static void main(String[] args) {
        final Applicant applicant = Applicant.newBuilder()
                .setApplicantId(UUID.randomUUID().toString())
                .setPerson(Person.newBuilder()
                        .setPersonId(UUID.randomUUID().toString())
                        .setPersonName(PersonName.newBuilder()
//                                .setNamePrefixDescription("MR")
                                .setLastName("Test Last Name")
                                .setMiddleName("Test Middle Name")
                                .setGivenName("Test Given Name")
                                .setAliases(List.of(
                                        "Alias 1",
                                        "Alias 2",
                                        "Alias 3"
                                ))
                                .build())
                        .build())
                .setContactPoint(ContactPoint.newBuilder()
                        .setPostalAddress(PostalAddress.newBuilder()
                                .setAddressId(UUID.randomUUID().toString())
                                .setAddressTypeCode("Address type")
                                .build())
                        .build())
                .build();

        System.out.println(applicant);
    }
}
