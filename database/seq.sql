CREATE SEQUENCE seq_type_poste START 1;
CREATE SEQUENCE seq_bilan START 1;
CREATE SEQUENCE seq_poste_mere START 1;
CREATE SEQUENCE seq_poste_bilan START 1;
CREATE SEQUENCE seq_poste_fille START 1;
CREATE SEQUENCE seq_poste_bilan_details START 1;

CREATE SEQUENCE seq_categorie_etat_finance START 1;
CREATE SEQUENCE seq_poste_etat START 1;
CREATE SEQUENCE seq_etat_finance START 1;

CREATE OR REPLACE FUNCTION get_next_type_poste_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'TPO' || LPAD(nextval('seq_type_poste')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_bilan_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'BIL' || LPAD(nextval('seq_bilan')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_poste_mere_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'POM' || LPAD(nextval('seq_poste_mere')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_poste_bilan_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'POB' || LPAD(nextval('seq_poste_bilan')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_poste_fille_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'POF' || LPAD(nextval('seq_poste_fille')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_poste_bilan_details_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'PBD' || LPAD(nextval('seq_poste_bilan_details')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_categorie_etat_finance_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'CEF' || LPAD(nextval('seq_categorie_etat_finance')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_poste_etat_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'PEF' || LPAD(nextval('seq_poste_etat')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;

CREATE OR REPLACE FUNCTION get_next_etat_finance_id() RETURNS VARCHAR AS $$
BEGIN
    RETURN 'EFI' || LPAD(nextval('seq_etat_finance')::TEXT, 3, '0');
END;
$$ LANGUAGE plpgsql;
