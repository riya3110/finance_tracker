package com.expense.service.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Expense {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "external_id")
    private String externalId;

    @Column(name = "user_id")
    private String userId;

    @Column(name="amount")
    private BigDecimal amount;

    @Column(name = "currency")
    private String currency;

    @Column(name = "merchant")
    private String merchant;

    @JsonProperty(value = "created_at")
    private Timestamp createdAt;

    @PrePersist
    @PreUpdate
    private void generateExternalId(){
        if(this.externalId == null){
            this.externalId = UUID.randomUUID().toString();
        }
    }
}
