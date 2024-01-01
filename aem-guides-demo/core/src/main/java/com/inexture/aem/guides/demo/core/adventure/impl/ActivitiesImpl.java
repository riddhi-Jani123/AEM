package com.inexture.aem.guides.demo.core.adventure.impl;

import com.inexture.aem.guides.demo.core.adventure.Activities;
import org.osgi.service.component.annotations.Component;

import java.util.Random;

@Component(
        service = {Activities.class}
)
public class ActivitiesImpl implements Activities {

    private static final String[] ACTIVITIES = new String[] {
            "Camping", "Skiing",  "Skateboarding"
    };

    private final Random random = new Random();

    @Override
    public String randomGenerate() {
        int randomIndex = random.nextInt(ACTIVITIES.length);
        return ACTIVITIES[randomIndex];
    }
}
