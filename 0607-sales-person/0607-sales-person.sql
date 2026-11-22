# Write your MySQL query statement below
select name from SalesPerson
where SalesPerson.sales_id NOT IN (select  Orders.sales_id from Company
join Orders on Company.com_id = Orders.com_id
where name like "RED%"
);