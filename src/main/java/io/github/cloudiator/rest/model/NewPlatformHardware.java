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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Represents a hardware configuration for a Platform (not all attributes might be supported for all PaaS providers) 
 */
@ApiModel(description = "Represents a hardware configuration for a Platform (not all attributes might be supported for all PaaS providers) ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-10T15:38:08.423+01:00[Europe/Berlin]")
public class NewPlatformHardware implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CORES = "cores";
  @SerializedName(SERIALIZED_NAME_CORES)
  private Integer cores;

  public static final String SERIALIZED_NAME_RAM = "ram";
  @SerializedName(SERIALIZED_NAME_RAM)
  private Long ram;

  public static final String SERIALIZED_NAME_DISK = "disk";
  @SerializedName(SERIALIZED_NAME_DISK)
  private Float disk;


  public NewPlatformHardware name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Human-readable name for the hardware
   * @return name
  **/
  @ApiModelProperty(example = "example.p1", required = true, value = "Human-readable name for the hardware")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public NewPlatformHardware cores(Integer cores) {
    
    this.cores = cores;
    return this;
  }

   /**
   * Number of cores
   * @return cores
  **/
  @ApiModelProperty(example = "16", required = true, value = "Number of cores")

  public Integer getCores() {
    return cores;
  }


  public void setCores(Integer cores) {
    this.cores = cores;
  }


  public NewPlatformHardware ram(Long ram) {
    
    this.ram = ram;
    return this;
  }

   /**
   * Amount of RAM
   * @return ram
  **/
  @ApiModelProperty(example = "2048", required = true, value = "Amount of RAM")

  public Long getRam() {
    return ram;
  }


  public void setRam(Long ram) {
    this.ram = ram;
  }


  public NewPlatformHardware disk(Float disk) {
    
    this.disk = disk;
    return this;
  }

   /**
   * Amount of disk space
   * @return disk
  **/
  @ApiModelProperty(example = "100.0", required = true, value = "Amount of disk space")

  public Float getDisk() {
    return disk;
  }


  public void setDisk(Float disk) {
    this.disk = disk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewPlatformHardware newPlatformHardware = (NewPlatformHardware) o;
    return Objects.equals(this.name, newPlatformHardware.name) &&
        Objects.equals(this.cores, newPlatformHardware.cores) &&
        Objects.equals(this.ram, newPlatformHardware.ram) &&
        Objects.equals(this.disk, newPlatformHardware.disk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cores, ram, disk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewPlatformHardware {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cores: ").append(toIndentedString(cores)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
    sb.append("    disk: ").append(toIndentedString(disk)).append("\n");
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

