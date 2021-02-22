/*Populate table players*/
INSERT INTO players(id,name) VALUES (1, 'Player 1');
INSERT INTO players(id,name) VALUES (2, 'Player 2');
INSERT INTO players(id,name) VALUES (3, 'Player 3');

/*Populate table multimediacontents*/
INSERT INTO multimediacontents(id,name, length, artist) VALUES (1, 'Name 1',111,'Artist 1');
INSERT INTO multimediacontents(id,name, length, artist) VALUES (2, 'Name 2',222,'Artist 2');
INSERT INTO multimediacontents(id,name, length, artist) VALUES (3, 'Name 3',333,'Artist 3');

/*Populate table reproductions*/
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (1, 1,1,'2017-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (2, 1,2,'2017-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (3, 1,3,'2017-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (4, 2,1,'2017-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (5, 2,1,'2018-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (6, 2,1,'2019-10-12 21:22:23'); 
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (7, 3,1,'2017-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (8, 3,2,'2017-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (9, 3,3,'2017-10-12 21:22:23');
INSERT INTO reproductions(id,player_id, multimedia_content_id, moment) VALUES (10, 3,3,'2017-10-12 21:22:23');
