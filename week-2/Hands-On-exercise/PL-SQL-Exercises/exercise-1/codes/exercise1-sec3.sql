-- scenario 3 of exercise 1

DECLARE
    CURSOR due_loans_cursor IS
        SELECT l.LoanID, l.CustomerID, c.Name, l.EndDate
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

    v_loanID     Loans.LoanID%TYPE;
    v_customerID Loans.CustomerID%TYPE;
    v_name       Customers.Name%TYPE;
    v_endDate    Loans.EndDate%TYPE;

BEGIN
    OPEN due_loans_cursor;

    LOOP
        FETCH due_loans_cursor INTO v_loanID, v_customerID, v_name, v_endDate;
        EXIT WHEN due_loans_cursor%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ID ' || v_loanID || ' for customer "' || v_name ||
                             '" (ID: ' || v_customerID || ') is due on ' || TO_CHAR(v_endDate, 'YYYY-MM-DD'));
    END LOOP;

    CLOSE due_loans_cursor;
END;
/
