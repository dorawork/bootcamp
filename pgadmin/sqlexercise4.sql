create table players (
    player_id integer not null unique, 
    group_id integer not null
);

create table matches (
    match_id integer not null unique, 
    first_player integer not null, 
    second_player integer not null, 
    first_score integer not null, 
    second_score integer not null
);

select * from matches
select * from players;
	
insert into players (player_id, group_id) values ('20', '2');
insert into players (player_id, group_id) values ('30', '1');
insert into players (player_id, group_id) values ('40', '3');
insert into players (player_id, group_id) values ('45', '1');
insert into players (player_id, group_id) values ('50', '2');
insert into players (player_id, group_id) values ('65', '1');

insert into matches (match_id, first_player, second_player, first_score, second_score) values ('1', '30','45','10','12');
insert into matches (match_id, first_player, second_player, first_score, second_score) values ('2', '20','50','5','5');
insert into matches (match_id, first_player, second_player, first_score, second_score) values ('13', '65','45','10','10');
insert into matches (match_id, first_player, second_player, first_score, second_score) values ('5', '30','65','3','15');
insert into matches (match_id, first_player, second_player, first_score, second_score) values ('42', '45','65','8','4');

WITH matches_highest_score AS (
    SELECT p.player_id, MAX(total_score) AS max_score
    FROM players p
    LEFT JOIN (
        SELECT m.first_player, m.second_player, SUM(m.first_score + m.second_score) AS total_score
        FROM matches m
        GROUP BY m.first_player, m.second_player
    ) AS ms ON p.player_id = ms.first_player OR p.player_id = ms.second_player
    GROUP BY p.player_id
)
SELECT p.player_id, COALESCE(mhs.max_score, 0) AS winner_score
FROM players p
LEFT JOIN matches_highest_score mhs ON p.player_id = mhs.player_id;