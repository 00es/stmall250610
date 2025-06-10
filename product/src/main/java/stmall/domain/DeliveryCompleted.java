package stmall.domain;

import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCompleted extends AbstractEvent {

    private Long id;
    private String orderid;
    private String customerid;
    private String itemid;
    private Integer quantity;
    private String address;
}
