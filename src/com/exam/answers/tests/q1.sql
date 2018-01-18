SELECT name, votes, @rank := @rank + 1 as rank
FROM votes v, (SELECT @rank := 0 ) rnk order by votes desc;