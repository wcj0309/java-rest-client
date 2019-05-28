/*
 * Cloudiator REST Api
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.model.Queue;
import io.github.cloudiator.rest.model.Scale;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScaleApi
 */
@Ignore
public class ScaleApiTest {

    private final ScaleApi api = new ScaleApi();

    
    /**
     * 
     *
     * Triggers a new scaling action 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void triggerScaleTest() throws ApiException {
        Scale scale = null;
        Queue response = api.triggerScale(scale);

        // TODO: test validations
    }
    
}