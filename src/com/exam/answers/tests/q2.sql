-- Capitalises the first letter of every word.
DROP FUNCTION IF EXISTS INITCAP;

DELIMITER $$

CREATE FUNCTION INITCAP(input VARCHAR(250))
  RETURNS VARCHAR(250) deterministic

BEGIN

  DECLARE output VARCHAR(250); 	-- Holds the final capitalised value.
  DECLARE prevChar VARCHAR(1); 	-- Holds the previous character in the loop.
  DECLARE curChar VARCHAR(1);  	-- Holds the current character in the loop.
  DECLARE pointer INT;		-- The index of the character in the loop.
  
  SET output = UCASE(LEFT(input, 1));
  SET pointer=1;
  SET prevChar = SUBSTRING(input, pointer, 1);
  SET curChar = "";
  
  elementLoop: LOOP
	SET pointer = pointer + 1;
    SET curChar = SUBSTRING(input, pointer, 1);
    
    IF prevChar = " " THEN
      SET output = CONCAT(output,UCASE(curChar));
    ELSE
      SET output = CONCAT(output,LCASE(curChar));
    END IF;
    
    SET prevChar = curChar;

    IF (pointer < LENGTH(input)) THEN
      ITERATE elementLoop;
    END IF;

    LEAVE elementLoop;
    
  END LOOP elementLoop;
  
  RETURN output;
END;
$$
DELIMITER ;

SELECT INITCAP(name) FROM country;