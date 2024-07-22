
-- Passo 1: Remover a Coluna 'raca'
ALTER TABLE animal DROP COLUMN raca;

-- Passo 2: Adicionar a Coluna 'especie' com Restrição CHECK
ALTER TABLE animal ADD COLUMN especie VARCHAR(20) NOT NULL CHECK (especie IN ('CACHORRO', 'GATO'));
