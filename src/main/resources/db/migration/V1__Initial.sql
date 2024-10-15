CREATE TABLE IF NOT EXISTS public.category
(
    id            BIGSERIAL PRIMARY KEY,
    category_name VARCHAR(255) NOT NULL,
    description   TEXT
);

CREATE TABLE IF NOT EXISTS public.product
(
    product_id   BIGSERIAL PRIMARY KEY,
    product_name VARCHAR(255) NOT NULL,
    description  TEXT,
    price        NUMERIC(10, 2),
    category_id  BIGINT
);
