CREATE OR REPLACE FUNCTION set_type_poste_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_type_poste IS NULL THEN
        NEW.id_type_poste := get_next_type_poste_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_type_poste
BEFORE INSERT ON type_poste
FOR EACH ROW
EXECUTE FUNCTION set_type_poste_id();

CREATE OR REPLACE FUNCTION set_bilan_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_bilan IS NULL THEN
        NEW.id_bilan := get_next_bilan_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_bilan
BEFORE INSERT ON bilan
FOR EACH ROW
EXECUTE FUNCTION set_bilan_id();

CREATE OR REPLACE FUNCTION set_poste_mere_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_poste_mere IS NULL THEN
        NEW.id_poste_mere := get_next_poste_mere_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_poste_mere
BEFORE INSERT ON poste_mere
FOR EACH ROW
EXECUTE FUNCTION set_poste_mere_id();

CREATE OR REPLACE FUNCTION set_poste_bilan_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_poste_bilan IS NULL THEN
        NEW.id_poste_bilan := get_next_poste_bilan_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_poste_bilan
BEFORE INSERT ON poste_bilan
FOR EACH ROW
EXECUTE FUNCTION set_poste_bilan_id();

CREATE OR REPLACE FUNCTION set_poste_fille_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_poste_fille IS NULL THEN
        NEW.id_poste_fille := get_next_poste_fille_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_poste_fille
BEFORE INSERT ON poste_fille
FOR EACH ROW
EXECUTE FUNCTION set_poste_fille_id();

CREATE OR REPLACE FUNCTION set_poste_bilan_details_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_poste_bilan_details IS NULL THEN
        NEW.id_poste_bilan_details := get_next_poste_bilan_details_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_poste_bilan_details
BEFORE INSERT ON poste_bilan_details
FOR EACH ROW
EXECUTE FUNCTION set_poste_bilan_details_id();

CREATE OR REPLACE FUNCTION set_categorie_etat_finance_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_categorie_etat_finance IS NULL THEN
        NEW.id_categorie_etat_finance := get_next_categorie_etat_finance_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_categorie_etat_finance
BEFORE INSERT ON categorie_etat_finance
FOR EACH ROW
EXECUTE FUNCTION set_categorie_etat_finance_id();

CREATE OR REPLACE FUNCTION set_poste_etat_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_poste_etat IS NULL THEN
        NEW.id_poste_etat := get_next_poste_etat_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_poste_etat
BEFORE INSERT ON poste_etat
FOR EACH ROW
EXECUTE FUNCTION set_poste_etat_id();

CREATE OR REPLACE FUNCTION set_etat_finance_id() RETURNS TRIGGER AS $$
BEGIN
    IF NEW.id_etat_finance IS NULL THEN
        NEW.id_etat_finance := get_next_etat_finance_id();
    END IF;
    RETURN NEW;
END;
$$ LANGUAGE plpgsql;

CREATE TRIGGER before_insert_etat_finance
BEFORE INSERT ON etat_finance
FOR EACH ROW
EXECUTE FUNCTION set_etat_finance_id();
