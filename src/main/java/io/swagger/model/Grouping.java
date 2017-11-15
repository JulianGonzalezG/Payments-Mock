package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Account;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Grouping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-15T15:17:16.485Z")

public class Grouping   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("accounts")
  private List<Account> accounts = null;

  public Grouping id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Grouping identifier
   * @return id
  **/
  @ApiModelProperty(example = "365214786", required = true, value = "Grouping identifier")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Grouping description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Grouping alias
   * @return description
  **/
  @ApiModelProperty(example = "JOAN MANYOC / ESTHER MANYOC", value = "Grouping alias")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Grouping accounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  public Grouping addAccountsItem(Account accountsItem) {
    if (this.accounts == null) {
      this.accounts = new ArrayList<Account>();
    }
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * Accounts for this grouping
   * @return accounts
  **/
  @ApiModelProperty(value = "Accounts for this grouping")

  @Valid

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Grouping grouping = (Grouping) o;
    return Objects.equals(this.id, grouping.id) &&
        Objects.equals(this.description, grouping.description) &&
        Objects.equals(this.accounts, grouping.accounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, accounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Grouping {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

