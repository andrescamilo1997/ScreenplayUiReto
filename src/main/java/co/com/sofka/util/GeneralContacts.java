package co.com.sofka.util;

import co.com.sofka.models.automationpractice.AutomationPracticeModel;
import com.github.javafaker.Faker;

public class GeneralContacts {

    private static AutomationPracticeModel automationPracticeModel;
    private static Faker faker;
    private static String firstName;
    private static String lastName;
    private static String title;
    private static String password;
    private static String dayOfBrith;
    private static String monthOfBirth;
    private static String yearOfBirth;
    private static String checkNewsLetter;
    private static String receiveSpecialOffers;
    private static String company;
    private static String address;
    private static String addressL2;
    private static String city;
    private static String state;
    private static String zipPostalCode;
    private static String country;
    private static String additionalInformation;
    private static String homePhone;
    private static String mobilePhone;
    private static String email;
    private static String orderReference;
    private static String Message;

    public static AutomationPracticeModel generalContacts(){
        faker = new Faker();
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        password = firstName + "12345";
        title = String.valueOf(faker.bool().bool());
        yearOfBirth = String.valueOf(faker.number().numberBetween(1900, 2022));
        monthOfBirth = String.valueOf(faker.number().numberBetween(1,12));
        if(monthOfBirth.contains("2")){
            dayOfBrith = String.valueOf(faker.number().numberBetween(1, 28));
        }else {
            dayOfBrith = String.valueOf(faker.number().numberBetween(1, 31));
        }
        checkNewsLetter = String.valueOf(faker.bool().bool());
        receiveSpecialOffers = String.valueOf(faker.bool().bool());
        email = firstName+lastName+yearOfBirth+"@gmail.com";
        company = String.valueOf(faker.company().name());
        address = faker.address().streetAddress();
        addressL2 = faker.address().secondaryAddress();
        city = faker.address().city();
        state = faker.address().state();
        String zipCode = faker.address().zipCode();
        zipPostalCode = zipCode.substring(0,5);
        country = "United States";
        additionalInformation = firstName + " " +lastName;
        homePhone = faker.phoneNumber().phoneNumber();
        mobilePhone = faker.phoneNumber().cellPhone();
        orderReference = "Discos" + faker.rockBand().name();
        Message = "Cordial Saludo, me gustaria tener mayor informaciòn sobre: " + orderReference + "Gracias por su atenciòn" ;


        automationPracticeModel = new AutomationPracticeModel();
        automationPracticeModel.setFirstName            (firstName            );
        automationPracticeModel.setLastName             (lastName             );
        automationPracticeModel.setPassword             (password             );
        automationPracticeModel.setTitle                (title                );
        automationPracticeModel.setDayOfBrith           (dayOfBrith           );
        automationPracticeModel.setMonthOfBirth         (monthOfBirth         );
        automationPracticeModel.setYearOfBirth          (yearOfBirth          );
        automationPracticeModel.setCheckNewsLetter      (checkNewsLetter      );
        automationPracticeModel.setReceiveSpecialOffers (receiveSpecialOffers );
        automationPracticeModel.setCompany              (company              );
        automationPracticeModel.setAddress              (address              );
        automationPracticeModel.setAddressL2            (addressL2            );
        automationPracticeModel.setCity                 (city                 );
        automationPracticeModel.setState                (state                );
        automationPracticeModel.setZipPostalCode        (zipPostalCode        );
        automationPracticeModel.setCountry              (country              );
        automationPracticeModel.setAdditionalInformation(additionalInformation);
        automationPracticeModel.setHomePhone            (homePhone            );
        automationPracticeModel.setMobilePhone          (mobilePhone          );
        automationPracticeModel.setEmail                (email                );
        automationPracticeModel.setOrderReference       (orderReference       );
        automationPracticeModel.setMessage              (Message              );

        return automationPracticeModel;
    }


}
