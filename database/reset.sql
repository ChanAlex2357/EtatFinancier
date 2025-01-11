\c postgres;
DROP DATABASE bilanfinancier;
CREATE DATABASE bilanfinancier;
\c bilanfinancier;
\i database/schema.sql
\i database/seq.sql
\i database/trigger.sql
\i database/data.sql