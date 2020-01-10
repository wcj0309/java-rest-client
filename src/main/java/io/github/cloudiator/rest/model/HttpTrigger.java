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


package io.github.cloudiator.rest.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.cloudiator.rest.model.HttpTriggerAllOf;
import io.github.cloudiator.rest.model.Trigger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Subtype of Trigger. Represents a HTTP request which will trigger a function. 
 */
@ApiModel(description = "Subtype of Trigger. Represents a HTTP request which will trigger a function. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-10T15:38:08.423+01:00[Europe/Berlin]")
public class HttpTrigger extends Trigger implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HTTP_PATH = "httpPath";
  @SerializedName(SERIALIZED_NAME_HTTP_PATH)
  private String httpPath;

  public static final String SERIALIZED_NAME_HTTP_METHOD = "httpMethod";
  @SerializedName(SERIALIZED_NAME_HTTP_METHOD)
  private String httpMethod;


  public HttpTrigger httpPath(String httpPath) {
    
    this.httpPath = httpPath;
    return this;
  }

   /**
   * Get httpPath
   * @return httpPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHttpPath() {
    return httpPath;
  }


  public void setHttpPath(String httpPath) {
    this.httpPath = httpPath;
  }


  public HttpTrigger httpMethod(String httpMethod) {
    
    this.httpMethod = httpMethod;
    return this;
  }

   /**
   * Get httpMethod
   * @return httpMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHttpMethod() {
    return httpMethod;
  }


  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HttpTrigger httpTrigger = (HttpTrigger) o;
    return Objects.equals(this.httpPath, httpTrigger.httpPath) &&
        Objects.equals(this.httpMethod, httpTrigger.httpMethod) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(httpPath, httpMethod, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HttpTrigger {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    httpPath: ").append(toIndentedString(httpPath)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
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

