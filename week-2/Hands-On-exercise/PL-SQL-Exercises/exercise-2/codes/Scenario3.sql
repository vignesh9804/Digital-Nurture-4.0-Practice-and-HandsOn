CREATE OR REPLACE PROCEDURE TransferFunds (
    p_source_account_id IN NUMBER,
    p_target_account_id IN NUMBER,
    p_amount            IN NUMBER
) AS
    v_source_balance  NUMBER;
BEGIN
    SELECT Balance INTO v_source_balance
    FROM Accounts
    WHERE AccountID = p_source_account_id;

    IF v_source_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    UPDATE Accounts
    SET Balance = Balance - p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_source_account_id;

    UPDATE Accounts
    SET Balance = Balance + p_amount,
        LastModified = SYSDATE
    WHERE AccountID = p_target_account_id;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from Account ' || p_source_account_id || ' to Account ' || p_target_account_id);

END;
/

BEGIN
    TransferFunds(1, 2, 500);
END;
/

select * from accounts;
