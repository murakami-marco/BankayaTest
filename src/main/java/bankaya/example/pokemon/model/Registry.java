package bankaya.example.pokemon.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registry")
public class Registry {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String ip;

  @Column
  private Date requestDate;

  @Column
  private String method;

  public Registry() {
  }
  
  public Registry(String ip, Date requestDate, String method) {
    this.ip = ip;
    this.requestDate = requestDate;
    this.method = method;
  }

  public String getIp() {
    return this.ip;
  }

  public Date getRequestDate() {
    return this.requestDate;
  }

  public String getMethod() {
    return this.method;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public void setRequestDate(Date requestDate) {
    this.requestDate = requestDate;
  }

  public void setMethod(String method) {
    this.method = method;
  }
}
