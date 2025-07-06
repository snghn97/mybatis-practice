CREATE TABLE Member (
    id BIGINT IDENTITY(1,1) PRIMARY KEY,
    username NVARCHAR(100) NOT NULL,
    phone NVARCHAR(20) NOT NULL
);

INSERT INTO Member (username, phone)
VALUES
    (N'홍길동', N'010-1234-5678'),
    (N'이영희', N'010-2345-6789'),
    (N'김철수', N'010-3456-7890');

SELECT * FROM Member;

DROP TABLE Member;