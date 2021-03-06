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

import io.github.cloudiator.rest.ApiCallback;
import io.github.cloudiator.rest.ApiClient;
import io.github.cloudiator.rest.ApiException;
import io.github.cloudiator.rest.ApiResponse;
import io.github.cloudiator.rest.Configuration;
import io.github.cloudiator.rest.Pair;
import io.github.cloudiator.rest.ProgressRequestBody;
import io.github.cloudiator.rest.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.Queue;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueueApi {
    private ApiClient localVarApiClient;

    public QueueApi() {
        this(Configuration.getDefaultApiClient());
    }

    public QueueApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for findQueuedTask
     * @param id Unique identifier of the resource (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findQueuedTaskCall(String id, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/queue/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "code", "message", 
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call findQueuedTaskValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling findQueuedTask(Async)");
        }
        

        okhttp3.Call localVarCall = findQueuedTaskCall(id, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns the queued task with the given id. 
     * @param id Unique identifier of the resource (required)
     * @return Queue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public Queue findQueuedTask(String id) throws ApiException {
        ApiResponse<Queue> localVarResp = findQueuedTaskWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns the queued task with the given id. 
     * @param id Unique identifier of the resource (required)
     * @return ApiResponse&lt;Queue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Queue> findQueuedTaskWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = findQueuedTaskValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns the queued task with the given id. 
     * @param id Unique identifier of the resource (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findQueuedTaskAsync(String id, final ApiCallback<Queue> _callback) throws ApiException {

        okhttp3.Call localVarCall = findQueuedTaskValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<Queue>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getQueuedTasks
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getQueuedTasksCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/queue";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json", "code", "message", 
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getQueuedTasksValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getQueuedTasksCall(_callback);
        return localVarCall;

    }

    /**
     * 
     * Returns all running queued tasks visible to the user 
     * @return List&lt;Queue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public List<Queue> getQueuedTasks() throws ApiException {
        ApiResponse<List<Queue>> localVarResp = getQueuedTasksWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * 
     * Returns all running queued tasks visible to the user 
     * @return ApiResponse&lt;List&lt;Queue&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<Queue>> getQueuedTasksWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getQueuedTasksValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<Queue>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns all running queued tasks visible to the user 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization for this action is missing </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden action </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> An unexpected Error occured </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> Server temporary not available </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getQueuedTasksAsync(final ApiCallback<List<Queue>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getQueuedTasksValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<Queue>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
