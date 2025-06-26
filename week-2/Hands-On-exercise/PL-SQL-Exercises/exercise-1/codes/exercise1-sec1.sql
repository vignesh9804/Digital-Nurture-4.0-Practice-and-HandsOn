
-- scenario 1

DECLARE
    CURSOR customer_cursor IS
        SELECT CustomerID, Name, DOB FROM Customers;

    v_customerID   NUMBER;
    v_name         VARCHAR2(100);
    v_dob          DATE;
    v_age          NUMBER;

BEGIN
    OPEN customer_cursor;

    LOOP
        FETCH customer_cursor INTO v_customerID, v_name, v_dob;
        EXIT WHEN customer_cursor%NOTFOUND;

        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, v_dob) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = v_customerID;

            DBMS_OUTPUT.PUT_LINE('Discount given to: ' || v_name || ' (Age: ' || v_age || ')');
        END IF;

    END LOOP;

    CLOSE customer_cursor;

    COMMIT;
END;
/
