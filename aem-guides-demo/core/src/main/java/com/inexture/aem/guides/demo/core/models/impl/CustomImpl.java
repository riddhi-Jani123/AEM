package com.inexture.aem.guides.demo.core.models.impl;

import com.inexture.aem.guides.demo.core.models.Custom;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.api.resource.Resource;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;
@Model(
        adaptables = {Resource.class},
        resourceType = {CustomImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CustomImpl implements Custom {
    protected static final String RESOURCE_TYPE = "demo/components/custom";

    @ValueMapValue
    private List<String> occupations;

    @ValueMapValue
    private String name;

    @Override
    public List<String> getOccupations() {
        if(null == occupations)
            return Collections.emptyList();
        return occupations;
    }
    @PostConstruct
    private void init() {
        System.out.println("HELLO");
    }

    @Override
    public String getName() {
        return name;
    }
}
