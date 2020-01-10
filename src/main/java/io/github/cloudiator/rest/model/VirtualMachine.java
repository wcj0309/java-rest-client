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
import io.github.cloudiator.rest.model.Hardware;
import io.github.cloudiator.rest.model.Image;
import io.github.cloudiator.rest.model.IpAddress;
import io.github.cloudiator.rest.model.Location;
import io.github.cloudiator.rest.model.LoginCredential;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * VirtualMachine
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-10T15:38:08.423+01:00[Europe/Berlin]")
public class VirtualMachine implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private Image image;

  public static final String SERIALIZED_NAME_HARDWARE = "hardware";
  @SerializedName(SERIALIZED_NAME_HARDWARE)
  private Hardware hardware;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IPADDRESSES = "ipaddresses";
  @SerializedName(SERIALIZED_NAME_IPADDRESSES)
  private List<IpAddress> ipaddresses = null;

  public static final String SERIALIZED_NAME_LOGINCREDENTIAL = "logincredential";
  @SerializedName(SERIALIZED_NAME_LOGINCREDENTIAL)
  private LoginCredential logincredential;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    RUNNING("RUNNING"),
    
    ERROR("ERROR");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;


  public VirtualMachine image(Image image) {
    
    this.image = image;
    return this;
  }

   /**
   * Get image
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Image getImage() {
    return image;
  }


  public void setImage(Image image) {
    this.image = image;
  }


  public VirtualMachine hardware(Hardware hardware) {
    
    this.hardware = hardware;
    return this;
  }

   /**
   * Get hardware
   * @return hardware
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Hardware getHardware() {
    return hardware;
  }


  public void setHardware(Hardware hardware) {
    this.hardware = hardware;
  }


  public VirtualMachine location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public VirtualMachine id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1a79a4d60de6718e8e5b326e338ae5vm", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VirtualMachine ipaddresses(List<IpAddress> ipaddresses) {
    
    this.ipaddresses = ipaddresses;
    return this;
  }

  public VirtualMachine addIpaddressesItem(IpAddress ipaddressesItem) {
    if (this.ipaddresses == null) {
      this.ipaddresses = new ArrayList<IpAddress>();
    }
    this.ipaddresses.add(ipaddressesItem);
    return this;
  }

   /**
   * Get ipaddresses
   * @return ipaddresses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IpAddress> getIpaddresses() {
    return ipaddresses;
  }


  public void setIpaddresses(List<IpAddress> ipaddresses) {
    this.ipaddresses = ipaddresses;
  }


  public VirtualMachine logincredential(LoginCredential logincredential) {
    
    this.logincredential = logincredential;
    return this;
  }

   /**
   * Get logincredential
   * @return logincredential
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoginCredential getLogincredential() {
    return logincredential;
  }


  public void setLogincredential(LoginCredential logincredential) {
    this.logincredential = logincredential;
  }


  public VirtualMachine owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public VirtualMachine state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualMachine virtualMachine = (VirtualMachine) o;
    return Objects.equals(this.image, virtualMachine.image) &&
        Objects.equals(this.hardware, virtualMachine.hardware) &&
        Objects.equals(this.location, virtualMachine.location) &&
        Objects.equals(this.id, virtualMachine.id) &&
        Objects.equals(this.ipaddresses, virtualMachine.ipaddresses) &&
        Objects.equals(this.logincredential, virtualMachine.logincredential) &&
        Objects.equals(this.owner, virtualMachine.owner) &&
        Objects.equals(this.state, virtualMachine.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, hardware, location, id, ipaddresses, logincredential, owner, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualMachine {\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    hardware: ").append(toIndentedString(hardware)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ipaddresses: ").append(toIndentedString(ipaddresses)).append("\n");
    sb.append("    logincredential: ").append(toIndentedString(logincredential)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

