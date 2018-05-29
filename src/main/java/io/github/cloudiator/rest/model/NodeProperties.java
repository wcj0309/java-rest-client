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
import io.github.cloudiator.rest.model.GeoLocation;
import io.github.cloudiator.rest.model.OperatingSystem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * attributes defining a node
 */
@ApiModel(description = "attributes defining a node")

public class NodeProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("numberOfCores")
  private Integer numberOfCores = null;

  @SerializedName("memory")
  private Long memory = null;

  @SerializedName("disk")
  private Float disk = null;

  @SerializedName("operatingSystem")
  private OperatingSystem operatingSystem = null;

  @SerializedName("geoLocation")
  private GeoLocation geoLocation = null;

  public NodeProperties numberOfCores(Integer numberOfCores) {
    this.numberOfCores = numberOfCores;
    return this;
  }

   /**
   * Get numberOfCores
   * @return numberOfCores
  **/
  @ApiModelProperty(value = "")
  public Integer getNumberOfCores() {
    return numberOfCores;
  }

  public void setNumberOfCores(Integer numberOfCores) {
    this.numberOfCores = numberOfCores;
  }

  public NodeProperties memory(Long memory) {
    this.memory = memory;
    return this;
  }

   /**
   * Get memory
   * @return memory
  **/
  @ApiModelProperty(value = "")
  public Long getMemory() {
    return memory;
  }

  public void setMemory(Long memory) {
    this.memory = memory;
  }

  public NodeProperties disk(Float disk) {
    this.disk = disk;
    return this;
  }

   /**
   * Get disk
   * @return disk
  **/
  @ApiModelProperty(value = "")
  public Float getDisk() {
    return disk;
  }

  public void setDisk(Float disk) {
    this.disk = disk;
  }

  public NodeProperties operatingSystem(OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

   /**
   * Get operatingSystem
   * @return operatingSystem
  **/
  @ApiModelProperty(value = "")
  public OperatingSystem getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(OperatingSystem operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public NodeProperties geoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
    return this;
  }

   /**
   * Get geoLocation
   * @return geoLocation
  **/
  @ApiModelProperty(value = "")
  public GeoLocation getGeoLocation() {
    return geoLocation;
  }

  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeProperties nodeProperties = (NodeProperties) o;
    return Objects.equals(this.numberOfCores, nodeProperties.numberOfCores) &&
        Objects.equals(this.memory, nodeProperties.memory) &&
        Objects.equals(this.disk, nodeProperties.disk) &&
        Objects.equals(this.operatingSystem, nodeProperties.operatingSystem) &&
        Objects.equals(this.geoLocation, nodeProperties.geoLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfCores, memory, disk, operatingSystem, geoLocation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeProperties {\n");
    
    sb.append("    numberOfCores: ").append(toIndentedString(numberOfCores)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
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

