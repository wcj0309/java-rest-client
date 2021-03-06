/*
 * Cloudiator REST Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: daniel.baur@uni-ulm.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.cloudiator.rest.api;

import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.model.Login;
import io.github.cloudiator.rest.model.Tenant;
import io.github.cloudiator.rest.model.Token;
import io.github.cloudiator.rest.model.User;
import io.github.cloudiator.rest.model.UserNew;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Ignore
public class UserApiTest {

    private final UserApi api = new UserApi();

    
    /**
     * 
     *
     * Creates a new tenant 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTenantTest() throws ApiException {
        Tenant tenant = null;
        Tenant response = api.createTenant(tenant);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a new user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        UserNew user = null;
        User response = api.createUser(user);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Authenticates a user 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void loginTest() throws ApiException {
        Login login = null;
        Token response = api.login(login);

        // TODO: test validations
    }
    
}
