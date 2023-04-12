-- some test users
INSERT INTO house_estates.users (id, email, first_name, last_name, is_active, password)
VALUES (1, 'lorov@example.com', 'Lor', 'Lorov', 1, '57e7759fd2d59275fc3c3cd5dd2ace5013b39ee972999412f3f5f5c3382b6765c2571ef86648abe2');

INSERT INTO house_estates.towns (town)
VALUES ('KaraDere'),
       ('KodzhaKaq');

INSERT INTO house_estates.models (category, construction)
VALUES ('HOUSE', 'BRICK'),
       ('APPARTMENT', 'PANEL');

INSERT INTO house_estates.offers (category, construction, description, image_url, price, rooms, square_feet, town_id)
VALUES
    ('HOUSE', 'PANEL', 'Best house in the area', 'https://s42814.pcdn.co/wp-content/uploads/2020/09/iStock_185930591-scaled.jpg.optimal.jpg', 781, 7, 455, 1),
    ('APARTMENT', 'EPK', 'Best app in whole town', 'https://assets-news.housing.com/news/wp-content/uploads/2022/04/07013406/ELEVATED-HOUSE-DESIGN-FEATURE-compressed.jpg', 31, 3, 144, 2);

