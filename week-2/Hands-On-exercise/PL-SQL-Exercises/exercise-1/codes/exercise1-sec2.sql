-- secaniro 2

DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, Balance FROM Customers;

    v_customerID Customers.CustomerID%TYPE;
    v_balance    Customers.Balance%TYPE;

BEGIN
    OPEN cust_cursor;

    LOOP
        FETCH cust_cursor INTO v_customerID, v_balance;
        EXIT WHEN cust_cursor%NOTFOUND;

        IF v_balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 1
            WHERE CustomerID = v_customerID;
        ELSE
            UPDATE Customers
            SET IsVIP = 0
            WHERE CustomerID = v_customerID;
        END IF;
    END LOOP;

    CLOSE cust_cursor;

    COMMIT;
END;
/
