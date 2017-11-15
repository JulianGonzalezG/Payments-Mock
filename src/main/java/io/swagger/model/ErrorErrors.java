package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorErrors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T15:17:16.485Z")

public class ErrorErrors   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("message")
  private String message = null;

  public ErrorErrors code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Error identifier
   * @return code
  **/
  @ApiModelProperty(example = "NF404", required = true, value = "Error identifier")
  @NotNull


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorErrors field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Field from request that caused the error
   * @return field
  **/
  @ApiModelProperty(example = "orderId", value = "Field from request that caused the error")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ErrorErrors message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Details about field error
   * @return message
  **/
  @ApiModelProperty(example = "Order not found", required = true, value = "Details about field error")
  @NotNull


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorErrors errorErrors = (ErrorErrors) o;
    return Objects.equals(this.code, errorErrors.code) &&
        Objects.equals(this.field, errorErrors.field) &&
        Objects.equals(this.message, errorErrors.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorErrors {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

