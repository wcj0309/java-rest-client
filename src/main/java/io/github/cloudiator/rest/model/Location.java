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
import io.github.cloudiator.rest.model.DiscoveryItemState;
import io.github.cloudiator.rest.model.GeoLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Repesents a (virtual) location offers by a cloud 
 */
@ApiModel(description = "Repesents a (virtual) location offers by a cloud ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-10T15:38:08.423+01:00[Europe/Berlin]")
public class Location implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROVIDER_ID = "providerId";
  @SerializedName(SERIALIZED_NAME_PROVIDER_ID)
  private String providerId;

  /**
   * Scope of the location
   */
  @JsonAdapter(LocationScopeEnum.Adapter.class)
  public enum LocationScopeEnum {
    PROVIDER("PROVIDER"),
    
    REGION("REGION"),
    
    ZONE("ZONE"),
    
    HOST("HOST");

    private String value;

    LocationScopeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LocationScopeEnum fromValue(String value) {
      for (LocationScopeEnum b : LocationScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LocationScopeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LocationScopeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LocationScopeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LocationScopeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LOCATION_SCOPE = "locationScope";
  @SerializedName(SERIALIZED_NAME_LOCATION_SCOPE)
  private LocationScopeEnum locationScope;

  public static final String SERIALIZED_NAME_IS_ASSIGNABLE = "isAssignable";
  @SerializedName(SERIALIZED_NAME_IS_ASSIGNABLE)
  private Boolean isAssignable;

  public static final String SERIALIZED_NAME_GEO_LOCATION = "geoLocation";
  @SerializedName(SERIALIZED_NAME_GEO_LOCATION)
  private GeoLocation geoLocation;

  public static final String SERIALIZED_NAME_PARENT = "parent";
  @SerializedName(SERIALIZED_NAME_PARENT)
  private Location parent;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private DiscoveryItemState state;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;


  public Location id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier
   * @return id
  **/
  @ApiModelProperty(example = "1a79a4d60de6718e8e5b326e338ae533/RegionOne", required = true, value = "Unique identifier")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Location name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Human-readable name
   * @return name
  **/
  @ApiModelProperty(example = "RegionOne", required = true, value = "Human-readable name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Location providerId(String providerId) {
    
    this.providerId = providerId;
    return this;
  }

   /**
   * Original id issued by the provider
   * @return providerId
  **/
  @ApiModelProperty(example = "RegionOne", required = true, value = "Original id issued by the provider")

  public String getProviderId() {
    return providerId;
  }


  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }


  public Location locationScope(LocationScopeEnum locationScope) {
    
    this.locationScope = locationScope;
    return this;
  }

   /**
   * Scope of the location
   * @return locationScope
  **/
  @ApiModelProperty(example = "ZONE", required = true, value = "Scope of the location")

  public LocationScopeEnum getLocationScope() {
    return locationScope;
  }


  public void setLocationScope(LocationScopeEnum locationScope) {
    this.locationScope = locationScope;
  }


  public Location isAssignable(Boolean isAssignable) {
    
    this.isAssignable = isAssignable;
    return this;
  }

   /**
   * True of the location can be used to start virtual machines, false if not
   * @return isAssignable
  **/
  @ApiModelProperty(example = "true", required = true, value = "True of the location can be used to start virtual machines, false if not")

  public Boolean getIsAssignable() {
    return isAssignable;
  }


  public void setIsAssignable(Boolean isAssignable) {
    this.isAssignable = isAssignable;
  }


  public Location geoLocation(GeoLocation geoLocation) {
    
    this.geoLocation = geoLocation;
    return this;
  }

   /**
   * Get geoLocation
   * @return geoLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeoLocation getGeoLocation() {
    return geoLocation;
  }


  public void setGeoLocation(GeoLocation geoLocation) {
    this.geoLocation = geoLocation;
  }


  public Location parent(Location parent) {
    
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location getParent() {
    return parent;
  }


  public void setParent(Location parent) {
    this.parent = parent;
  }


  public Location state(DiscoveryItemState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DiscoveryItemState getState() {
    return state;
  }


  public void setState(DiscoveryItemState state) {
    this.state = state;
  }


  public Location owner(String owner) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.id, location.id) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.providerId, location.providerId) &&
        Objects.equals(this.locationScope, location.locationScope) &&
        Objects.equals(this.isAssignable, location.isAssignable) &&
        Objects.equals(this.geoLocation, location.geoLocation) &&
        Objects.equals(this.parent, location.parent) &&
        Objects.equals(this.state, location.state) &&
        Objects.equals(this.owner, location.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, providerId, locationScope, isAssignable, geoLocation, parent, state, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    locationScope: ").append(toIndentedString(locationScope)).append("\n");
    sb.append("    isAssignable: ").append(toIndentedString(isAssignable)).append("\n");
    sb.append("    geoLocation: ").append(toIndentedString(geoLocation)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

