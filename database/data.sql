INSERT INTO type_poste (val) VALUES ('Actif');
INSERT INTO type_poste (val) VALUES ('Passif et capitaux propres');
INSERT INTO type_poste (val) VALUES ('Resultat');

-- Actif
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Actif non courants', 'TPO001');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Actif courants', 'TPO001');

-- Passif
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Passif non courants', 'TPO002');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Passif courants', 'TPO002');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Capitaux', 'TPO002');

-- Resultat
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('revenus', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('resultat net', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Produits financiers', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Charges financières', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Charges de personnel', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Impôts', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('taxes', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('versements assimilés', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Autres produits opérationnels', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Autres charges opérationnelles', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Chiffre daffaires', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Production stockée', 'TPO003');
INSERT INTO poste_mere (nom, id_type_poste) VALUES ('Production immobilisée', 'TPO003');
