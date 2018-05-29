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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * A time interval consisting of unit and period
 */
@ApiModel(description = "A time interval consisting of unit and period")

public class Interval implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The unit of the interval
   */
  @JsonAdapter(UnitEnum.Adapter.class)
  public enum UnitEnum {
    DAYS("DAYS"),
    
    HOURS("HOURS"),
    
    MICROSECONDS("MICROSECONDS"),
    
    MILLISECONDS("MILLISECONDS"),
    
    MINUTES("MINUTES"),
    
    NANOSECONDS("NANOSECONDS"),
    
    SECONDS("SECONDS");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UnitEnum fromValue(String text) {
      for (UnitEnum b : UnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<UnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UnitEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return UnitEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("unit")
  private UnitEnum unit = null;

  @SerializedName("period")
  private Long period = null;

  public Interval unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of the interval
   * @return unit
  **/
  @ApiModelProperty(value = "The unit of the interval")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  public Interval period(Long period) {
    this.period = period;
    return this;
  }

   /**
   * The period of the interval
   * @return period
  **/
  @ApiModelProperty(value = "The period of the interval")
  public Long getPeriod() {
    return period;
  }

  public void setPeriod(Long period) {
    this.period = period;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Interval interval = (Interval) o;
    return Objects.equals(this.unit, interval.unit) &&
        Objects.equals(this.period, interval.period);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, period);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Interval {\n");
    
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
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

