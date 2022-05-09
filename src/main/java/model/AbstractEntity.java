package model;

import java.io.Serializable;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.Instant;

import lombok.Data;
import java.math.BigDecimal;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
@MappedSuperclass
@EntityListeners (AuditingEntityListener.class)
public class AbstractEntity implements Serializable {
	
	@Id 
	@GeneratedValue
	private Integer id;
	
	@CreatedDate
	@JsonIgnore
	private Instant creationDate;
	
    @LastModifiedDate
    @JsonIgnore
	private Instant lastModifiedDate;
}
