CREATE TABLE TypePoste(
   id_type_poste VARCHAR(255) ,
   val VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_type_poste)
);

CREATE TABLE Bilan(
   id_bilan VARCHAR(255) ,
   date_bilan DATE NOT NULL,
   exercice INTEGER NOT NULL,
   total_actif NUMERIC(15,2)   NOT NULL,
   total_passif NUMERIC(15,2)   NOT NULL,
   PRIMARY KEY(id_bilan)
);

CREATE TABLE PosteMere(
   id_poste_mere VARCHAR(255) ,
   nom VARCHAR(255)  NOT NULL,
   id_type_poste VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_mere),
   FOREIGN KEY(id_type_poste) REFERENCES TypePoste(id_type_poste)
);

CREATE TABLE PosteBilan(
   id_poste_bilan VARCHAR(255) ,
   montant NUMERIC(15,2)   NOT NULL,
   id_bilan VARCHAR(255)  NOT NULL,
   id_poste_mere VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_bilan),
   FOREIGN KEY(id_bilan) REFERENCES Bilan(id_bilan),
   FOREIGN KEY(id_poste_mere) REFERENCES PosteMere(id_poste_mere)
);

CREATE TABLE PosteFille(
   id_poste_fille VARCHAR(255) ,
   nom VARCHAR(255)  NOT NULL,
   compte INTEGER NOT NULL,
   classe INTEGER NOT NULL,
   id_poste_mere VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_fille),
   FOREIGN KEY(id_poste_mere) REFERENCES PosteMere(id_poste_mere)
);

CREATE TABLE PosteBilanDetails(
   id_poste_bilan_details VARCHAR(255) ,
   montant NUMERIC(15,2)   NOT NULL,
   id_poste_bilan VARCHAR(255)  NOT NULL,
   id_poste_fille VARCHAR(255)  NOT NULL,
   id_bilan VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_bilan_details),
   FOREIGN KEY(id_poste_bilan) REFERENCES PosteBilan(id_poste_bilan),
   FOREIGN KEY(id_poste_fille) REFERENCES PosteFille(id_poste_fille),
   FOREIGN KEY(id_bilan) REFERENCES Bilan(id_bilan)
);
