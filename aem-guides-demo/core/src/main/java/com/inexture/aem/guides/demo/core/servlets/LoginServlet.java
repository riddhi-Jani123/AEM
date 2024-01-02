package com.inexture.aem.guides.demo.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes="demo/components/login",
        selectors = "login",
        methods= {HttpConstants.METHOD_POST,HttpConstants.METHOD_GET},
        extensions="json"
)
public class LoginServlet extends SlingAllMethodsServlet {

    public static final Logger LOGGER = LoggerFactory.getLogger(LoginServlet.class);

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {

        LOGGER.info("inside get ");

        final Resource resource = req.getResource();
        resp.setContentType("text/plain");
        resp.getWriter().write("login component");

    }

    @Override
    protected void doPost(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {


        LOGGER.info("inside post ");

        // Retrieve form parameters
        String title = req.getParameter("title");
        String text = req.getParameter("text");
        LOGGER.info("title "+title);
        LOGGER.info("text "+text);

        // Perform any processing with the form data

        // Set JSON response
        resp.setContentType("application/json");
        resp.getWriter().write("{\"status\": \"success\", \"message\": \"Form submitted successfully\"}");

    }
}
