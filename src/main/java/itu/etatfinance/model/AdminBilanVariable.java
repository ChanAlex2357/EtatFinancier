package itu.etatfinance.model;

import lombok.Data;

@Data
public class AdminBilanVariable {
    PosteBilanVariable bilanActif;
    PosteBilanVariable bilanPassif;
    PosteBilanVariable bilanResultat;
}
