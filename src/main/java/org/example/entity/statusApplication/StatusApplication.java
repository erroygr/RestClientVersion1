package org.example.entity.statusApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusApplication {

    private  int idStatusApplication;
    private String nameStatusApplication;

    @Override
    public String toString() {
        return "StatusApplication{" +
                "idStatusApplication=" + idStatusApplication +
                ", nameStatusApplication='" + nameStatusApplication + '\'' +
                '}';
    }
}
