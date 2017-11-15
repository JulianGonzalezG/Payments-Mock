package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AccountOwners;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T15:17:16.485Z")

public class Account   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("iban")
  private String iban = null;

  @JsonProperty("balance")
  private Integer balance = null;

  @JsonProperty("currency")
  private String currency = null;

  /**
   * Account type
   */
  public enum TypeEnum {
    MACC("MACC"),
    
    OTHER("OTHER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("owners")
  private List<AccountOwners> owners = new ArrayList<AccountOwners>();

  public Account id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Object identifier
   * @return id
  **/
  @ApiModelProperty(example = "123456789", required = true, value = "Object identifier")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Account iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * Account IBAN number
   * @return iban
  **/
  @ApiModelProperty(example = "AD120001203020035910xxxx", required = true, value = "Account IBAN number")
  @NotNull


  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Account balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Current account balance
   * @return balance
  **/
  @ApiModelProperty(example = "100.03", required = true, value = "Current account balance")
  @NotNull


  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Account currency (ISO 4217)
   * @return currency
  **/
  @ApiModelProperty(example = "EUR", required = true, value = "Account currency (ISO 4217)")
  @NotNull

 @Size(min=3,max=3)
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Account type
   * @return type
  **/
  @ApiModelProperty(example = "MACC", required = true, value = "Account type")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Account owners(List<AccountOwners> owners) {
    this.owners = owners;
    return this;
  }

  public Account addOwnersItem(AccountOwners ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Get owners
   * @return owners
  **/
  @ApiModelProperty(example = "[{\"id\":3369985,\"name\":\"Joan Manyoc Sans\"},{\"id\":4552399,\"name\":\"Esther Manyoc Viladecans\"}]", required = true, value = "")
  @NotNull

  @Valid

  public List<AccountOwners> getOwners() {
    return owners;
  }

  public void setOwners(List<AccountOwners> owners) {
    this.owners = owners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
        Objects.equals(this.iban, account.iban) &&
        Objects.equals(this.balance, account.balance) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.type, account.type) &&
        Objects.equals(this.owners, account.owners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iban, balance, currency, type, owners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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

