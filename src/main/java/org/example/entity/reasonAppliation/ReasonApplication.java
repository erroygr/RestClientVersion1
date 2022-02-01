package org.example.entity.reasonAppliation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReasonApplication {

    private  int idReasonApplication;
    private String nameReasonApplication;

    @Override
    public String toString() {
        return "ReasonApplication{" +
                "idReasonApplication=" + idReasonApplication +
                ", nameReasonApplication='" + nameReasonApplication + '\'' +
                '}';
    }
}
