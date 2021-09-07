create table products
(
    id   bigserial primary key,
    title text,
    company text,
    cost int
);

insert into products(title, company, cost)
values ('Avocado', 'Fruits and Co', 10),
       ('Banana', 'Turkey Fruits Company', 4),
       ('Kiwi', 'Thai plants', 7),
       ('Pomegranate', 'Azerbaijan export', 15),
       ('Orange', 'Greece foods', 3);