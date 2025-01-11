CREATE TABLE type_poste(
   id_type_poste VARCHAR(255) ,
   val VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_type_poste)
);

CREATE TABLE bilan(
   id_bilan VARCHAR(255) ,
   date_bilan DATE NOT NULL,
   exercice INTEGER NOT NULL,
   total_actif NUMERIC(15,2)   NOT NULL,
   total_passif NUMERIC(15,2)   NOT NULL,
   PRIMARY KEY(id_bilan)
);

CREATE TABLE poste_mere(
   id_poste_mere VARCHAR(255) ,
   nom VARCHAR(255)  NOT NULL,
   id_type_poste VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_mere),
   FOREIGN KEY(id_type_poste) REFERENCES type_poste(id_type_poste)
);

CREATE TABLE poste_bilan(
   id_poste_bilan VARCHAR(255) ,
   montant NUMERIC(15,2)   NOT NULL,
   id_bilan VARCHAR(255)  NOT NULL,
   id_poste_mere VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_bilan),
   FOREIGN KEY(id_bilan) REFERENCES bilan(id_bilan),
   FOREIGN KEY(id_poste_mere) REFERENCES poste_mere(id_poste_mere)
);

CREATE TABLE poste_fille(
   id_poste_fille VARCHAR(255) ,
   nom VARCHAR(255)  NOT NULL,
   compte INTEGER NOT NULL,
   classe INTEGER NOT NULL,
   id_fille_mere VARCHAR(255) ,
   id_poste_mere VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_fille),
   FOREIGN KEY(id_fille_mere) REFERENCES poste_fille(id_poste_fille),
   FOREIGN KEY(id_poste_mere) REFERENCES poste_mere(id_poste_mere)
);

CREATE TABLE poste_bilan_details(
   id_poste_bilan_details VARCHAR(255) ,
   montant NUMERIC(15,2)   NOT NULL,
   id_poste_bilan VARCHAR(255)  NOT NULL,
   id_poste_fille VARCHAR(255)  NOT NULL,
   id_bilan VARCHAR(255)  NOT NULL,
   PRIMARY KEY(id_poste_bilan_details),
   FOREIGN KEY(id_poste_bilan) REFERENCES poste_bilan(id_poste_bilan),
   FOREIGN KEY(id_poste_fille) REFERENCES poste_fille(id_poste_fille),
   FOREIGN KEY(id_bilan) REFERENCES bilan(id_bilan)
);
