# Write your MySQL query statement below
select x,y,z,
CASE   
    when x+y > z AND y+z > x AND x+z > y
    Then 'Yes'
    else 'No'
END AS triangle

from triangle;