CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department     IN VARCHAR2,
    p_bonus_percent  IN NUMBER
) AS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_bonus_percent / 100)
    WHERE Department = p_department;
    
    DBMS_OUTPUT.PUT_LINE('Bonus of ' || p_bonus_percent || '% applied to employees in department: ' || p_department);

    COMMIT;
END;
/

BEGIN
    UpdateEmployeeBonus('Loans', 10);
END;
/

select * from employees;