-- 코드를 입력하세요
SELECT
    b.TITLE,
    b.BOARD_ID,
    r.REPLY_ID,
    r.WRITER_ID,
    r.CONTENTS,
    DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d') AS CREATED_DATE
FROM USED_GOODS_BOARD AS b
JOIN USED_GOODS_REPLY AS r
      ON r.BOARD_ID = b.BOARD_ID
WHERE b.CREATED_DATE >= '2022-10-01'
  AND b.CREATED_DATE <  '2022-11-01'
ORDER BY r.CREATED_DATE ASC, b.TITLE ASC;