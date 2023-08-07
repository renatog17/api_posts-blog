CREATE TABLE criticas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    critica VARCHAR(1000) NOT NULL,
    dataCritica DATE,
    filme_id BIGINT,
    FOREIGN KEY (filme_id) REFERENCES filmes(id)
);