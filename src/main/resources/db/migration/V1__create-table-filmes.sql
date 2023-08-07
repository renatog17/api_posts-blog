CREATE TABLE filmes (
    filme_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    data_lancamento DATE,
    url_img varchar(255)
);

