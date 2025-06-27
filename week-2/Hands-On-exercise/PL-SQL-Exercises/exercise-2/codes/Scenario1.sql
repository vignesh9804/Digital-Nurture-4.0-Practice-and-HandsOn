CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    FOR acc_rec IN (
        SELECT AccountID, Balance
        FROM Accounts
        WHERE AccountType = 'Savings'
    ) LOOP
        UPDATE Accounts
        SET Balance = acc_rec.Balance + (acc_rec.Balance * 0.01),
            LastModified = SYSDATE
        WHERE AccountID = acc_rec.AccountID;

        DBMS_OUTPUT.PUT_LINE('Interest applied to Account ID ' || acc_rec.AccountID);
    END LOOP;

    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/
