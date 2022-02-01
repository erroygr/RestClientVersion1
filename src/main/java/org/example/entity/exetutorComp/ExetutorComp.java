package org.example.entity.exetutorComp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.contractorCompany.ContractorCompany;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExetutorComp {

    private int idExetutorComp;
    private ContractorCompany idIdCompanyCompany;
    private String firstNameExetutorComp;
    private String lastNameExetutorComp;
    private String patronymicExetutorComp;
    private String companyPost;
    private String telephoneComp;

    @Override
    public String toString() {
        return "ExetutorComp{" +
                "idExetutorComp=" + idExetutorComp +
                ", idIdCompanyCompany=" + idIdCompanyCompany +
                ", firstNameExetutorComp='" + firstNameExetutorComp + '\'' +
                ", lastNameExetutorComp='" + lastNameExetutorComp + '\'' +
                ", patronymicExetutorComp='" + patronymicExetutorComp + '\'' +
                ", companyPost='" + companyPost + '\'' +
                ", telephoneComp='" + telephoneComp + '\'' +
                '}';
    }
}
