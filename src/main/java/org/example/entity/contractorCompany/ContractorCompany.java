package org.example.entity.contractorCompany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.entity.TipeActivity.TipeActivity;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractorCompany {

    private  int idCompany;
    private String companyName;
    private String describtion;
    private Date termContract;
    private TipeActivity idTipeActiv;
    private String telephoneComp;

}
