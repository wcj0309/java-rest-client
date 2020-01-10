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
import io.github.cloudiator.rest.model.AttributeOptimizationAllOf;
import io.github.cloudiator.rest.model.Optimization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * Refers to the attribute that should be optimized
 */
@ApiModel(description = "Refers to the attribute that should be optimized")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-10T15:38:08.423+01:00[Europe/Berlin]")
public class AttributeOptimization extends Optimization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_OBJECTIVE_CLASS = "objectiveClass";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE_CLASS)
  private String objectiveClass;

  public static final String SERIALIZED_NAME_OBJECTIVE_ATTRIBUTE = "objectiveAttribute";
  @SerializedName(SERIALIZED_NAME_OBJECTIVE_ATTRIBUTE)
  private String objectiveAttribute;

  /**
   * Gets or Sets aggregation
   */
  @JsonAdapter(AggregationEnum.Adapter.class)
  public enum AggregationEnum {
    SUM("SUM"),
    
    AVG("AVG");

    private String value;

    AggregationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AggregationEnum fromValue(String value) {
      for (AggregationEnum b : AggregationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AggregationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AggregationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AggregationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AggregationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AGGREGATION = "aggregation";
  @SerializedName(SERIALIZED_NAME_AGGREGATION)
  private AggregationEnum aggregation;


  public AttributeOptimization objectiveClass(String objectiveClass) {
    
    this.objectiveClass = objectiveClass;
    return this;
  }

   /**
   * Get objectiveClass
   * @return objectiveClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectiveClass() {
    return objectiveClass;
  }


  public void setObjectiveClass(String objectiveClass) {
    this.objectiveClass = objectiveClass;
  }


  public AttributeOptimization objectiveAttribute(String objectiveAttribute) {
    
    this.objectiveAttribute = objectiveAttribute;
    return this;
  }

   /**
   * Get objectiveAttribute
   * @return objectiveAttribute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getObjectiveAttribute() {
    return objectiveAttribute;
  }


  public void setObjectiveAttribute(String objectiveAttribute) {
    this.objectiveAttribute = objectiveAttribute;
  }


  public AttributeOptimization aggregation(AggregationEnum aggregation) {
    
    this.aggregation = aggregation;
    return this;
  }

   /**
   * Get aggregation
   * @return aggregation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AggregationEnum getAggregation() {
    return aggregation;
  }


  public void setAggregation(AggregationEnum aggregation) {
    this.aggregation = aggregation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttributeOptimization attributeOptimization = (AttributeOptimization) o;
    return Objects.equals(this.objectiveClass, attributeOptimization.objectiveClass) &&
        Objects.equals(this.objectiveAttribute, attributeOptimization.objectiveAttribute) &&
        Objects.equals(this.aggregation, attributeOptimization.aggregation) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectiveClass, objectiveAttribute, aggregation, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttributeOptimization {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    objectiveClass: ").append(toIndentedString(objectiveClass)).append("\n");
    sb.append("    objectiveAttribute: ").append(toIndentedString(objectiveAttribute)).append("\n");
    sb.append("    aggregation: ").append(toIndentedString(aggregation)).append("\n");
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

