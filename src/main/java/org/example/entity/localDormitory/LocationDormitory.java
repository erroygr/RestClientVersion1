package org.example.entity.localDormitory;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationDormitory {
    private  int idLocationDormitoryp;
    private String streetLoc;
    private String numHouseLoc;
    private String numFloorLoc;
    private String numRoomLoc;
    private String describtionLoc;

    @Override
    public String toString() {
        return "LocationDormitory{" +
                "idLocationDormitoryp=" + idLocationDormitoryp +
                ", streetLoc='" + streetLoc + '\'' +
                ", numHouseLoc='" + numHouseLoc + '\'' +
                ", numFloorLoc='" + numFloorLoc + '\'' +
                ", numRoomLoc='" + numRoomLoc + '\'' +
                ", describtionLoc='" + describtionLoc + '\'' +
                '}';
    }
}
