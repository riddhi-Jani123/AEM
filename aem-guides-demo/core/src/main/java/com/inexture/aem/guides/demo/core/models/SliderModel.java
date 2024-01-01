package com.inexture.aem.guides.demo.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class SliderModel {
    @ValueMapValue
    private String text;
    @Inject
    private List<MultiFieldModel> field;

    public String getText() {
        return text.toUpperCase();
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<MultiFieldModel> getField() {
        return field;
    }

    public void setField(List<MultiFieldModel> field) {
        this.field = field;
    }
}
