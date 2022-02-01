package org.example.entity.typeApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeApplication {
    private  int idTypeApplication;
    private String nameTypeApplication;

    @Override
    public String toString() {
        return "TypeApplication{" +
                "idTypeApplication=" + idTypeApplication +
                ", nameTypeApplication='" + nameTypeApplication + '\'' +
                '}';
    }
}
