package dev.lfsoutello.simpleservicetemplate;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
public abstract class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private UUID externalId;
}
