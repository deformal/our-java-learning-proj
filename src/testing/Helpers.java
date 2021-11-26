package testing;

import java.util.HashMap;

enum VehicleTypes {
    CAR,
    TRUCK,
    BICYCLE,
    MOTORCYCLE,
    BOAT
}

interface NotDisabledMen {
    Boolean disabled = false;
    String gender = "male";

    String isDisabled();
}

interface NotDisabledWomen {
    Boolean disabled = false;
    String gender = "female";

    String isDisabled();
}

class Men implements NotDisabledMen {
    private final String firstname;
    private final String lastname;
    private final Integer age;

    public Men(String firstname, String lastname, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String isDisabled() {
        return String.valueOf(this.disabled);
    }

    protected HashMap<String, String> displayDetails() {
        HashMap<String, String> personDetails = new HashMap<>();
        personDetails.put("firstname", this.firstname);
        personDetails.put("lastname", this.lastname);
        personDetails.put("age", this.age.toString());
        personDetails.put("gender", this.gender);
        personDetails.put("disabled", String.valueOf(this.disabled));
        return personDetails;
    }
}

abstract class Vehicles {
    private Boolean isInWorkingCondition;

    public abstract HashMap<String, String> vehicleDetails();
}

class Car extends Vehicles {
    private final Boolean isInWorkingCondition;
    private final String modelName;
    private final String year;

    public Car(String modelName, Boolean working, String year) {
        this.isInWorkingCondition = working;
        this.modelName = modelName;
        this.year = year;
    }

    public HashMap<String, String> vehicleDetails() {
        HashMap<String, String> details = new HashMap<>();
        details.put("model_Name", this.modelName);
        details.put("year", this.year);
        details.put("is_working", String.valueOf(this.isInWorkingCondition));
        return details;
    }
}
