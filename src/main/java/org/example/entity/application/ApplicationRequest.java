package org.example.entity.application;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.citizen.Citizen;
import org.example.entity.exetutorComp.ExetutorComp;
import org.example.entity.kindApplication.KindApplication;
import org.example.entity.localDormitory.LocationDormitory;
import org.example.entity.reasonAppliation.ReasonApplication;
import org.example.entity.statusApplication.StatusApplication;
import org.example.entity.typeApplication.TypeApplication;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationRequest {

    private  int idApplication;
    private Citizen idCitizen;
    private ExetutorComp exetutorComp;
    private TypeApplication typeApplication;
    private KindApplication kindApplication;
    private StatusApplication statusApplication;
    private LocationDormitory locationDormitory;
    private String describtionApplication;
    private Date dateStart;
    private Date dateFinish;
    private ReasonApplication reasonApplication;

    @Override
    public String toString() {
        return "ApplicationRequest{" +
                "idApplication=" + idApplication +
                ", idCitizen=" + idCitizen.toString() +
                ", exetutorComp=" + exetutorComp.toString() +
                ", typeApplication=" + typeApplication.toString() +
                ", kindApplication=" + kindApplication.toString() +
                ", statusApplication=" + statusApplication.toString() +
                ", locationDormitory=" + locationDormitory.toString() +
                ", describtionApplication='" + describtionApplication +
                ", dateStart=" + dateStart +
                ", dateFinish=" + dateFinish +
                ", reasonApplication=" + reasonApplication.toString() +
                '}';
    }
}
