package org.example.entity.kindApplication;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KindApplication {
    private  int idKindApplication;
    private String nameKindApplication;

    @Override
    public String toString() {
        return "KindApplication{" +
                "idKindApplication=" + idKindApplication +
                ", nameKindApplication='" + nameKindApplication + '\'' +
                '}';
    }
}
