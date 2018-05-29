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
import io.github.cloudiator.rest.model.Error;
import io.github.cloudiator.rest.model.Node;
import io.github.cloudiator.rest.model.NodeGroup;
import io.github.cloudiator.rest.model.NodeRequirements;
import io.github.cloudiator.rest.model.Queue;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NodeApi
 */
@Ignore
public class NodeApiTest {

    private final NodeApi api = new NodeApi();

    
    /**
     * 
     *
     * Create a new node request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNodeTest() throws ApiException {
        NodeRequirements nodeRequirements = null;
        Queue response = api.addNode(nodeRequirements);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns all node groups for the current user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findNodeGroupsTest() throws ApiException {
        List<NodeGroup> response = api.findNodeGroups();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve all nodes the current user has access to
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findNodesTest() throws ApiException {
        List<Node> response = api.findNodes();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves the node with the given id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeTest() throws ApiException {
        String id = null;
        Node response = api.getNode(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves a node group, which groups multiple nodes that were create during one request
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNodeGroupTest() throws ApiException {
        String id = null;
        NodeGroup response = api.getNodeGroup(id);

        // TODO: test validations
    }
    
}
