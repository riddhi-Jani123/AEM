package com.inexture.aem.guides.demo.core.services.impl;

import com.inexture.aem.guides.demo.core.services.OsgiService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = OsgiService.class)
public class OsgiServiceImpl implements OsgiService {

    Logger log = LoggerFactory.getLogger(OsgiServiceImpl.class);

    @Override
    public String getName() {
        return OsgiServiceImpl.class.getName();
    }

    @Activate
    @Modified
    protected void activate() {
        log.info("Activating Osgi Service");
    }

}
