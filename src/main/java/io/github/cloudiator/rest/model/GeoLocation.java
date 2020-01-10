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
 * Part of Location Represents a geographical location 
 */
@ApiModel(description = "Part of Location Represents a geographical location ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-10T15:38:08.423+01:00[Europe/Berlin]")
public class GeoLocation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private Double latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private Double longitude;


  public GeoLocation city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City of the location
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "City of the location")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public GeoLocation country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * An ISO 3166-1 alpha-2 country code
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An ISO 3166-1 alpha-2 country code")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public GeoLocation latitude(Double latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * Latitude of the location in decimal degrees
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Latitude of the location in decimal degrees")

  public Double getLatitude() {
    return latitude;
  }


  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public GeoLocation longitude(Double longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * Longitude of the location in decimal degrees
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Longitude of the location in decimal degrees")

  public Double getLongitude() {
    return longitude;
  }


  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoLocation geoLocation = (GeoLocation) o;
    return Objects.equals(this.city, geoLocation.city) &&
        Objects.equals(this.country, geoLocation.country) &&
        Objects.equals(this.latitude, geoLocation.latitude) &&
        Objects.equals(this.longitude, geoLocation.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoLocation {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

