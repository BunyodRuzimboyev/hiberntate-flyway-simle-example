CREATE TABLE public.category
(
    id            BIGSERIAL PRIMARY KEY,
    category_name VARCHAR(255) NOT NULL,
    description   TEXT
);