package org.example.entity.citizen;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Citizen {

    private  int idCitizen;
    private String firstNameCitizen;
    private String lastNameCitizen;
    private String patronymicCitizen;
    private Long studentIdNumber;
    private Date dateBitth;

    @Override
    public String toString() {
        return "Citizen{" +
                "idCitizen=" + idCitizen +
                ", firstNameCitizen='" + firstNameCitizen + '\'' +
                ", lastNameCitizen='" + lastNameCitizen + '\'' +
                ", patronymicCitizen='" + patronymicCitizen + '\'' +
                ", studentIdNumber=" + studentIdNumber +
                ", dateBitth=" + dateBitth +
                '}';
    }
}