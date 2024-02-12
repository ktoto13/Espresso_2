package ru.kkuzmichev.simpleappforespresso;


import androidx.test.espresso.idling.CountingIdlingResource;

public class EspressoIdlingResources {
    private static final String RESOURCE = "Global";
    public static CountingIdlingResource idlingResource = new CountingIdlingResource(RESOURCE);

}