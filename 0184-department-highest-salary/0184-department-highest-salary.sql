# Write your MySQL query statement below
select Department.name AS Department ,Employee.name AS Employee,Employee.salary As Salary from employee
inner join Department on Employee.departmentId = Department.id
where (Employee.departmentId, Employee.salary ) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);

