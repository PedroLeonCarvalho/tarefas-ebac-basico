

ALTER TABLE animal ADD cpf_recebedor VARCHAR(255) NOT NULL;
ALTER TABLE animal ADD CONSTRAINT fK_cpf_recebedor FOREIGN KEY (cpf_recebedor) REFERENCES funcionarios (cpf);

