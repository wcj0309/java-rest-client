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


package io.github.cloudiator.rest.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.cloudiator.rest.model.CloudiatorProcess;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * SingleProcess
 */

public class SingleProcess extends CloudiatorProcess implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("node")
  private String node = null;

  public SingleProcess node(String node) {
    this.node = node;
    return this;
  }

   /**
   * The id of the node this process is hosted on.
   * @return node
  **/
  @ApiModelProperty(value = "The id of the node this process is hosted on.")
  public String getNode() {
    return node;
  }

  public void setNode(String node) {
    this.node = node;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleProcess singleProcess = (SingleProcess) o;
    return Objects.equals(this.node, singleProcess.node) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(node, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleProcess {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

