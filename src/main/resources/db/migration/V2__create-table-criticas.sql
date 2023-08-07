CREATE TABLE criticas (
    critica_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    critica VARCHAR(1000) NOT NULL,
    data_critica DATE,
    filme_id BIGINT,
    FOREIGN KEY (filme_id) REFERENCES filmes(filme_id)
);