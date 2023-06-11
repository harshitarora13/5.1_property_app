package com.example.propertyapp;

import java.util.ArrayList;
import java.util.Arrays;

public class Utils {

    public static ArrayList<Property> buildPropertyData() {
        Property p1 = new Property("img1","South Street A", "290 PW","2 Bedrooms","1 Carparks","1 Bathrooms");
        Property p2 = new Property("img2","South Street B", "390 PW","3 Bedrooms","2 Carparks","2 Bathrooms");
        Property p3 = new Property("img3","South Street C", "410 PW","4 Bedrooms","4 Carparks","2 Bathrooms");
        Property p4 = new Property("img4","South Street D", "610 PW","6 Bedrooms","5 Carparks","5 Bathrooms");
        Property p5 = new Property("img5","South Street E", "520 PW","5 Bedrooms","4 Carparks","4 Bathrooms");
        Property p6 = new Property("img6","Station Street A", "350 PW","3 Bedrooms","3 Carparks","3 Bathrooms");
        Property p7 = new Property("img7","Station Street B", "240 PW","2 Bedrooms","1 Carparks","2 Bathrooms");
        Property p8 = new Property("img8","Station Street C", "600 PW","5 Bedrooms","3 Carparks","4 Bathrooms");
        Property p9 = new Property("img9","Station Street D", "300 PW","2 Bedrooms","2 Carparks","2 Bathrooms");
        Property p10 = new Property("img10","Station Street E", "270 PW","1Bedrooms","1 Carparks","1 Bathrooms");

        return new ArrayList<>(Arrays.asList(p1, p2, p3,p4, p5, p6, p7,p8,p9,p10));
    }
}
